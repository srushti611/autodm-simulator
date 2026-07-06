# 🚀 AutoDM Automation Hub

An open-source, full-stack **Auto-DM & Smart Campaign Simulator** designed for digital content creators to automate audience engagement. Built using **Spring Boot 3.x**, **Spring Data JPA**, an in-memory **H2 Database**, and a responsive, sleek **Tailwind CSS** single-page frontend interface.

---

## 📋 Table of Contents
- [Core Features](#-core-features)
- [System Architecture](#-system-architecture)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
- [API Documentation](#-api-documentation)
- [Future Production Roadmap](#-future-production-roadmap)
- [License](#-license)

---

## ✨ Core Features
- **Keyword Automation Triggers:** Map specific keywords (e.g., `GROW`, `REELS`) to automated text/link message flows.
- **Conversion Analytics:** Tracks dynamic triggers and increments engagement analytics in real-time.
- **Active System Controls:** Pause or activate individual trigger campaigns smoothly via a clean UI toggle.
- **Production Simulation Sandbox:** Built-in actions to test and demo live API calls without needing external tokens.

---

## 🏗️ System Architecture

The application implements a clean layered MVC architecture patterns enabling complete decoupling of frontend and backend concerns:

- **Frontend Layer:** Built using a single-page HTML5 framework styled dynamically with Tailwind CSS utility classes. Network operations use asynchronous JavaScript `fetch()` promises.
- **Controller Layer (`Spring Web`):** Exposes secure REST endpoints that handle HTTP operations and structure inbound payload conversions.
- **Data Access Layer (`Spring Data JPA`):** Bridges runtime data entities seamlessly to storage engines without hardcoded boilerplate SQL queries.
- **Persistence Layer (`H2 Engine`):** Lightweight relational data schema operating strictly inside virtual runtime memory grids.

---

## 🛠️ Tech Stack
- **Backend:** Java 17+, Spring Boot, Spring Data JPA, Hibernate
- **Database:** H2 In-Memory Relational Engine
- **Frontend:** HTML5, JavaScript (ES6 Fetch API), Tailwind CSS
- **Deployment:** Render / Railway App Cloud Configurations

---

## 🚀 Getting Started

Follow these instructions to run a local development instance of the automation hub:

### Prerequisites
- Java Development Kit (JDK) 17 or higher installed
- Apache Maven installed (or use the included Maven wrapper)

### Installation & Local Run
1. Clone the public open-source repository:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/autodm-simulator.git](https://github.com/YOUR_USERNAME/autodm-simulator.git)
   cd autodm-simulator