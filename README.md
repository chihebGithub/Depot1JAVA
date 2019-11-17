//Exercice 1

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
  
  
  //Exercice 2
  @WebServlet("/RefreshServlet")
public class JSPexercice2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setIntHeader("Refresh",10);
		response.getWriter().append("<html><head><title>time</title></head><body>"
				+ "<p style=\"color:blue\">  Current Time :</p> <p>").append(new Date().toString()+""
						+ "</body></html>");
	}

}

//Exercice 3
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
//Exercice 4

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














  
  
  
  
  
  
  
  
  
  
  
