package services;

import java.util.ArrayList;
import java.util.List;

import entities.Automobile;
import repos.AutomobileDAO;
import repos.AutomobileDAOImpl;

public class AutosaloneServiceImpl implements AutosaloneService {

	private AutomobileDAO dao;
	
	public AutosaloneServiceImpl() {
		this.dao = new AutomobileDAOImpl();
	}
	
	@Override
	public List<Automobile> getAutomobili() {
		
		return new ArrayList<>(dao.getAutomobili().values());
	}

}
