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
    
);

insert into User values(1,"Jack", "1994-03-29","Bukit Timah Road","This is a description" ,"2021-07-01");
insert into User values(2,"John", "1999-12-30","Seah Im Street","This is a description" ,"2021-07-11");
insert into User values(3,"Mary", "1989-04-09","50 Bugis road ","This is a description" ,"2021-07-19");
insert into User values(4,"Kalebh", "1993-09-05","Cross street","This is a description" ,"2021-07-11");
insert into User values(5,"Joshua", "1984-04-11","Chinatown","This is a description" ,"2021-07-11");