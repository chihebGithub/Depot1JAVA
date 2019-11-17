package com.JspApplication.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercice4
 */
@WebServlet("/Exercice4")
public class Exercice4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		response.getWriter().append("<!DOCTYPE html> <html><head><title>Exercice 4 </title>")
		.append("<bodu><p>")
		.append("nom :  <strong>").append(((String) request.getAttribute("nom")).toUpperCase()).append("</strong>")
		.append("</p><p>")
		.append("prenom : ")
		.append(request.getAttribute("prenom").toString())
		.append("</p><p> sexe : ").append(request.getAttribute("sexe").toString())
		.append("</p><p> Commentaire :").append(request.getAttribute("commentaire").toString())
		.append("</body></html>")
	    ;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("nom",request.getParameter("txt_nom"));
		request.setAttribute("prenom",request.getParameter("txt_prenom"));
		request.setAttribute("sexe",request.getParameter("rd_sexe"));
		request.setAttribute("commentaire",request.getParameter("txt_com"));
		
		
		doGet(request, response);
	}

}
