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
import com.finalProject.model.Airports;
import com.finalProject.service.AirportService;
//Michael Brooks

@RestController
@RequestMapping("air_traffic_control/airports")
public class AirportController {

	private AirportService airportService;
	
	public AirportController(AirportService airportService) {
		super();
		this.airportService = airportService;
	}
	@PostMapping()
	public ResponseEntity<Airports> saveAirport(@RequestBody Airports airports){
		return new ResponseEntity<Airports>(airportService.saveAirport(airports), HttpStatus.CREATED);
	}
	@GetMapping
	public List<Airports> getAllAirports(){
		return airportService.getAllAirports();
	}
	@GetMapping("{id}")
	public ResponseEntity<Airports> getAirportsById(@PathVariable("id") int Id){
		return new ResponseEntity<Airports>(airportService.getAirportById(Id), HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Airports> updateAirport(@PathVariable("id")int Id, @RequestBody Airports airports){
		return new ResponseEntity<Airports>(airportService.updateAirport(airports, Id), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAirport(@PathVariable("id")int Id){
		airportService.deleteAirport(Id);
		return new ResponseEntity<String>("Airport Deleted.", HttpStatus.OK);
	}
}