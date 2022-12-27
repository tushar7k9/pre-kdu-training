CREATE DATABASE employee;

USE employee;

CREATE TABLE department(department_id INT PRIMARY KEY,department_name VARCHAR(255));

CREATE TABLE employee(employee_id INT PRIMARY KEY,employee_name VARCHAR(255),salary DECIMAL(10,2),department_id INT,FOREIGN KEY (department_id) REFERENCES department(department_id));