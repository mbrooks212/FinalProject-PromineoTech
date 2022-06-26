package com.finalProject.service;

import java.util.List;
import com.finalProject.model.Flights;
//Mariah Jemmings
public interface FlightsService {
  
  Flights saveFlight (Flights flight);

  List<Flights> getAllFlights();
 
  Flights getFlightById(int id);
  
  Flights updateFlight (Flights flight, int id);
  
  void deleteFlight(int id);
}