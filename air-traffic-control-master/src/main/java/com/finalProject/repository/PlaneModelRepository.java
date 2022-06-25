package com.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.model.PlaneModels;
//Michael Brooks

@Repository
public interface PlaneModelRepository extends JpaRepository<PlaneModels, Integer> {

}