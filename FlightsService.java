package com.finalProject.service.impl;

import java.util.List;
import com.finalProject.model.Flights;

public interface FlightsService {
  
  Flights saveFlight (Flights flight);

  List<Flights> getAllFlights();
 
  Flights getFlightById(int id);
  
  Flights updateFlight (Flights flight, int id);
  
  void deleteFlight(int id);
}
