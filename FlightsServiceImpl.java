package com.finalProject.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.exception.ResourceNotFoundException;
import com.finalProject.model.Flights;
import com.finalProject.service.repository.FlightsRepository;


@Service
public class FlightsServiceImpl implements FlightsService {

 
  private FlightsRepository flightsRepository;
  @Autowired
  public FlightsServiceImpl (FlightsRepository flightsRepository) {
    super();
    this.flightsRepository=flightsRepository;
  }


  @Override
  public List<Flights> getAllFlights() {
    // TODO Auto-generated method stub
    return flightsRepository.findAll();
  }

  @Override
  public Flights saveFlight(Flights flight) {
    // TODO Auto-generated method stub
    return flightsRepository.save(flight);
  }


  @Override
  public Flights getFlightById(int id) {
    // TODO Auto-generated method stub
    return flightsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Flights", "Id", id));

}


  @Override
  public Flights updateFlight(Flights flight, int id) {
    // TODO Auto-generated method stub
    Flights existingFlight = flightsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Flights", "Id", id));
    
    existingFlight.setId(flight.getId());
    existingFlight.setDate(flight.getDate());
    existingFlight.setTime(flight.getTime());
    existingFlight.setAirlines_id(flight.getAirlines_id());
    existingFlight.setAirports_id(flight.getAirports_id());
    
    flightsRepository.save(existingFlight);
    
    return existingFlight;
  }


  @Override
  public void deleteFlight(int id) {
    Flights existingFlight = flightsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Flights", "Id", id));
    flightsRepository.deleteById(id);}}
    

