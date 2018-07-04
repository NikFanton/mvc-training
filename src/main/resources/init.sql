DROP TABLE IF EXISTS CONTACT;

CREATE TABLE CONTACT (
id INT NOT NULL AUTO_INCREMENT
, first_name VARCHAR(60) NOT NULL
, last_name VARCHAR(40) NOT NULL
, birth_date DATE
, description VARCHAR(2000)
, photo BLOB
, version INT NOT NULL DEFAULT 0
, UNIQUE UQ_CONTACT_l (first_name, last_name)
, primary key (ID)
);