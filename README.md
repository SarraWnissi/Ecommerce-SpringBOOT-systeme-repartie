# 🛒 Ecommerce Web – CRUD Spring Boot Application

![Java](https://img.shields.io/badge/Java-22-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8-blue)
![Maven](https://img.shields.io/badge/Maven-3.6+-red)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

> Application **RESTful CRUD** pour la gestion des **catégories e-commerce**, développée avec **Spring Boot** et **Spring Data JPA**.

---

## ✨ Fonctionnalités

- ✅ Création, lecture, mise à jour et suppression (CRUD)
- 🌐 API REST claire et structurée
- 🗄️ Persistance des données avec MySQL
- 📦 Architecture en couches (Controller, Service, Repository)
- ⚡ Démarrage rapide avec Spring Boot

---

## 🛠️ Technologies utilisées

- **Java 22**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL 8**
- **Lombok**
- **Maven**

---

## 📋 Prérequis

Avant de commencer, assure-toi d’avoir :

- JDK **22** ou supérieur
- Maven **3.6+**
- MySQL **8.0+**
- XAMPP (ou tout autre serveur MySQL)
- IntelliJ IDEA *(recommandé)*

---

## ⚙️ Installation & Configuration

### 1️⃣ Création du projet

- Ouvrir **IntelliJ IDEA**
- **New Project → Spring Initializr**
- Nom : `Ecommerceweb`
- Langage : **Java**
- Build tool : **Maven**
- Java : **22**
- Packaging : **Jar**
- Dépendances :
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Lombok

---

### 2️⃣ Configuration de la base de données

Créer la base de données MySQL :

```sql
CREATE DATABASE ecommerceweb;

### Structure du projet

Ecommerceweb/
├── src/
│   ├── main/
│   │   ├── java/com/example/ecommweb/
│   │   │   ├── EcommwebApplication.java
│   │   │   ├── controller/
│   │   │   │   └── CategorieController.java
│   │   │   ├── model/
│   │   │   │   └── Categorie.java
│   │   │   ├── repositories/
│   │   │   │   └── CategorieRepositorie.java
│   │   │   ├── services/
│   │   │   │   └── CategorieService.java
│   │   │   └── ImplServices/
│   │   │       └── CategorieImpService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md




Lancement de l’application
Option 1 : IntelliJ IDEA

Clic droit sur EcommwebApplication

Run

Option 2 : Maven
mvn spring-boot:run

Option 3 : JAR
mvn clean package
java -jar target/Ecommerceweb-0.0.1-SNAPSHOT.jar


📍 Application disponible sur :
👉 http://localhost:8080

🌐 API Endpoints
Méthode	Endpoint	Description	Code
GET	/api/categories	Récupérer toutes les catégories	200
GET	/api/categories/{id}	Récupérer une catégorie par ID	200
POST	/api/categories	Créer une catégorie	201
PUT	/api/categories/{id}	Mettre à jour une catégorie	200
DELETE	/api/categories/{id}	Supprimer une catégorie	204
📦 Exemple JSON
{
  "nomcategorie": "Informatique",
  "imagecategorie": "informatique.png"
}

📌 Auteur

👩‍💻 Sarra Wnissi
Étudiante en informatique – Spring Boot & Microservices

