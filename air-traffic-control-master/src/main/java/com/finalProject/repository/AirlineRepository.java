package com.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.model.Airlines;
//Michael Brooks

@Repository
public interface AirlineRepository extends JpaRepository<Airlines, Integer> {

}