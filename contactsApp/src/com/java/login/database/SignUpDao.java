package com.java.login.database;



import java.sql.*;

import com.java.login.bean.SignUpBean;

public class SignUpDao {

	public static int signUp(SignUpBean s){
		int status=0;
		try{
			Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?)");
			ps.setString(1,s.getEmail());
			ps.setString(2,s.getPassword());
			ps.setString(3,s.getSecretCode());
			
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
}
