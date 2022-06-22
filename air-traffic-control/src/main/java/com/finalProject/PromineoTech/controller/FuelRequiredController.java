/**
 * 
 */
package com.finalProject.PromineoTech.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
  @GetMapping
  public List<FuelRequired> getAllFuelRequired(){
    return fuelRequiredService.getAllFuelRequired();
  }
  @GetMapping("{id}")
  public ResponseEntity<FuelRequired> getFuelRequiredById(@PathVariable("id") int id){
    return new ResponseEntity<FuelRequired>(fuelRequiredService.getFuelRequiredByID(id), HttpStatus.OK);
  }
  @PutMapping("{id}")
  public ResponseEntity<FuelRequired> updateFuelRequired(@PathVariable("id") int id, @RequestBody FuelRequired fuelRequired){
  return new ResponseEntity<FuelRequired>(fuelRequiredService.updateFuelRequired(fuelRequired, id), HttpStatus.OK);
  }
  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteFuelRequired(@PathVariable("id") int id){
    fuelRequiredService.deleteFuelRequired(id);
    return new ResponseEntity<String>("Deleted!", HttpStatus.OK);
  }
}
