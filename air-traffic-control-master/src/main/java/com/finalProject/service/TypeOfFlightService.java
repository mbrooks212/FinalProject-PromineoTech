/**
 * 
 */
package com.finalProject.service;

import java.util.List;
import com.finalProject.model.TypeOfFlight;

/**
 * @author coope
 *
 */
public interface TypeOfFlightService {
  TypeOfFlight saveTypeOfFlight(TypeOfFlight typeOfFlight);

  List<TypeOfFlight> getAllTypeOfFlights();
  
  TypeOfFlight getTypeOfFlightsByID(int id);
  
  TypeOfFlight updateTypeOfFlight(TypeOfFlight typeOfFlight, int id);
  
  void deleteTypeOfFlight(int id);
}