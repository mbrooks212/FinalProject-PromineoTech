package com.finalProject.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;
//Mariah Jemmings
@Data
@Entity
@Table(name="passengers")
public class Passengers{
  
  
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(value = "first_name")
  private String first_name;
  @Column(value="last_name")
  private String last_name;
  @Column(value="dob")
  private String dob;
  @Column(value="airports_id")
  private String airports_id;
  @Column(value="airlines_id")
  private String airlines_id;
  @Column(value="flights_id")
  private String flights_id;
  
}