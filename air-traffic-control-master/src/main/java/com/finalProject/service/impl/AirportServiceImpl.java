package com.finalProject.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.exception.ResourceNotFoundException;
import com.finalProject.model.Airports;
import com.finalProject.repository.AirportRepository;
import com.finalProject.service.AirportService;
//Michael Brooks

@Service
public class AirportServiceImpl implements AirportService {
	private  AirportRepository airportRepository;
	@Autowired
	public AirportServiceImpl(AirportRepository airportRepository) {
		super();
		this.airportRepository = airportRepository;
	}
	//post
	@Override
	public Airports saveAirport(Airports airports) {
		return airportRepository.save(airports);
	}
	//get all
	@Override
	public List<Airports> getAllAirports() {
		return airportRepository.findAll();
	}
	//get by id
	@Override
	public Airports getAirportById(int id) {
		return airportRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Airports", "id", id));
	}
	//update
	@Override
	public Airports updateAirport(Airports airports, int id) {
		Airports existingAirport = airportRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Airports", "id", id));
		existingAirport.setAirport_name(airports.getAirport_name());
		airportRepository.save(existingAirport);
		return existingAirport;
	}
	//delete
	@Override
	public void deleteAirport(int id) {
		Airports existingAirport = airportRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Airports", "id", id));
		airportRepository.deleteById(id);
	}
}