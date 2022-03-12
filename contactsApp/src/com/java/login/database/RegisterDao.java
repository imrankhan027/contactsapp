package com.java.login.database;


import java.sql.*;

import com.java.login.bean.ContactUserBean;

public class RegisterDao {

	public static int register(ContactUserBean contact){
		int status=0;
		try{
			Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into contactsRegister values(?,?,?)");
			ps.setString(1,contact.getCname());
			ps.setString(2,contact.getCnumber());
			ps.setString(3,contact.getCemail());
			
			status=ps.executeUpdate();
		}catch(Exception e){}
		
		return status;
	}
}
