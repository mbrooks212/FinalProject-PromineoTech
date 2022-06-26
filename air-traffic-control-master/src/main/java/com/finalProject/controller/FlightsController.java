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
import com.finalProject.model.Flights;
import com.finalProject.service.FlightsService;
;


@RestController
@RequestMapping("/air_traffic_control/flights")
public class FlightsController {
  private FlightsService flightsService;
  
  public FlightsController (FlightsService flightsService) {
    super();
    this.flightsService = flightsService;
  }

  @PostMapping()
  public ResponseEntity<Flights> saveFlight(@RequestBody Flights flight){
    return new ResponseEntity <Flights>(flightsService.saveFlight(flight), HttpStatus.CREATED);
  }
  
  @GetMapping
  public List<Flights> getAllFlights(){
    
    return flightsService.getAllFlights();
  }
  
  @GetMapping("{id}")
  public ResponseEntity<Flights> getFlightById(@PathVariable("id") int id){
    return new ResponseEntity<Flights>(flightsService.getFlightById(id), HttpStatus.OK);
  }
  
  @PutMapping("{id}")
  public ResponseEntity<Flights> updateFlight(@PathVariable("id") int id, @RequestBody Flights flight){
    return new ResponseEntity<Flights>(flightsService.updateFlight(flight, id), HttpStatus.OK);
  }
  
  @DeleteMapping("{id}")
  
  public ResponseEntity<String> deleteFlight(@PathVariable("id") int id){
    flightsService.deleteFlight(id);
    return new ResponseEntity<String>("Flight Deleted", HttpStatus.OK);
  
  } 
}