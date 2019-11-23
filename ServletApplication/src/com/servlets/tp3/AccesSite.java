package com.servlets.tp3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AccesSite
 */
@WebServlet("/AccesSite")
public class AccesSite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccesSite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String login =(String) session.getAttribute("log");
		// TODO Auto-generated method stub
				response.setContentType("text/html");
				response.setCharacterEncoding( "UTF-8" );
				response.getWriter().append("<!DOCTYPE html> <html><head><title>Deconnection </title>")
				.append("<bodu><p>")
				.append("<form action=\"Deconnection\" method=\"get\">")
				
				.append("Bonjour :  <strong>").append(login.toUpperCase())
				.append("</strong>")
				.append("</p>")
				.append("<div class=\"scrollmenu\">" + 
						"  <a href=\"#home\">Home</a>" +    
						"  <a href=\"#news\">News</a>" + 
						"  <a href=\"#contact\">Contact</a>" + 
						"  <a href=\"#about\">About</a>" + 
						"  <a href=\"#support\">Support</a>" + 
						"  <a href=\"#blog\">Blog</a>" + 
						"  <a href=\"#tools\">Tools</a>" + 
						"</div").append("<br> <div>")
				.append("<input type=\"submit\" value=\"déconnection\" />")
				.append("</div>")
				.append("</form>")
				.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
