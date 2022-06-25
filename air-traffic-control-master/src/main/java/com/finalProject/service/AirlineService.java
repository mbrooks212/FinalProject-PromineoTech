package com.finalProject.service;

import java.util.List;
import com.finalProject.model.Airlines;
//Michael Brooks

public interface AirlineService {
	
	//post
	Airlines saveAirline(Airlines airlines);
	
	//get all
	List<Airlines> getAllAirlines();
	
	//get by id
	Airlines getAirlineById(int id);
	
	//update
	Airlines updateAirline(Airlines airlines, int id);
	
	//delete
	void deleteAirline(int id);
}