Employee Management System1

This is an Employee Management System developed this application using Core java with java database connectivity(JDBC).
It allows users to insert, delete, update and display employee information using employee table. 
It is connected to a MySQL database using JDBC and contains classes for database operations and employee data storage.


Features

(1) Inserting the employee details

(2) Updating the employee details

(3) Deleting the employee details

(4) Displaying the employee details


Important packages used in this Project

(1) java.sql.Connection;

(2) java.sql.DriverManager;

(3) java.sql.PreparedStatement;

(4) java.sql.ResultSet;

(5) java.sql.SQLException;

(6) java.util.Scanner;

Output Screen Shots


(1) Inserting the Employee details

This options selecting prompt appears to the user.Based on the user's wish he will select his choice. In this case i selected the insert operation. Like this we can enter many employees's details.

![Screenshot (84)](https://github.com/lakshmicdgithub/EmployeeManagementSystem1/assets/148479768/8f3f4516-5842-4599-8ad9-e9988af6be31)

Checking the inserted Employees details inside the database

![s1](https://github.com/lakshmicdgithub/EmployeeManagementSystem1/assets/148479768/a49674f8-a028-49d4-a1c6-896baed91b8c)

Here you can see that employee details are inserted successfully.


(2) Updating the Employee details
In this project I upadted the FirstName, LastName, EmailAddress and ContactNumber of the employee having id 5.

Like this we can update the other employee details also

![Screenshot (87)](https://github.com/lakshmicdgithub/EmployeeManagementSystem1/assets/148479768/516408a8-8bef-4890-b46c-039e27decc72)

Checking the Updated Employees details inside the database

![s2](https://github.com/lakshmicdgithub/EmployeeManagementSystem1/assets/148479768/53904b60-2873-4e8a-9666-1cee20652ba1)

Here you can see that employee details has been updated successfully.

(3) Deleting the Employee details from the databse
In this project we can delete the employees's details from the database based on their employee id. In this case i deleted the details of the employee having id as 7

![Screenshot (90)](https://github.com/lakshmicdgithub/EmployeeManagementSystem1/assets/148479768/9ba3e971-7dc0-49ff-989e-4809260d5b0c)

Checking the Deleted Employees details inside the database

![s3](https://github.com/lakshmicdgithub/EmployeeManagementSystem1/assets/148479768/ecad00e1-681d-41cb-9502-ddd98d856a48)

Here you can see that employee details are deleted successfully.


(4) Displaying the Employee details from the database

Shows a list of all employees in a employee1Table, with their personal and employment details.

![Screenshot (92)](https://github.com/lakshmicdgithub/EmployeeManagementSystem1/assets/148479768/c2c8c7f6-650f-4f51-9d5b-13dac9ddbf6b)

How I Connected this Java application to Database

Before connecting to the database we need to have the following details they are

(1) Port number : 3307

(2) Driver software url : "jdbc:mysql://localhost:3307/jdbc_employee"

(3) Database user name : "root"

(4) Data base password : "Lakshmi@2001"

(5) Database name : employee

Here are the following Steps to be followed

(1) Loading the driver software

(2) Creating the connection object

(3) Creating the Statement object

(4) Executing the Query Statement

(5) Process the result

(6) Close the connection


Run Time Environment

I used Eclipse IDE for the developement and execution of this project


Jar files

I used Mysql Connector Jar file in this project














