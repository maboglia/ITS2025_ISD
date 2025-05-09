package presentation;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AutosaloneService;
import services.AutosaloneServiceImpl;

@WebServlet("/public")
public class AutosaloneMVC extends HttpServlet{

	private AutosaloneService service;
	
	public AutosaloneMVC() {
		this.service = new AutosaloneServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("header.jsp").include(request, response);

//		final String TITOLO = "Automobili";
		
		request.setAttribute("TITOLO", "Automobili");
		request.setAttribute("automobili", this.service.getAutomobili());

		request.getRequestDispatcher("content.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);

	}
	
}
