package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AutosaloneService;
import services.AutosaloneServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.json.JSONArray;

import entities.Automobile;

@WebServlet("/api")
public class AutosaloneREST extends HttpServlet {
	
	private AutosaloneService service;

	public AutosaloneREST() {
		System.out.println("Servlet API creata!!");
		this.service = new AutosaloneServiceImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter stampante = response.getWriter();
		
		List<Automobile> automobili = service.getAutomobili();
		JSONArray array = null;
		if (request.getParameter("id")!=null) {
			int id = Integer.parseInt(request.getParameter("id"));
			List<Automobile> autoById = automobili
					.stream()
					.filter(a -> a.getId() == id)
					.toList();
			 array = new JSONArray(autoById);
		} 
		else if (request.getParameter("min")!=null && request.getParameter("max")!=null ) {
			double min = Double.parseDouble(request.getParameter("min"));
			double max = Double.parseDouble(request.getParameter("max"));
			
			List<Automobile> autoById = automobili
					.stream()
					.filter(a -> a.getPrezzo() >= min && a.getPrezzo()<=max)
					.toList();
			 array = new JSONArray(autoById);
			
		}
		else {
			 array = new JSONArray(automobili);
		}
		
		
		
		response.setContentType("application/json");
		stampante.print(array.toString());
		
		
	}

	
}
