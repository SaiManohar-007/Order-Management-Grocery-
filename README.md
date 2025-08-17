# **Online Grocery Order Management API** 🛒

<p align="center">
  A RESTful API for managing customers, grocery items, and orders in an online grocery system built with Spring Boot.
</p>

## ✨ **Project Overview**
This is a **RESTful API service** project developed using **Spring Boot** to manage the core entities of an online grocery ordering system: customers, grocery items, and orders. The primary focus is on implementing **CRUD (Create, Read, Update, Delete)** operations for each entity to maintain basic data records and relationships, without delving into complex business logic like inventory management or payment processing.

***

## 🚀 **Key Features**

This simplified system is designed to effectively manage the foundational data for an online grocery store.

### **📦 Entities & Relationships**
The system is built around three core entities and their relationships:

* **Customer**: Represents individual customers using the system.
    * Fields: `Name`, `Email`, `Address`, `Phone`
* **Grocery Item**: Defines the items available for purchase.
    * Fields: `Name`, `Category`, `Price`, `Quantity`
* **Order**: Tracks customer orders and the items they contain.
    * Fields: `Customer`, `Grocery Item(s)`, `Order Date`, `Total Price`

#### **Relationships Explained:**
* A **Customer** can place **multiple Orders**.
* An **Order** can contain **one or more Grocery Items**.
* A **Grocery Item** can be part of **multiple Orders**.

### **🛠️ CRUD Operations**
The API provides comprehensive CRUD capabilities for all managed entities:

#### **👤 Customer Management**
* **Create**: Add new customer records.
* **Read**: Retrieve customer details by ID or list all customers.
* **Update**: Modify existing customer information.
* **Delete**: Remove customer records from the system.

#### **🍎 Grocery Item Management**
* **Create**: Add new grocery items to the catalog.
* **Read**: Retrieve item details by ID or list all available items.
* **Update**: Adjust item details such as price, quantity, or category.
* **Delete**: Remove items from the grocery catalog.

#### **📝 Order Management**
* **Create**: Place new orders for customers, specifying items and quantities.
* **Read**: Retrieve specific order details by ID or list all orders.
* **Update**: Modify order details (e.g., status, items *if applicable in future enhancements*).
* **Delete**: Cancel or remove order records.

***

## 🌐 **API Endpoints**
The following RESTful endpoints are designed to interact with the system's entities:

| Endpoint | HTTP Method | Description |
| :--- | :--- | :--- |
| `/api/customers` | `GET` | Retrieve all customers. |
| `/api/customers/{id}` | `GET` | Retrieve a customer by ID. |
| `/api/customers` | `POST` | Create a new customer. |
| `/api/customers/{id}` | `PUT` | Update an existing customer. |
| `/api/customers/{id}` | `DELETE` | Delete a customer. |
| `/api/items` | `GET` | Retrieve all grocery items. |
| `/api/items/{id}` | `GET` | Retrieve a grocery item by ID. |
| `/api/items` | `POST` | Create a new grocery item. |
| `/api/items/{id}` | `PUT` | Update an existing grocery item. |
| `/api/items/{id}` | `DELETE` | Delete a grocery item. |
| `/api/orders` | `GET` | Retrieve all orders. |
| `/api/orders/{id}` | `GET` | Retrieve an order by ID. |
| `/api/orders` | `POST` | Create a new order. |
| `/api/orders/{id}` | `PUT` | Update an existing order. |
| `/api/orders/{id}` | `DELETE` | Delete an order. |

***

## ⚙️ **Tech Stack**
* **Framework**: `Spring Boot` (3.x)
* **Database**: `MySQL` (for persistence) or `H2` (in-memory for development)
* **ORM**: `Spring Data JPA`
* **Build Tool**: `Maven`
* **Utility**: `Lombok` (for reducing boilerplate code)

***

## 📦 **How to Run**
1.  **Clone the repository**:
    ```bash
    git clone [YOUR_REPOSITORY_URL_HERE]
    cd online-grocery-order-management
    ```
    (Replace `[YOUR_REPOSITORY_URL_HERE]` with the actual URL of your GitHub repository.)
2.  **Configure the database**:
    * For **H2 (in-memory, recommended for local dev)**: No specific setup needed. The application will use an in-memory database by default.
    * For **MySQL**: Update `src/main/resources/application.properties` with your MySQL connection details (URL, username, password).
3.  **Run the application**:
    ```bash
    ./mvnw spring-boot:run
    ```
    Alternatively, use your IDE's built-in run feature (e.g., in IntelliJ IDEA, run the `main` method of your `Application` class).

The API will be accessible at `http://localhost:8080`.

***

## 🤝 **Contribution**
Contributions are welcome! Feel free to open issues or submit pull requests.

***
