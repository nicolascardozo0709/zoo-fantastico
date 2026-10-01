# Zoo de Mascotas Fantásticas - CRUD en Spring Boot

Sistema de gestión para el **Zoo de Mascotas Fantásticas**, desarrollado como práctica de laboratorio de la asignatura **Principios de Desarrollo de Software**.

## Integrantes
- Nicolás Cardozo
- Nicolás Espinosa
- Gustavo Mejía
- Samuel Correa

## Docente
- Santiago Peña

---

## Arquitectura del Sistema
El proyecto implementa una arquitectura desacoplada en tres capas:
1. **Capa de Presentación (REST Controllers):** Exposición de endpoints HTTP (`/api/creatures`, `/api/zones`) y manejo global de excepciones con `@RestControllerAdvice`.
2. **Capa de Lógica de Negocio (Services):** Implementación de reglas de negocio (restricción de eliminación de criaturas en estado crítico, control de capacidad máxima de zonas, y cálculo dinámico de criaturas por zona).
3. **Capa de Acceso a Datos (Repositories):** Mapeo objeto-relacional mediante Spring Data JPA e Hibernate con conexión a base de datos MySQL.

## Tecnologías Empleadas
- **Java 21 LTS**
- **Spring Boot 3.3.4**
- **Spring Data JPA & Hibernate**
- **MySQL Server 8.0**
- **Jakarta Bean Validation**
- **Project Lombok**
- **Apache Maven**

---

## Estructura Gitflow
El repositorio sigue la estrategia de ramificación Gitflow:
- `main`: Código estable y probado para producción.
- `develop`: Rama troncal de integración continua.
- `feature/*`: Ramas de características modulares (`feature/creature-crud`, `feature/zone-extension`, `feature/validations-exceptions`).

## Ejecución del Proyecto
Para ejecutar la aplicación localmente:
```bash
./mvnw spring-boot:run
```
O compilar el paquete JAR:
```bash
./mvnw clean package
java -jar target/zoo-fantastico-0.0.1-SNAPSHOT.jar
```
