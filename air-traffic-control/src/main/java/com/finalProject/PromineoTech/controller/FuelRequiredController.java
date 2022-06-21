/**
 * 
 */
package com.finalProject.PromineoTech.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
