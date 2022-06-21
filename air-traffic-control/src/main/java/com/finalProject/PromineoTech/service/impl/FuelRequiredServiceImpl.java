/**
 * 
 */
package com.finalProject.PromineoTech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.PromineoTech.model.FuelRequired;
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


}
