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
import com.finalProject.model.Airlines;
import com.finalProject.service.AirlineService;
//Michael Brooks

@RestController
@RequestMapping("air_traffic_control/airlines")
public class AirlineController {

	private AirlineService airlineService;
	
	public AirlineController(AirlineService airlineService) {
		super();
		this.airlineService = airlineService;
	}
	@PostMapping()
	public ResponseEntity<Airlines> saveAirline(@RequestBody Airlines airlines){
		return new ResponseEntity<Airlines>(airlineService.saveAirline(airlines), HttpStatus.CREATED);
	}
	@GetMapping
	public List<Airlines> getAllAirlines(){
		return airlineService.getAllAirlines();
	}
	@GetMapping("{id}")
	public ResponseEntity<Airlines> getAirlinesById(@PathVariable("id") int Id){
		return new ResponseEntity<Airlines>(airlineService.getAirlineById(Id), HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Airlines> updateAirline(@PathVariable("id")int Id, @RequestBody Airlines airlines){
		return new ResponseEntity<Airlines>(airlineService.updateAirline(airlines, Id), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAirline(@PathVariable("id")int Id){
		airlineService.deleteAirline(Id);
		return new ResponseEntity<String>("Airline Deleted.", HttpStatus.OK);
	}
}
