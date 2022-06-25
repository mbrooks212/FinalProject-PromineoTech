package com.finalProject.service;

import java.util.List;
import com.finalProject.model.Airports;
//Michael Brooks

public interface AirportService {
	
	//post
	Airports saveAirport(Airports airports);
		
	//get all
	List<Airports> getAllAirports();
		
	//get by id
	Airports getAirportById(int id);
		
	//update
	Airports updateAirport(Airports airports, int id);
		
	//delete
	void deleteAirport(int id);
}