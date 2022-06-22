/**
 * 
 */
package com.finalProject.PromineoTech.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.PromineoTech.exception.ResourceNotFoundException;
import com.finalProject.PromineoTech.model.FuelRequired;
import com.finalProject.PromineoTech.model.TypeOfFlight;
import com.finalProject.PromineoTech.repository.FuelRequiredRepository;
import com.finalProject.PromineoTech.service.FuelRequiredService;

/**
 * @author coope
 *
 */
@Service
public class FuelRequiredServiceImpl implements FuelRequiredService{
  
  private FuelRequiredRepository fuelRequiredRepository;
 
  @Autowired
  public FuelRequiredServiceImpl(FuelRequiredRepository fuelRequiredRepository) {
    super();
    this.fuelRequiredRepository = fuelRequiredRepository;
  }

  @Override
  public FuelRequired saveFuelRequired(FuelRequired fuelRequired) {
    
    return fuelRequiredRepository.save(fuelRequired);
  }

  @Override
  public List<FuelRequired> getAllFuelRequired(){
    return fuelRequiredRepository.findAll();
  }

  @Override
  public FuelRequired getFuelRequiredByID(int id) {
    return fuelRequiredRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("FuelRequired", "id", id));
  }

  @Override
  public FuelRequired updateFuelRequired(FuelRequired fuelRequired, int id) {
    FuelRequired existingFuelRequired = fuelRequiredRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("FuelRequired", "id", id));
    
    existingFuelRequired.setId(fuelRequired.getId());
    existingFuelRequired.setAmount_of_fuel(fuelRequired.getAmount_of_fuel());
    existingFuelRequired.setModel(fuelRequired.getModel());
    
    fuelRequiredRepository.save(existingFuelRequired);
    
    return existingFuelRequired;
  }

  @Override
  public void deleteFuelRequired(int id) {
    FuelRequired existingFuelRequired = fuelRequiredRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("FuelRequired", "id", id));
    fuelRequiredRepository.deleteById(id);
  }
}
