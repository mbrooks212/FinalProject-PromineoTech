/**
 * 
 */
package com.finalProject.PromineoTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.PromineoTech.model.FuelRequired;

/**
 * @author coope
 *
 */
@Repository
public interface FuelRequiredRepository extends JpaRepository<FuelRequired, Integer> {

}
