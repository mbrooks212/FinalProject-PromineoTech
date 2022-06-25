USE air_traffic_control;

-- airports
INSERT INTO airports (airport_name) VALUES ('CVG');
INSERT INTO airports (airport_name) VALUES ('LAX');
INSERT INTO airports (airport_name) VALUES ('ATL');
INSERT INTO airports (airport_name) VALUES ('DEN');
INSERT INTO airports (airport_name) VALUES ('JFK');
INSERT INTO airports (airport_name) VALUES ('DFW');
INSERT INTO airports (airport_name) VALUES ('PHX');
INSERT INTO airports (airport_name) VALUES ('ORD');

-- airlines
INSERT INTO airlines (airline_name) VALUES ('American Airlines');
INSERT INTO airlines (airline_name) VALUES ('Delta AirLines');
INSERT INTO airlines (airline_name) VALUES ('Frontier Airlines');
INSERT INTO airlines (airline_name) VALUES ('Southwest Airlines');
INSERT INTO airlines (airline_name) VALUES ('JetBlue');
INSERT INTO airlines (airline_name) VALUES ('Allegiant Air');
INSERT INTO airlines (airline_name) VALUES ('United Airlines');
INSERT INTO airlines (airline_name) VALUES ('Alaska Airlines');

-- plane models
INSERT INTO plane_models (model_name) VALUES ('Airbus A350');
INSERT INTO plane_models (model_name) VALUES ('Boeing 747-8');
INSERT INTO plane_models (model_name) VALUES ('Airbus A320');
INSERT INTO plane_models (model_name) VALUES ('Boeing 777');
INSERT INTO plane_models (model_name) VALUES ('Airbus A330-900');
INSERT INTO plane_models (model_name) VALUES ('Boeing 787');
INSERT INTO plane_models (model_name) VALUES ('LockheedMartin LM-100J');
INSERT INTO plane_models (model_name) VALUES ('Airbus A380');

-- passsengers 
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Jane', 'Doe', '1995-02-01', 1, 1, '2022-05-18', '06:30:00');
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Maddie', 'Jones', '1990-04-21', 1, 3, '2022-05-19', '10:30:00');
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Jacob', 'Smith', '1982-06-01',2, 2, '2022-05-18', '07:30:00');
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Dominic', 'Crawford', '1997-03-22', 2, 1, '2022-05-20', '13:30:00');
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Patricia', 'Jack', '1964-07-05', 3, 2, '2022-05-18', '08:45:00');
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Benjamin', 'Stanford', '1954-12-12', 1, 2, '2022-05-20', '04:30:00');
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Lawrence', 'Peters', '1945-03-07', 1, 3, '2022-05-19', '10:30:00');
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_date, flights_time) VALUES ('Matt', 'Graven', '1992-11-01', 1, 1, '2022-05-19', '10:30:00');

-- flights
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-18', '06:30:00', 1,1);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-19', '10:30:00', 1,3);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-18', '07:30:00', 2,2);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-20', '13:30:00', 2,1);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-18', '08:45:00', 3,2);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-20', '04:30:00', 1,2);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-19', '10:30:00', 1,3);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-19', '10:30:00', 1,1);

-- fuel required
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (1, 1, 63500);
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (2, 2, 43500);
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (3, 3, 43500);
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (4, 4, 43500);
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (5, 5, 4500);
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (6, 6, 43500);
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (7, 7, 63500);
INSERT INTO fuel_required (id, model, amount_of_fuel) VALUES (8, 8, 63500);

-- type of flight
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (1, 1, 1, 1);
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (2, 1, 1, 2);
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (3, 2, 1, 3);
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (4, 1, 1, 4);
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (5, 1, 2, 5);
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (6, 1, 2, 6);
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (7, 1, 1, 7);
INSERT INTO type_of_flight (id, airport, airline, flight) VALUES (8, 1, 1, 8);