package com.finalProject.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.model.Flights;
import com.finalProject.model.Passengers;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Integer> {

}
