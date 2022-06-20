CREATE DATABASE air_traffic_control;
use air_traffic_control;
CREATE TABLE airports(
airport_id INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (airport_id)
);
CREATE TABLE airlines(
airline_id INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (airline_id)
);
CREATE TABLE plane_models(
model_id INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (model_id)
);
CREATE TABLE passengers(
passsenger_id INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY(passsenger_id)
);
CREATE TABLE flights(
flight_id INT NOT NULL AUTO_INCREMENT,
date_of_flight VARCHAR(30),
time_if_flight VARCHAR(20),
PRIMARY KEY(flight_id)
);
CREATE TABLE fuel_required(
fuel_id INT NOT NULL,
amount_of_fuel VARCHAR(20) NOT NULL,
PRIMARY KEY(fuel_id)
);
CREATE TABLE type_of_flight(
flight_id INT NOT NULL,
PRIMARY KEY(flight_id)
);