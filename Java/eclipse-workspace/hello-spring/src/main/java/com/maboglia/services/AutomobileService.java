package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Automobile;

public interface AutomobileService {

	List<Automobile> getAutomobili();
	Automobile getAutomobileById(int id);
	Automobile addAutomobile(Automobile a);
	Automobile updateAutomobile(Automobile a);
	void deleteAutomobile(int id);
	
}
