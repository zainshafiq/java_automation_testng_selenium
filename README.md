# Selenium Demo Project

This is a sample Java project demonstrating **Selenium WebDriver** automation with **TestNG** using Maven.  

## Project Structure

- `src/main/java`: Contains main Java classes (e.g., `GoogleTest.java`)
- `src/test/java`: Contains test classes using TestNG (e.g., `FirstTest.java`)
- `pom.xml`: Maven configuration file with dependencies for Selenium, TestNG, and WebDriverManager

## Features

- Automates browser actions using Selenium WebDriver
- Uses TestNG for test execution and assertions
- WebDriverManager automatically manages browser drivers

## How to Run

### Run Tests with Maven

```bash
mvn clean test
```

### Run a Java Class Directly

```bash
mvn compile exec:java
```
