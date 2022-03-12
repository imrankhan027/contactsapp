package com.java.login.web;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.login.bean.SignUpBean;
import com.java.login.database.SignUpDao;





@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SignUpDao sDao;

	public void init() {
		sDao = new SignUpDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
        String secretCode = request.getParameter("scode");
		SignUpBean sBean = new SignUpBean();
		sBean.setEmail(email);
		sBean.setPassword(password);
        sBean.setSecretCode(secretCode);

		if(email.isEmpty() || password.isEmpty() || secretCode.isEmpty())
                 {
                           RequestDispatcher req = request.getRequestDispatcher("signUp.jsp");
                           req.include(request, response);
                 }
                 else
                 {         if(sDao.signUp(sBean)==1){
                	 response.sendRedirect("signupsuccess.jsp");
                	// RequestDispatcher req = request.getRequestDispatcher("signupsuccess.jsp");
                           //req.forward(request, response);
                           }
                           else
                           {
                        		 response.sendRedirect("signUp.jsp");
                        	  //RequestDispatcher req = request.getRequestDispatcher("signUp.jsp");
                               //req.include(request, response);
                           }
                           
                 }
	}
}
