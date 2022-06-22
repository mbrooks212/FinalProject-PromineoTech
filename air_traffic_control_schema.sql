CREATE DATABASE air_traffic_control;
use air_traffic_control;

drop table if exists players_friends;
drop table if exists scores;
drop table if exists games;
drop table if exists players;

CREATE TABLE airports(
id INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (id)
);
CREATE TABLE airlines(
id INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (id)
);
CREATE TABLE plane_models(
id INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (id)
);
CREATE TABLE passengers(
id INT NOT NULL AUTO_INCREMENT,
first_name varchar(20) NOT NULL,
last_name varchar(20) NOT NULL,
dob DATE NOT NULL,
airports_id int NOT NULL,
airlines_id int NOT NULL,
flights_date DATE NOT NULL,
flights_time TIME NOT NULL,
PRIMARY KEY(id),
foreign key(airports_id) references airports(id),
foreign key(airlines_id) references airlines(id),
foreign key(flights_date) references flights(date),
foreign key(flights_time) references flights(time)

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
CREATE TABLE fuel_required(
id INT NOT NULL,
amount_of_fuel VARCHAR(20) NOT NULL,
PRIMARY KEY(id)
);
CREATE TABLE type_of_flight(
id INT NOT NULL,
PRIMARY KEY(id)
);