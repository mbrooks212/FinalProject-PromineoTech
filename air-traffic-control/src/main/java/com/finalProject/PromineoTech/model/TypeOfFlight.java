/**
 * 
 */
package com.finalProject.PromineoTech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

/**
 * @author coope
 *
 */
@Data
@Entity
@Table(name="type_of_flight")
public class TypeOfFlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int flight_id;
      
//    @Column(value = "flight_id")
//     private int flight_id;
      
  }
 
  

