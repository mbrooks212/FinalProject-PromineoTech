package com.finalProject.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalProject.exception.ResourceNotFoundException;
import com.finalProject.model.Passengers;
import com.finalProject.repository.PassengerRepository;
import com.finalProject.service.PassengerService;
//Mariah Jemmings

@Service
public class PassengerServiceImpl implements PassengerService {

 
  private PassengerRepository passengerRepository;
  @Autowired
  public PassengerServiceImpl (PassengerRepository passengerRepository) {
    super();
    this.passengerRepository=passengerRepository;
  }


  @Override
  public List<Passengers> getAllPassengers() {
    // TODO Auto-generated method stub
    return passengerRepository.findAll();
  }

  @Override
  public Passengers savePassenger(Passengers passenger) {
    // TODO Auto-generated method stub
    return passengerRepository.save(passenger);
  }


  @Override
  public Passengers getPassengerById(int id) {
    // TODO Auto-generated method stub
    return passengerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Passengers", "Id", id));

}


  @Override
  public Passengers updatePassenger(Passengers passenger, int id) {
    // TODO Auto-generated method stub
    Passengers existingPassenger = passengerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Passengers", "Id", id));
    
    existingPassenger.setFirst_name(passenger.getFirst_name());
    existingPassenger.setLast_name(passenger.getLast_name());
    existingPassenger.setDob(passenger.getDob());
    existingPassenger.setAirlines_id(passenger.getAirlines_id());
    existingPassenger.setAirports_id(passenger.getAirports_id());
    
    passengerRepository.save(existingPassenger);
    
    return existingPassenger;
  }


  @Override
  public void deletePassenger(int id) {
    Passengers existingPassenger = passengerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Passengers", "Id", id));
    passengerRepository.deleteById(id);
    
  }}
