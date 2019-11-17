package com.JspApplication.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RechercheNet")
public class Exercice3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 if(request.getParameter("rd_rech").equals("Yahoo"))
	        {
			 response.sendRedirect("http://www.yahoo.com/search?p="+request.getParameter("txt_recherche"));
	        }else {
	        	response.sendRedirect("http://www.google.com/search?q="+request.getParameter("txt_recherche"));
	        }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
       request.setAttribute("rd_rech",request.getParameter("rd_rech"));
       request.setAttribute("txt_recherche",request.getParameter("txt_recherche"));
		doGet(request, response);
	}

}
