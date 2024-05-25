DROP DATABASE if exists city_verse;
CREATE DATABASE city_verse;
USE city_verse;

CREATE TABLE user (
	user_code INT(11) NOT NULL AUTO_INCREMENT,
	username VARCHAR(25) NOT NULL,
	user_email VARCHAR(30) NOT NULL,
    user_pass VARCHAR(30) NOT NULL,
	PRIMARY KEY(user_code)
);

CREATE TABLE defuser (
	def_code INT(11) NOT NULL AUTO_INCREMENT,
	def_name VARCHAR(30) NOT NULL,
    def_surname VARCHAR(30) NOT NULL,
    defUserId INT(11) NOT NULL,
	PRIMARY KEY(def_code),
	CONSTRAINT def_user
	FOREIGN KEY (def_code) REFERENCES user(user_code)
	ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE admin (
	admin_code INT(11) NOT NULL AUTO_INCREMENT,
	admin_name VARCHAR(30) NOT NULL,
    admin_surname VARCHAR(30) NOT NULL,
    admin_salary FLOAT(7,2) NOT NULL,
    admin_empDate DATETIME NOT NULL,
	PRIMARY KEY(admin_code),
	CONSTRAINT admin_emp
	FOREIGN KEY (admin_code) REFERENCES user(user_code)
	ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE eventOrganiser (
	evOrg_code INT(11) NOT NULL AUTO_INCREMENT,
    evOrg_evOrgId INT(11) NOT NULL,
	evOrg_name VARCHAR(30) NOT NULL,
    evOrg_surname VARCHAR(30) NOT NULL,
	PRIMARY KEY(evOrg_code),
	CONSTRAINT event_organiser
	FOREIGN KEY (evOrg_code) REFERENCES user(user_code)
	ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE municipalEmp (
	municipalEmp_code INT(11) NOT NULL AUTO_INCREMENT,
	municipalEmp_name VARCHAR(30) NOT NULL,
    municipalEmp_surname VARCHAR(30) NOT NULL,
	municipalEmp_empDate DATETIME NOT NULL,
    municipalEmp_salary FLOAT(7,2) NOT NULL,
	PRIMARY KEY(municipalEmp_code),
	CONSTRAINT muncipal_emp
	FOREIGN KEY (municipalEmp_code) REFERENCES user(user_code)
	ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE taxi (
	taxi_code INT(11) NOT NULL AUTO_INCREMENT,
	taxi_id INT(11) NOT NULL,
	taxi_name VARCHAR(30) NOT NULL,
    taxi_surname VARCHAR(30) NOT NULL,
	PRIMARY KEY(taxi_code),
    CONSTRAINT taxi_emp
	FOREIGN KEY (taxi_code) REFERENCES user(user_code)
	ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE parkingEmp (
	parkEmp_code INT(11) NOT NULL AUTO_INCREMENT,
    parkEmp_name VARCHAR(30) NOT NULL,
    parkEmp_surname VARCHAR(30) NOT NULL,
	parkEmp_empDate DATETIME NOT NULL,
	PRIMARY KEY(parkEmp_code),
	CONSTRAINT parking_emp
	FOREIGN KEY (parkEmp_code) REFERENCES user(user_code)
	ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE parking (
	park_code INT(11) NOT NULL AUTO_INCREMENT,
	owner_fname VARCHAR(25) NOT NULL,
	email VARCHAR(30) NOT NULL,
	phone_number CHAR(10) NOT NULL,
	brand VARCHAR(25) NOT NULL,
    park_street VARCHAR(30) NOT NULL,
    park_number INT(4) NOT NULL,
    post_code INT(5) NOT NULL,
    afm INT(9) NOT NULL,
    invoice VARCHAR(30) NOT NULL,
    park_spaces INT(5) NOT NULL,
    park_type ENUM('private','public') NOT NULL,
	PRIMARY KEY(park_code)
);

CREATE TABLE events (
	event_code INT(11) NOT NULL AUTO_INCREMENT,
	title VARCHAR(25) NOT NULL,
	event_datetime VARCHAR(25) NOT NULL,
	capacity INT(11) NOT NULL,
	organizer_name VARCHAR(25) NOT NULL,
    location VARCHAR(30) NOT NULL,
	event_street VARCHAR(30) NOT NULL,
    event_number INT(4) NOT NULL,
	PRIMARY KEY(event_code)
);

CREATE TABLE interrupts (
	int_code INT(11) NOT NULL AUTO_INCREMENT,
	int_location VARCHAR(25) NOT NULL,
	int_street VARCHAR(25) NOT NULL,
	int_reason VARCHAR(25) NOT NULL,
	int_datetime VARCHAR(25) NOT NULL,
	PRIMARY KEY(int_code)
);
