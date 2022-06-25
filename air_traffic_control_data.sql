-- passengers

INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_id) VALUES ('Jane', 'Doe', '1995-02-01', 1, 1, 1);
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_id) VALUES ('Maddie', 'Jones', '1990-04-21', 1, 3, 2);
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_ide) VALUES ('Jacob', 'Smith', '1982-06-01',2, 2, 3);
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_id) VALUES ('Dominic', 'Crawford', '1997-03-22', 2, 1, 4);
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_id) VALUES ('Patricia', 'Jack', '1964-07-05', 3, 2, 5);
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_id) VALUES ('Benjamin', 'Stanford', '1954-12-12', 1, 2, 6);
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_id) VALUES ('Lawrence', 'Peters', '1945-03-07', 1, 3, 7);
INSERT INTO passengers (first_name, last_name, dob, airports_id, airlines_id, flights_id) VALUES ('Matt', 'Graven', '1992-11-01', 1, 1, 8);

-- flights

INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-18', '06:30:00', 1,1);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-19', '10:30:00', 1,3);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-18', '07:30:00', 2,2);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-20', '13:30:00', 2,1);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-18', '08:45:00', 3,2);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-20', '04:30:00', 1,2);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-19', '10:30:00', 1,3);
INSERT INTO flights (date, time, airports_id, airlines_id) VALUES ('2022-05-19', '10:30:00', 1,1);