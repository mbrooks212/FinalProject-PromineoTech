package com.finalProject.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.exception.ResourceNotFoundException;
import com.finalProject.model.PlaneModels;
import com.finalProject.repository.PlaneModelRepository;
import com.finalProject.service.PlaneModelService;
//Michael Brooks

@Service
public class PlaneModelServiceImpl implements PlaneModelService{
	private PlaneModelRepository planeModelRepository;
	@Autowired
	public PlaneModelServiceImpl(PlaneModelRepository planeModelRepository) {
		super();
		this.planeModelRepository = planeModelRepository;
	}
	//post
	@Override
	public PlaneModels saveModels(PlaneModels planeModels) {
		return planeModelRepository.save(planeModels);
	}
	//get
	@Override
	public List<PlaneModels> getAllPlanes() {
		return planeModelRepository.findAll();
	}
	//get by id
	@Override
	public PlaneModels getPlaneByID(int id) {
		return planeModelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("PlaneModels","id",id));
	}
	//update
	@Override
	public PlaneModels updatePlane(PlaneModels planeModels, int id) {
		PlaneModels existingPlane = planeModelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("PlaneModels","id", id));
		existingPlane.setModel_name(planeModels.getModel_name());
		planeModelRepository.save(existingPlane);
		return existingPlane;
	}
	//delete
	@Override
	public void deletePlane(int id) {
		PlaneModels existingPlane = planeModelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("PlaneModels", "id", id));
		planeModelRepository.deleteById(id);	
	}
}