package com.trycoding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trycoding.dto.User;
import com.trycoding.servic.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		
		out.print("Al slam alaykom !!! ");
		LoginService loginService = new LoginService();
		String userId , thePass ; 
		userId =request.getParameter("userId");
		thePass = request.getParameter("password");
		
		boolean result = loginService.authenticate(userId, thePass);
//		
//		out.print("    " +result);
		
		if(result) {
			
			User user =loginService.getUserDetails(userId);
			
			//when u use  send redirect 
			request.getSession().setAttribute("user", user);
			response.sendRedirect("success.jsp");
			
			//when u use dispatcher  don't need to session because data exist with request
			
//			request.setAttribute("user", user);
//			RequestDispatcher requestDispatcer= request.getRequestDispatcher("success.jsp");
//			requestDispatcer.forward(request, response);
			return;
		}
		else {
			
			response.sendRedirect("login.jsp");
			return ; 
		}
		
		
	}

}
