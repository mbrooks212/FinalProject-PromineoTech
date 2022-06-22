drop database if exists air_traffic_control;
CREATE DATABASE air_traffic_control;
use air_traffic_control;
drop table if exists airports;
drop table if exists airlines;
drop table if exists plane_models;
drop table if exists passengers;
drop table if exists fuel_required;
drop table if exists type_of_flight;

CREATE TABLE type_of_flight(
flight_id INT NOT NULL,
flight_type VARCHAR(20),
PRIMARY KEY(flight_id)
);
CREATE TABLE fuel_required(
fuel_id INT NOT NULL,
fuel_type VARCHAR(20),
amount_of_fuel INT NOT NULL,
PRIMARY KEY(fuel_id)
);
CREATE TABLE plane_models(
model_id INT NOT NULL AUTO_INCREMENT,
model VARCHAR(20),
fuel_type VARCHAR(20),
PRIMARY KEY (model_id),
foreign key(fuel_type) references fuel_required(fuel_type)
);

CREATE TABLE flights(
flight_id INT NOT NULL AUTO_INCREMENT,
date_of_flight VARCHAR(30),
time_if_flight VARCHAR(20),
fuel_id INT NOT NULL,
tof_id INT NOT NULL,
passenger_id INT NOT NULL,
model VARCHAR(20),
PRIMARY KEY(flight_id),
foreign key(fuel_id) references fuel_required(fuel_id),
foreign key(tof_id) references  type_of_flight(flight_id),
foreign key(model) references plane_models(model),
foreign key(passenger_id) references passengers(passenger_id)
);
CREATE TABLE airlines(
airline_id INT NOT NULL AUTO_INCREMENT,
flight_id INT NOT NULL,
PRIMARY KEY (airline_id),
foreign key(flight_id) references flights(flight_id)
);

CREATE TABLE airports(
airport_id INT NOT NULL AUTO_INCREMENT,
airport_name VARCHAR(20),
airline_id INT NOT NULL,
PRIMARY KEY (airport_id),
foreign key(airline_id) references airlines(airline_id)
);
CREATE TABLE passengers(
passsenger_id INT NOT NULL AUTO_INCREMENT,
passenger_name VARCHAR(40),
flight_id INT NOT NULL,
PRIMARY KEY(passsenger_id),
foreign key(flight_id) references flights(flight_id)
);
