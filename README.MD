# Shuffle Log Service 📝

![Java 17](https://img.shields.io/badge/Java-17-blue?logo=openjdk\&logoColor=white)
![Spring Boot 3.4.5](https://img.shields.io/badge/Spring_Boot-3.4.5-brightgreen?logo=springboot\&logoColor=white)
![Maven 3.9.9](https://img.shields.io/badge/Maven-3.9.9-red?logo=apachemaven\&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Containerized-blue?logo=docker)
![Build](https://img.shields.io/github/actions/workflow/status/your-org/log-repo/build.yml?label=Build\&logo=github\&style=flat)
![License](https://img.shields.io/github/license/your-org/log-repo?style=flat\&logo=github)

This microservice is responsible for logging incoming requests from the shuffle service. It simply receives data via a POST request and prints it to the console.

---

## Features ✨

* POST endpoint `/log` to receive log data
* Simple Spring Boot controller
* Integrated with Docker

---

## API 📡

### POST `/log`

**Body:**

```json
{
  "timestamp": "2025-05-12T15:24:10",
  "message": "Shuffled number: 10"
}
```

**Response:**

```json
{"status": "logged"}
```

---

## Requirements ⚙️

* Java 17+
* Maven 3.6+
* Docker

---

## Getting Started 🚀

### 1. Clone the repository

```bash
git clone https://github.com/shlomi10/logService.git logProject
cd logProject
```

### 2. Package the application

```bash
mvn clean package -DskipTests
```

### 3. Build the Docker image

```bash
docker build . -t log-service:1.0
```

The image can now be used in your Docker Compose setup.

---

## Tech Stack 🛠️

* Spring Boot 3.4
* Java 17
* Maven
* Docker

---

## Notes 📝

* This service must be running and accessible at the URL configured in `LOG_SERVICE_URL` in the shuffle service.
* It has no database or state — purely prints to console.
