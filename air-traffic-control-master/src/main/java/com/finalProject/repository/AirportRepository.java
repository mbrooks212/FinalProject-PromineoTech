package com.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.model.Airports;
//Michael Brooks

@Repository
public interface AirportRepository extends JpaRepository<Airports, Integer> {

}