
---

# Cucumber BDD with Java

Welcome to the **Cucumber BDD Concepts** repository! This project is designed to help students and professionals understand the fundamentals of Behavior-Driven Development (BDD) using **Cucumber** with **Java**. We use **Maven** as the build tool to manage dependencies, run tests, and build the project.

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Running Cucumber Tests](#running-cucumber-tests)
- [Project Structure](#project-structure)
- [Key Cucumber BDD Concepts Covered](#key-cucumber-bdd-concepts-covered)
- [Presentation Deck](CucumberDeck.pdf)

## Overview

This repository covers the following Cucumber BDD concepts:
- Writing **Gherkin** scenarios
- Mapping feature files to step definitions
- Implementing reusable step definitions
- Using **Scenario Outlines** and **Examples**
- Data Tables for handling data-driven scenarios
- Hooks for setup and teardown logic
- Parameterized steps
- Running Cucumber with **JUnit**
- Custom reporting and more.

Each topic is demonstrated through code examples to make learning easier.

## Prerequisites

Before using this repository, ensure you have the following installed on your system:

- **Java Development Kit (JDK) 8 or later**  
  Download and install from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).

- **Maven**  
  Download and install from [Maven](https://maven.apache.org/install.html).

- **Git**  
  To clone the repository, ensure Git is installed. Download it from [here](https://git-scm.com/downloads).

## Setup Instructions

1. **Clone the Repository**  
   Open a terminal and run the following command to clone the repository to your local machine:
   ```bash
   git clone https://github.com/rakesh-vardan/Learn_TA_CucumberBDD
   ```

2. **Navigate to the Project Directory**  
   Move into the project folder:
   ```bash
   cd Learn_TA_CucumberBDD
   ```

3. **Build the Project**  
   Use Maven to clean and install the project dependencies:
   ```bash
   mvn clean install
   ```

4. **Open the Project in Your IDE**  
   You can open this project in **IntelliJ IDEA**, **Eclipse**, or any other Java IDE. Maven will automatically download and configure the required dependencies.

## Running Cucumber Tests

You can run the Cucumber tests directly from your IDE or using Maven from the command line.

### To run tests using Maven from the command line:

```bash
mvn clean test
```

This command will run all the feature files specified in the `src/test/resources` directory.

### Running a Specific Cucumber Feature File:

You can specify a particular feature file to run by configuring the **Maven Surefire Plugin** or using the following Maven command:

```bash
mvn test -Dcucumber.options="src/test/resources/features/specificFeature.feature"
```

This command will run only the specified feature file.

## Project Structure

```bash
.
├── src
│   ├── main
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── cucumber
│       │               ├── stepdefinitions
│       │               ├── runners
│       │               └── hooks
│       └── resources
│           ├── features
│           │   ├── feature1.feature
│           │   └── feature2.feature
│           └── cucumber.properties
├── pom.xml
└── README.md
```

- **src/main**: Empty as this project focuses on tests.
- **src/test/java**: Contains step definitions, test runners, and hooks.
- **src/test/resources**: Holds all feature files and Cucumber configuration files.
    - **features**: Directory containing Gherkin feature files.
    - **cucumber.properties**: Cucumber configuration file for settings such as reports and glue code locations.

## Key Cucumber BDD Concepts Covered

This repository provides examples for the following Cucumber BDD concepts:

- **Feature Files**: Writing feature files with Gherkin syntax.
- **Step Definitions**: Mapping feature steps to Java methods.
- **Scenario Outlines**: Handling data-driven tests with Examples.
- **Data Tables**: Using data tables to handle structured data.
- **Hooks**: Implementing `@Before` and `@After` hooks for setup and teardown logic.
- **Parameterized Steps**: Creating reusable steps with parameters.
- **Cucumber with JUnit**: Running Cucumber tests using JUnit.
- **Custom Reports**: Generating custom reports for better insights.

Each example is designed with comments and explanations to ensure a smooth learning experience.

---
