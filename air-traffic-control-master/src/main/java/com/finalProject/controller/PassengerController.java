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
import com.finalProject.model.Passengers;
import com.finalProject.service.PassengerService;
//Mariah Jemmings

@RestController
@RequestMapping("/air_traffic_control/passengers")
public class PassengerController {
  private PassengerService passengerService;
  
  public PassengerController (PassengerService passengerService) {
    super();
    this.passengerService = passengerService;
  }

  @PostMapping()
  public ResponseEntity<Passengers> savePlayer(@RequestBody Passengers passengers){
    return new ResponseEntity <Passengers>(passengerService.savePassenger(passengers), HttpStatus.CREATED);
  }
  
  @GetMapping
  public List<Passengers> getAllPassengers(){
    
    return passengerService.getAllPassengers();
  }
  
  @GetMapping("{id}")
  public ResponseEntity<Passengers> getPassengerById(@PathVariable("id") int id){
    return new ResponseEntity<Passengers>(passengerService.getPassengerById(id), HttpStatus.OK);
  }
  
  @PutMapping("{id}")
  public ResponseEntity<Passengers> updatePassenger(@PathVariable("id") int id, @RequestBody Passengers passenger){
    return new ResponseEntity<Passengers>(passengerService.updatePassenger(passenger, id), HttpStatus.OK);
  }
  
  @DeleteMapping("{id}")
  
  public ResponseEntity<String> deletePassenger(@PathVariable("id") int id){
    passengerService.deletePassenger(id);
    return new ResponseEntity<String>("Passenger Deleted", HttpStatus.OK);
  
  } 
}
