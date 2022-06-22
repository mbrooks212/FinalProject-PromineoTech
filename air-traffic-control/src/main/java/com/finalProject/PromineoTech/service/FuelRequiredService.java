/**
 * 
 */
package com.finalProject.PromineoTech.service;

import java.util.List;
import com.finalProject.PromineoTech.model.FuelRequired;

/**
 * @author coope
 *
 */
public interface FuelRequiredService {
  FuelRequired saveFuelRequired(FuelRequired fuelRequired);

  List<FuelRequired> getAllFuelRequired();
  
  FuelRequired getFuelRequiredByID(int id);
  
  FuelRequired updateFuelRequired(FuelRequired fuelRequired, int id);
  
  void deleteFuelRequired(int id);
}
