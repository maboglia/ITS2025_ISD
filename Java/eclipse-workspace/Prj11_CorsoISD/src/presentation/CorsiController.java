package presentation;

import java.util.List;

import model.Corso;
import services.CorsiService;

public class CorsiController {

	private CorsiService service = new CorsiService();
	
	public String tuttiICorsi(){

		String risposta = null;
		
		risposta += "<ul>\n";
		
		for (Corso c : service.getCorsi()) {
			risposta += "<li>"  + c.getNome() + "</li>\n";
		}
		risposta += "</ul>\n";
		
		
		return risposta;
	}
	
}
