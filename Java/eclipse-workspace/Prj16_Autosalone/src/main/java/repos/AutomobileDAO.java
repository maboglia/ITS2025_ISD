package repos;

import java.util.Map;

import entities.Automobile;

public interface AutomobileDAO {

	String FIND_ALL = "SELECT * FROM automobili";
	
	Map<Integer, Automobile> getAutomobili();
	
}
