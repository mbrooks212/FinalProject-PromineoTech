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
      private int id;
      
    @Column(value = "airport")
     private int airport;
    @Column(value = "airline")
    private int airline;
    @Column(value = "flight")
    private int flight;
  }
 
  

