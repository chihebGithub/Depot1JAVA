package com.servlets.tp2;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Hashtable;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientPizzaServlet
 */
@WebServlet("/ClientPizzaServlet")
public class ClientPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext my_context = this.getServletContext();
		Date day = (Date)my_context.getAttribute("dateJour");
		Double prixPizza =Double.parseDouble(my_context.getAttribute("prixpizza").toString());
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String today = df.format(day);
		String b=request.getAttribute("myprix").toString();
		Double prixfinal =prixPizza+Double.parseDouble(b);
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		response.getWriter().append("<!DOCTYPE html> <html><head><title>ClientPizza </title>")
		.append("<body><p>").append("Date : ").append(today).append("</p><p>")
		.append("vous avez choisis :  <strong>").append(((String)my_context.getAttribute("Specialite")).toUpperCase()).append("</strong>")
		.append("</p><p>").append("votre dessert :").append(request.getAttribute("dessert").toString()).append("</p><p>")
		.append("Prix total : ")
		.append(prixfinal.toString())
		.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("dessert",request.getParameter("dessert"));
		request.setAttribute("Quantite",request.getParameter("txt_qt"));
		Hashtable<String,Double> prix= new Hashtable <String,Double>();
		prix.put("italien",1000.000);
		prix.put("fraise",1000.500);
		prix.put("banane",2000.300);
		request.setAttribute("myprix",(prix.get(request.getParameter("dessert").toString()) 
				* (Integer.parseInt(request.getParameter("txt_qt")))));
		doGet(request, response);
	}

}
