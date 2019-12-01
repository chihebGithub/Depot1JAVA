package com.JspApplication.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RefreshServlet")
public class JSPexercice2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setIntHeader("Refresh",5);
		response.getWriter().append("<html><head><title>time</title></head><body>"
				+ "<p style=\"color:blue\">  Current Time :</p> <p>").append(new Date().toString()+""
						+ "</body></html>").append("");
		 response.sendRedirect("http://www.ipst.edunet.tn/pluginfile.php/86981/mod_resource/content/0/Chapitre%201%20ADS.pdf");
		
	}

}
