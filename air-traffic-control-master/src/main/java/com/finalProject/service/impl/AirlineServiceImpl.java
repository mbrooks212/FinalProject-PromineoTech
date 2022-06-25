package com.finalProject.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.exception.ResourceNotFoundException;
import com.finalProject.model.Airlines;
import com.finalProject.repository.AirlineRepository;
import com.finalProject.service.AirlineService;
//Michael Brooks

@Service
public class AirlineServiceImpl implements AirlineService {
	private  AirlineRepository airlineRepository;
	@Autowired
	public AirlineServiceImpl(AirlineRepository airlineRepository) {
		super();
		this.airlineRepository = airlineRepository;
	}
	//post
	@Override
	public Airlines saveAirline(Airlines airlines) {
		return airlineRepository.save(airlines);
	}
	//get all
	@Override
	public List<Airlines> getAllAirlines() {
		return airlineRepository.findAll();
	}
	//get by id
	@Override
	public Airlines getAirlineById(int id) {
		return airlineRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Airlines", "id", id));
	}
	//update
	@Override
	public Airlines updateAirline(Airlines airlines, int id) {
		Airlines existingAirline = airlineRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Airlines", "id", id));
		existingAirline.setAirline_name(airlines.getAirline_name());
		airlineRepository.save(existingAirline);
		return existingAirline;
	}
	//delete
	@Override
	public void deleteAirline(int id) {
		Airlines existingAirline = airlineRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Airlines", "id", id));
		airlineRepository.deleteById(id);
	}
}