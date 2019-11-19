package com.servlets.tp2;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")  
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		response.getWriter().append("<!DOCTYPE html> <html><head><title>AdminPizza </title>")
		.append("<bodu><p>")
		.append("Type Pizza :  <strong>").append(((String) request.getAttribute("Specialite")).toUpperCase()).append("</strong>")
		.append("</p><p>")
		.append("Prix : ")
		.append(request.getAttribute("Prix").toString())
		.append("</body></html>");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext my_context = this.getServletContext();
		my_context.setAttribute("Specialite",request.getParameter("pizza"));
		my_context.setAttribute("prixpizza",request.getParameter("txt_prix"));
		my_context.setAttribute("dateJour", new Date());
		request.setAttribute("Specialite",request.getParameter("pizza"));
		request.setAttribute("Prix",request.getParameter("txt_prix"));
		
		
		doGet(request, response);
	}

}
