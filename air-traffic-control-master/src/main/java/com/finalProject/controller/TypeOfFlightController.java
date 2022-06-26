/**
 * 
 */
package com.finalProject.controller;

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
import com.finalProject.model.TypeOfFlight;
import com.finalProject.service.TypeOfFlightService;

/**
 * @author coope
 *
 */
@RestController
@RequestMapping("/air_traffic_control/type_of_flight")
public class TypeOfFlightController {
  
  private TypeOfFlightService typeOfFlightService;
  
  public TypeOfFlightController(TypeOfFlightService TypeOfFlightService) {
    super();
    this.typeOfFlightService = TypeOfFlightService;
  }
  
  @PostMapping()
  public ResponseEntity<TypeOfFlight> saveFuelRequired(@RequestBody TypeOfFlight typeOfFlight) {
    return new ResponseEntity<TypeOfFlight>(typeOfFlightService.saveTypeOfFlight(typeOfFlight), HttpStatus.CREATED);
  }
  @GetMapping
  public List<TypeOfFlight> getAllTypeOfFlights(){
    return typeOfFlightService.getAllTypeOfFlights();
  }
  @GetMapping("{id}")
  public ResponseEntity<TypeOfFlight> getTypeOfFlightById(@PathVariable("id") int id){
    return new ResponseEntity<TypeOfFlight>(typeOfFlightService.getTypeOfFlightsByID(id), HttpStatus.OK);
  }
  @PutMapping("{id}")
  public ResponseEntity<TypeOfFlight> updateTypeOfFlight(@PathVariable("id") int id, @RequestBody TypeOfFlight typeOfFlight){
  return new ResponseEntity<TypeOfFlight>(typeOfFlightService.updateTypeOfFlight(typeOfFlight, id), HttpStatus.OK);
  }
  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteTypeOfFlight(@PathVariable("id") int id){
    typeOfFlightService.deleteTypeOfFlight(id);
    return new ResponseEntity<String>("Deleted!", HttpStatus.OK);
  }
}