package com.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.model.Passengers;
//Mariah Jemmings
@Repository
public interface PassengerRepository extends JpaRepository<Passengers, Integer>{
}
 

