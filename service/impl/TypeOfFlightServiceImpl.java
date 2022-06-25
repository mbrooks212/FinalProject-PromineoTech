/**
 * 
 */
package com.finalProject.PromineoTech.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.PromineoTech.exception.ResourceNotFoundException;
import com.finalProject.PromineoTech.model.TypeOfFlight;
import com.finalProject.PromineoTech.repository.TypeOfFlightRepository;
import com.finalProject.PromineoTech.service.TypeOfFlightService;

/**
 * @author coope
 *
 */
@Service
public class TypeOfFlightServiceImpl implements TypeOfFlightService {
  
  private TypeOfFlightRepository typeOfFlightRepository;
  
  @Autowired
  public TypeOfFlightServiceImpl(TypeOfFlightRepository typeOfFlightRepository) {
    super();
    this.typeOfFlightRepository = typeOfFlightRepository;
  }
  
  @Override
  public TypeOfFlight saveTypeOfFlight(TypeOfFlight typeOfFlight) {
    
    return typeOfFlightRepository.save(typeOfFlight);
  }

  @Override
  public List<TypeOfFlight> getAllTypeOfFlights(){
    return typeOfFlightRepository.findAll();
  }

  @Override
  public TypeOfFlight getTypeOfFlightsByID(int id) {
    return typeOfFlightRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("TypeOfFlight", "id", id));
  }

  @Override
  public TypeOfFlight updateTypeOfFlight(TypeOfFlight typeOfFlight, int id) {
    TypeOfFlight existingTypeOfFlight = typeOfFlightRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("TypeOfFlight", "id", id));
    
    existingTypeOfFlight.setAirline(typeOfFlight.getAirline());
    existingTypeOfFlight.setAirport(typeOfFlight.getAirport());
    existingTypeOfFlight.setFlight(typeOfFlight.getFlight());
    
    typeOfFlightRepository.save(existingTypeOfFlight);
    
    return existingTypeOfFlight;
  }

  @Override
  public void deleteTypeOfFlight(int id) {
    TypeOfFlight existingTypeOfFlight = typeOfFlightRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("TypeOfFlight", "id", id));
    typeOfFlightRepository.deleteById(id);
  }
  
}
