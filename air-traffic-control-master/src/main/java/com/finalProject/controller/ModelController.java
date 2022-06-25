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
import com.finalProject.model.PlaneModels;
import com.finalProject.service.PlaneModelService;
//Michael Brooks
@RestController
@RequestMapping("/air_traffic_control/plane_models")
public class ModelController {

	private PlaneModelService planeModelService;
	
	public ModelController(PlaneModelService planeModelService) {
		super();
		this.planeModelService = planeModelService;
	}
	@PostMapping()
	public ResponseEntity<PlaneModels> saveModels(@RequestBody PlaneModels planeModels){
		return new ResponseEntity<PlaneModels>(planeModelService.saveModels(planeModels),HttpStatus.CREATED);
	}
	@GetMapping
	public List<PlaneModels> getAllPlanes(){
		return planeModelService.getAllPlanes();
	}
	@GetMapping("{id}")
	public ResponseEntity<PlaneModels>getPlaneByID(@PathVariable("id") int Id){
		return new ResponseEntity<PlaneModels>(planeModelService.getPlaneByID(Id),HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<PlaneModels> updatePlane(@PathVariable("id")int Id, @RequestBody PlaneModels planeModels){
		return new ResponseEntity<PlaneModels>(planeModelService.updatePlane(planeModels, Id), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePlane(@PathVariable("id")int Id){
		planeModelService.deletePlane(Id);
		return new ResponseEntity<String>("Plane Gone!!!", HttpStatus.OK);
	}
}