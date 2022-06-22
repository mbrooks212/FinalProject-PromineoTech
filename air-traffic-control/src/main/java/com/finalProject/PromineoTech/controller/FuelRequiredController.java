/**
 * 
 */
package com.finalProject.PromineoTech.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.finalProject.PromineoTech.model.FuelRequired;
import com.finalProject.PromineoTech.service.FuelRequiredService;

/**
 * @author coope
 *
 */
@RestController
@RequestMapping("/air_traffic_control/fuel_required")
public class FuelRequiredController {
  
  private FuelRequiredService fuelRequiredService;
  
  public FuelRequiredController(FuelRequiredService FuelRequiredService) {
    super();
    this.fuelRequiredService = FuelRequiredService;
  }
  
  @PostMapping()
  public ResponseEntity<FuelRequired> saveFuelRequired(@RequestBody FuelRequired fuelRequired) {
    return new ResponseEntity<FuelRequired>(fuelRequiredService.saveFuelRequired(fuelRequired), HttpStatus.CREATED);
  }
}
