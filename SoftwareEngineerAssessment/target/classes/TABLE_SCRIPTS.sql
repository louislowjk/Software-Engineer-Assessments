DROP database if exists user_db;
create database user_db;

use user_db;



CREATE TABLE USER(
	Id INTEGER,
    Name VARCHAR(30),
    DOB DATE,
    Address VARCHAR(200),
    Description VARCHAR(200),
    CreatedAt DATE
    
)
