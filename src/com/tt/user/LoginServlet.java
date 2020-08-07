package com.tt.user;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*
 * 
 *LoginServlet is to login web page
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4678510583834699129L;

	@Override
	public  void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		if(userName.equals("seshananda")&& password.equals("seshananda")) {
			HttpSession session =request.getSession();
			session.setAttribute("UserName",userName);
			response.sendRedirect("WelcomeServlet");
		}
	}

}
