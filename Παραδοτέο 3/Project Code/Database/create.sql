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
	def_username VARCHAR(25) NOT NULL,
	def_email VARCHAR(30) NOT NULL,
    def_pass VARCHAR(30) NOT NULL,
	def_name VARCHAR(30) NOT NULL,
    def_surname VARCHAR(30) NOT NULL,
    defUserId INT(11) NOT NULL,
	PRIMARY KEY(def_code)
);

CREATE TABLE admin (
	admin_code INT(11) NOT NULL AUTO_INCREMENT,
	admin_username VARCHAR(25) NOT NULL,
	admin_email VARCHAR(30) NOT NULL,
    admin_pass VARCHAR(30) NOT NULL,
	admin_name VARCHAR(30) NOT NULL,
    admin_surname VARCHAR(30) NOT NULL,
    admin_salary FLOAT(7,2) NOT NULL,
    admin_empDate DATETIME NOT NULL,
	PRIMARY KEY(admin_code)
);

CREATE TABLE eventOrganizer (
	evOrg_code INT(11) NOT NULL AUTO_INCREMENT,
	evOrg_username VARCHAR(25) NOT NULL,
	evOrg_email VARCHAR(30) NOT NULL,
    evOrg_pass VARCHAR(30) NOT NULL,
    evOrg_evOrgId INT(11) NOT NULL,
	evOrg_name VARCHAR(30) NOT NULL,
    evOrg_surname VARCHAR(30) NOT NULL,
	PRIMARY KEY(evOrg_code)
);

CREATE TABLE municipalEmp (
	municipalEmp_code INT(11) NOT NULL AUTO_INCREMENT,
	municipalEmp_username VARCHAR(25) NOT NULL,
	municipalEmp_email VARCHAR(30) NOT NULL,
    municipalEmp_pass VARCHAR(30) NOT NULL,
	municipalEmp_name VARCHAR(30) NOT NULL,
    municipalEmp_surname VARCHAR(30) NOT NULL,
	municipalEmp_empDate DATETIME NOT NULL,
    municipalEmp_salary FLOAT(7,2) NOT NULL,
	PRIMARY KEY(municipalEmp_code)
);

CREATE TABLE taxi (
	taxi_code INT(11) NOT NULL AUTO_INCREMENT,
	taxi_id INT(11) NOT NULL,
	PRIMARY KEY(taxi_code)
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
	event_datetime DATETIME NOT NULL,
	capacity INT(11) NOT NULL,
	organizer_name VARCHAR(25) NOT NULL,
    location VARCHAR(30) NOT NULL,
	event_street VARCHAR(30) NOT NULL,
    event_number INT(4) NOT NULL,
	PRIMARY KEY(event_code)
);