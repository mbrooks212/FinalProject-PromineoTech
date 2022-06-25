package com.finalProject.service;

import java.util.List;
import com.finalProject.model.PlaneModels;
//Michael Brooks

public interface PlaneModelService {
	
	//post
	PlaneModels saveModels(PlaneModels planeModels); 
	
	//get all
	List<PlaneModels> getAllPlanes();
	
	//get by id
	PlaneModels getPlaneByID(int id);
	
	//update
	PlaneModels updatePlane(PlaneModels planeModels, int id);
	
	//delete
	void deletePlane(int id);
}