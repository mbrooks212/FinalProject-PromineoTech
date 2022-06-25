
DROP DATABASE IF EXISTS air_traffic_control;
CREATE DATABASE air_traffic_control;
use air_traffic_control;
CREATE TABLE airports(
id INT NOT NULL AUTO_INCREMENT,
airport_name VARCHAR(50) NOT NULL,
PRIMARY KEY (id)
);
CREATE TABLE airlines(
id INT NOT NULL AUTO_INCREMENT,
airline_name VARCHAR(50) NOT NULL,
PRIMARY KEY (id)
);
CREATE TABLE plane_models(
id INT NOT NULL AUTO_INCREMENT,
model_name VARCHAR(50) NOT NULL,
PRIMARY KEY (id)
);
CREATE TABLE flights(
id INT NOT NULL AUTO_INCREMENT,
date DATE NOT NULL,
time TIME NOT NULL,
airports_id int NOT NULL,
airlines_id int NOT NULL,
PRIMARY KEY(id),
foreign key(airports_id) references airports(id),
foreign key(airlines_id) references airlines(id)
);
CREATE TABLE passengers(
id INT NOT NULL AUTO_INCREMENT,
first_name varchar(20) NOT NULL,
last_name varchar(20) NOT NULL,
dob DATE NOT NULL,
airports_id int NOT NULL,
airlines_id int NOT NULL,
flights_id int ,
PRIMARY KEY(id),
FOREIGN KEY(airports_id) REFERENCES airports(id),
FOREIGN KEY(airlines_id) REFERENCES airlines(id),
FOREIGN KEY(flights_id) REFERENCES flights(id)
);
CREATE TABLE fuel_required(
id INT NOT NULL,
model INT NOT NULL,
amount_of_fuel INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(model) REFERENCES plane_models(id)
);
CREATE TABLE type_of_flight(
id INT NOT NULL,
airport INT NOT NULL,
airline INT NOT NULL,
flight INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(airport) REFERENCES airports(id),
FOREIGN KEY(airline) REFERENCES airlines(id),
FOREIGN KEY(flight) REFERENCES flights(id)
);
