package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Automobile;
import com.maboglia.repos.AutomobileDAO;

@Service
public class AutomobileServiceImpl implements AutomobileService {

	@Autowired
	private AutomobileDAO dao;
	
	@Override
	public List<Automobile> getAutomobili() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Automobile getAutomobileById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Automobile addAutomobile(Automobile a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

	@Override
	public Automobile updateAutomobile(Automobile a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAutomobile(int id) {
		// TODO Auto-generated method stub

	}

}
