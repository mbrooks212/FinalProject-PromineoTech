/**
 * 
 */
package com.finalProject.PromineoTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finalProject.PromineoTech.model.TypeOfFlight;

/**
 * @author coope
 *
 */
@Repository
public interface TypeOfFlightRepository extends JpaRepository<TypeOfFlight, Integer> {

}
