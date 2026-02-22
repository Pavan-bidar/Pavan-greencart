
1. 📌 Project Overview

GreenCart is a command-line based grocery inventory management system developed using:

Core Java

JDBC (Java Database Connectivity)

MySQL Database

The system allows users to manage grocery items efficiently by tracking:

Item details

Quantity

Expiry dates

Price

Low stock alerts

It is designed as a simple yet practical real-world application.

2. 🎯 Objectives

The main objectives of this project are:

To implement CRUD operations using JDBC.

To connect Java application with MySQL database.

To create a menu-driven console application.

To manage grocery stock and expiry tracking.

To demonstrate OOP concepts in Java.

3. 🛠️ Technologies Used
Technology	Purpose
Java (Core Java)	Application logic
JDBC	Database connectivity
MySQL	Database management
MySQL Connector/J	JDBC Drive
4. 🧩 Module Description
4.1 DBConnection.java

Establishes connection with MySQL database.

Uses DriverManager.getConnection().

Returns Connection object.

4.2 GroceryItem.java (Model Class)

Represents Grocery entity.

Contains attributes:

id

name

category

quantity

expiryDate

price

Implements encapsulation using private variables and getters.

4.3 GroceryDAO.java (Data Access Object)

Handles all database operations:

Implemented Methods:

addItem() – Inserts new grocery item

viewAllItems() – Displays all records

viewExpiredItems() – Shows expired items

searchByCategory() – Filter by category

updateQuantity() – Modify stock

deleteItem() – Remove item

lowStockItems() – Display items with quantity < 5

Uses:

PreparedStatement

Statement

ResultSet

Try-with-resources

4.4 GreenCartApp.java (Main Class)

Menu-driven CLI interface.

Uses Scanner for user input.

Calls DAO methods based on user choice.

Implements infinite loop until exit option.

5. ⚙️ Functional Requirements

Add new grocery items.

View all items.

View expired items.

Search items by category.

Update item quantity.

Delete an item.

View low-stock items.

Exit application.

6. 🔄 System Workflow

User runs the application.

Menu options are displayed.

User selects an option.

Application calls respective DAO method.

Database operation is executed.

Result is displayed on console.

7. 🧠 Concepts Demonstrated

Object-Oriented Programming

Encapsulation

JDBC Connectivity

SQL Queries (INSERT, SELECT, UPDATE, DELETE)

Date handling in Java

Exception Handling

Try-with-resources

Menu-driven loop logic
8. 📈 Advantages

Simple and user-friendly.

Real-world practical use case.

Demonstrates database integration.

Easy to extend with more features.

Good for academic submission and interviews.

9. 🔮 Future Enhancements

Admin login system

Sales tracking module

Automatic email alerts for expiry

GUI version using JavaFX or Swing

Export report to PDF/CSV

Barcode scanner integration

10. 🧾 Conclusion

GreenCart is a simple yet effective inventory management system developed using Core Java, JDBC, and MySQL. The project successfully demonstrates CRUD operations, database connectivity, and real-world application logic in a menu-driven console environment.

It is suitable for:

Mini Project

College Submission

Resume Project

Java + JDBC Practice
