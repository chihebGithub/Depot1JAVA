package com.JspApplication.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Jspexercice1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>Test</title>");
		out.println("<style> table { width:100%;} table, th,"
				+ " td { border: 1px solid black;border-collapse: collapse;}"
				+ "th, td {padding: 15px;text-align: left;}"
				+ "	table#t01 tr:nth-child(even) {background-color: #eee;}"
				+ "table#t01 tr:nth-child(odd) {background-color: #fff;}"
				+ "table#t01 th {background-color: blue; color: </style>");
	
		out.println("</head>");
		out.println("<body>");
		out.print("<table id=\"t01\">  "  + "<tr>  " 
		           + "<th> Méthode  </th>"+ "<th> Résultat  </th>" + "</tr>" +"<tr>"+ "<td>"
		           + "Méthode d'envoi : </td>"
		           + "<td>" + request.getMethod()
				   +"</td></tr>"+""
		           + "<tr><td>URI de la ressource </td>" + "<td>"   + request.getRequestURI()
				   + "</td></tr>"
				   + "<tr><td>Protocole de CX :</td>"+ "<td>" + request.getProtocol()
				   + "</td></tr>"
				   + "<tr><td>Nom serveur</td>" + "<td>"+ request.getServerName()
				   + "</td></tr>"
				   + "<tr><td>Adresse Serveur</td> " + "<td>" +  request.getRemoteAddr() 
				   + "</td></tr>"+ "<tr><td>Port http</td>" + "<td>" + request.getServerPort()
				   + "</td></tr></table>"+ "</body></html>"
				   	
				   
				
				
				);
	
	}
	
	

}
