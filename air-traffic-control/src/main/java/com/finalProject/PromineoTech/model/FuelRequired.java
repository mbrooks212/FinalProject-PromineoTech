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
@Table(name="fuel_required")
public class FuelRequired {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fuel_id;
    
  @Column(value = "amount_of_fuel")
  private String amount_of_fuel;
    
}
