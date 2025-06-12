<%@ include file="header.jsp" %>

	<h1>Hello Tomcat, my friend!</h1>
	
	<ul id="listaProdotti">
	</ul>

	

	<%
		//scriptlet
		String s = "ITS 2025";
		out.print("<h2>" + s + "</h2>");
		out.print(session.getAttribute("logged"));
	%>
	
	<h3><%= s %></h3>

	<%
		if (request.getParameter("pagina")!=null){
			
			String pagina = request.getParameter("pagina");
			
			switch(pagina){
			case "pagina1":
				out.print("Hai scelto pagina 1");
				break;
			case "pagina2":
				out.print("Hai scelto pagina 2");
				break;
			default :
				out.print("Hai scelto una pagina inesistente");
				break;
			}
		}
	%>


<%@ include file="footer.jsp" %>

