# Case Study : Creating an API for a Human Resource Program

This project was developed as part of the Oracle Java Foundations certification to solve the problems presented in the case study: "Creating an API for a Human Resource Program."
The goal of this project is to design and code a basic set of APIs to support the creation and management of collections of objects, specifically focusing on the Employee and Department classes.

## Case Study Challenge: Classes & Functionality

The challenge involves the following tasks:

- Design and code basic APIs that allow for the creation and management of objects.
- Model two classes: 
  - Employee: Tracks individual employee data such as ID, name, and salary.
  - Department: Manages a collection of employees and has a unique department name.
- The classes should utilize constructors and fully encapsulate their fields.
- It should be possible to print details about individual employees and departments.
- Additional methods are required to process the data for departments and employees.
- The API should be tested within the `main` method of an additional class.

## Project Goals

1. Employee Class:
   - Fields: ID (1D), name, salary.
   - Ability to print employee details (ID, name, salary).
   
2. Department Class:
   - Fields: A unique department name and a collection of employees.
   - Ability to manage employees within the department.
   - Retrieve and print the department's name and all associated employees.
   
3. Encapsulation:
   - All fields in both classes are private and accessed through public getter and setter methods.
   
4. Additional Methods:
   - Methods to add employees to a department and retrieve department-related data.
   - Print functions to display department and employee details.
   
5. Testing:
   - The `main` method tests the creation of employee and department objects and validates the API functionality by printing out the data.

## Features

- Employee Class:
  - Create and manage employee objects with attributes such as ID, name, and salary.
  - Print employee details for individual employees.

- Department Class:
  - Create and manage departments, each having a unique name and collection of employees.
  - Add employees to departments and process department data.
  - Print the department name and the details of all employees associated with it.

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo-name.git
