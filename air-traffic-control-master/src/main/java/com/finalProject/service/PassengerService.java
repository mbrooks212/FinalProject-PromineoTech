package com.finalProject.service;

import java.util.List;
import com.finalProject.model.Passengers;

public interface PassengerService {
  
  Passengers savePassenger (Passengers passenger);

  List<Passengers> getAllPassengers();
 
  Passengers getPassengerById(int id);
  
  Passengers updatePassenger (Passengers passenger, int id);
  
  void deletePassenger(int id);
}