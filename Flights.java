package com.finalProject.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Entity
@Table(name="flights")
public class Flights{
  
  
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(value = "date")
  private String date;
  @Column(value="time")
  private String time;
  @Column(value="airports_id")
  private String airports_id;
  @Column(value="airlines_id")
  private String airlines_id;}
 

