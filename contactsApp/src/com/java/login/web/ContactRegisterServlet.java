package com.java.login.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.login.bean.ContactUserBean;
import com.java.login.database.RegisterDao;

@WebServlet("/contact_register")
public class ContactRegisterServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
	private RegisterDao registerDao;

	public void init() {
		registerDao = new RegisterDao();
	}
          protected void doPost(HttpServletRequest request, HttpServletResponse response)                  throws ServletException, IOException {
                 
                 String cname = request.getParameter("cname");
                 String cnumber = request.getParameter("cnumber");
                 String cemail = request.getParameter("cemail");
                 ContactUserBean userBean = new ContactUserBean();
                userBean.setCname(cname);
                userBean.setCnumber(cnumber);
                userBean.setCemail(cemail);
                 
                                  
                 if(cname.isEmpty() || cnumber.isEmpty() || cemail.isEmpty())
                 {
                           RequestDispatcher req = request.getRequestDispatcher("contactRegister.jsp");
                           req.include(request, response);
                 }
                 else
                 {         if(registerDao.register(userBean)==1){
                           RequestDispatcher req = request.getRequestDispatcher("contactRegisterSuccess.jsp");
                           req.forward(request, response);
                           }
                           else
                           {
                                RequestDispatcher req = request.getRequestDispatcher("contactRegister.jsp");
                               req.include(request, response);
                           }
                           
                 }
        }
 
}