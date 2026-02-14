# Advance_Java_Assignment
# 📦 Hibernate Product CRUD – Assessment 1

## 📌 Project Overview
This project demonstrates basic *CRUD (Create, Read, Update, Delete)* operations using *Hibernate ORM (6.x)* with a *MySQL* database.

It is developed as part of an Advanced Java assessment to showcase:
•⁠  ⁠Hibernate configuration (XML + Programmatic)
•⁠  ⁠Entity mapping using JPA annotations
•⁠  ⁠DAO layer implementation
•⁠  ⁠Separate CRUD methods

---

## 🛠️ Technologies Used

•⁠  ⁠Java 21  
•⁠  ⁠Hibernate ORM 6.4  
•⁠  ⁠MySQL 8  
•⁠  ⁠Maven  
•⁠  ⁠SLF4J (Logging)

---

## 📂 Project Structure


src/main/java/org/example/
    ├── Product.java
    ├── HibernateUtil.java
    ├── ProductDAO.java
    └── Main.java

src/main/resources/
    └── hibernate.cfg.xml

pom.xml


---

## 🗂️ Entity: Product

⁠ java
public class Product {

    private Long id;
    private String name;
    private String description;
    private String category;
    private int quantity;
    private double price;
    private String sku;     // Unique stock keeping unit
    private boolean active;
}
 ⁠

•⁠  ⁠⁠ id ⁠ is auto-generated
•⁠  ⁠⁠ sku ⁠ is unique
•⁠  ⁠Entity mapped using JPA annotations

---

## ⚙️ Hibernate Configuration

•⁠  ⁠Uses ⁠ hibernate.cfg.xml ⁠
•⁠  ⁠Also configured programmatically using:

⁠ java
Configuration configuration = new Configuration();
Properties properties = new Properties();
 ⁠

•⁠  ⁠Database auto table creation enabled:


hibernate.hbm2ddl.auto = update


---

## 🔄 CRUD Operations

Separate methods implemented in ⁠ ProductDAO ⁠:

•⁠  ⁠Create Product  
•⁠  ⁠Read Product  
•⁠  ⁠Update Product  
•⁠  ⁠Delete Product  

All database operations use Hibernate Session & Transaction management.

---

## ▶️ How to Run the Project

1️⃣ Create MySQL Database:

⁠ sql
CREATE DATABASE test;
 ⁠

2️⃣ Update database credentials in:


src/main/resources/hibernate.cfg.xml


3️⃣ Build the project:


mvn clean install


4️⃣ Run:


Main.java


---

## ✅ Expected Output

•⁠  ⁠Table creation (if not exists)
•⁠  ⁠Insert product
•⁠  ⁠Fetch product
•⁠  ⁠Update product
•⁠  ⁠Delete product
•⁠  ⁠Successful shutdown

---

## 👨‍💻 Author

Akshat Sagar 
Advanced Java – Assessment 1
