SHOW DATABASES;
CREATE DATABASE testdb;
USE testdb;
CREATE TABLE users(userid INT PRIMARY KEY AUTO_INCREMENT, username char(15), email char(50) unique, userpass CHAR(8) NOT NULL);
SHOW TABLES;
SELECT * FROM users;
INSERT INTO users(username,email,userpass) VALUES('pavithra','pavithrasandy26@gmail.com','pavi2626');
INSERT INTO users(username,email,userpass) VALUES('pavithran','pavithran25n@gmail.com','pavi2525');
INSERT INTO users(username,email,userpass) VALUES('kalai','kalaisrisan@gmail.com','kssp@135');
INSERT INTO users(username,email,userpass) VALUES('charmii','charmie26@gmail.com','charm26');
TRUNCATE TABLE users;
INSERT INTO users(Customer_name,Password) VALUES('pavithrasandy26@gmail.com','pavi2626'),('pavithran25n@gmail.com','pavi2525'),('kalaisrisan@gmail.com','kssp@135');
SELECT*FROM users WHERE Id=1;
drop table users;