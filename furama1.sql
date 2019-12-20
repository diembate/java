CREATE TABLE SwimmingPool (
swimmingPool_id VARCHAR(15) NOT NULL PRIMARY KEY,
swimmingPool_type VARCHAR(15) NOT NULL,
price_of_each_type FLOAT NOT NULL,
open_hours TIME NOT NULL,
close_hours TIME NOT NULL
);
CREATE TABLE SwimmingCard (
swimmingCard_id VARCHAR(15) NOT NULL PRIMARY KEY,
customer_id VARCHAR(15),
swimmingPool_id VARCHAR(15) NOT NULL,
service_hours FLOAT,
service_price FLOAT,
payment_method VARCHAR(255),
bill_status VARCHAR(50),
payment_date DATE,
FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
FOREIGN KEY (swimmingPool_id) REFERENCES SwimmingPool(swimmingPool_id),
FOREIGN KEY (payment_method) REFERENCES Payment(payment_method) );

CREATE  TABLE Accommodation_Order (
accommodationOrder_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
customer_id VARCHAR(15),
vila_id VARCHAR(50) UNIQUE,
house_id VARCHAR(50) UNIQUE,
service_day INT NOT NULL,
amount FLOAT,
date_of_hire DATE NOT NULL,
check_out_date DATE NOT NULL, 
payment_method VARCHAR(255),
bill_status VARCHAR(50),
 payment_date DATE ,
FOREIGN KEY (payment_method) REFERENCES Payment(payment_method),
FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
FOREIGN KEY (vila_id) REFERENCES Vila(vila_id),
FOREIGN KEY (house_id) REFERENCES House(house_id)
 );
 

CREATE TABLE Vila (
vila_id VARCHAR(50)  NOT NULL PRIMARY KEY,
vila_name  VARCHAR(50)  UNIQUE NOT NULL,
priceVila FLOAT NOT NULL,
vila_status VARCHAR(255)
);

CREATE TABLE House (
house_id VARCHAR(50)  NOT NULL PRIMARY KEY,
house_name  VARCHAR(50) UNIQUE NOT NULL,
priceHouse FLOAT NOT NULL,
house_status VARCHAR(255)
);

CREATE TABLE Employees (
employees_id VARCHAR(15) NOT NULL PRIMARY KEY,
employees_name VARCHAR(50) NOT NULL,
address VARCHAR(255) NOT NULL,
phone VARCHAR(11) NOT NULL,
job_tilte VARCHAR(100) NOT NULL,
reports_to VARCHAR(100) ,
salary FLOAT,
FOREIGN KEY (reports_to) REFERENCES Employees( employees_id)
);


CREATE TABLE Vehicle (
license_plates VARCHAR(15) NOT NULL PRIMARY KEY
);

CREATE TABLE Customers (
customer_id VARCHAR(15) NOT NULL PRIMARY KEY,
customer_name VARCHAR(50) NOT NULL,
birthdate_customer DATE,
address VARCHAR(255) NOT NULL,
phone VARCHAR(11) NOT NULL,
employees_id VARCHAR(15) ,
license_plates VARCHAR(15),
FOREIGN KEY (employees_id) REFERENCES Employees(employees_id),
FOREIGN KEY (license_plates) REFERENCES Vehicle(license_plates)
);
CREATE TABLE BorrowOrder(
order_id INT auto_increment NOT NULL PRIMARY KEY, 
customer_id  VARCHAR(15) ,
entertainment_id VARCHAR(15),
borrowDate DATE NOT NULL,
returnDate DATE NOT NULL, 
 FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
 FOREIGN KEY (entertainment_id) REFERENCES Library(entertainment_id)
); 

CREATE TABLE Library (
entertainment_id VARCHAR(15) NOT NULL PRIMARY KEY,
entertainment_type VARCHAR(255) NOT NULL,
entertainment_name VARCHAR(255) NOT NULL,
author VARCHAR(100) NOT NULL,
status_oder VARCHAR(15) NOT NULL 
);

CREATE TABLE Payment(
 payment_method VARCHAR(255) NOT NULL PRIMARY KEY
);