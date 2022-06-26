package com.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.model.Flights;
//Mariah Jemmings
@Repository
public interface FlightsRepository extends JpaRepository<Flights, Integer> {

}