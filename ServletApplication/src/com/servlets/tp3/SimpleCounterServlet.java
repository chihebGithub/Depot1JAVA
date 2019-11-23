package com.servlets.tp3;


import java.io.IOException;

import java.util.Hashtable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SimpleCounterServlet
 */
@WebServlet("/SimpleCounterServlet")
public class SimpleCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	Hashtable<String, String> userAuthorized = new Hashtable<String,String>();
	public void init() throws ServletException {
		
		
		userAuthorized.put("admin", "admin");
		userAuthorized.put("commercial", "commercial");
		userAuthorized.put("invite", "invite");
		
		
		}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		HttpSession session = request.getSession();
		String login = request.getParameter("iduser");
		String pass = request.getParameter("password");
		if ((userAuthorized.get(login) != null && userAuthorized.get(login).equals(pass)))
		
		{       
		
		 session.setAttribute("log", login);
			 RequestDispatcher dispatcher = request.getRequestDispatcher("AccesSite");
			 dispatcher.forward(request, response); }
			
		else{
			 RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			 dispatcher.forward(request, response);
		   }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
