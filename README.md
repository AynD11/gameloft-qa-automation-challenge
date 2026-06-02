# Gameloft QA Automation Challenge

## Technologies Used

* Java 17
* Selenium WebDriver
* JUnit 5
* Rest Assured
* Maven

---

## Automated UI Tests

### 1. Homepage Loads Successfully

Verifies that the Ludigames homepage can be opened successfully.

### 2. Homepage Contains Game Cards

Verifies that at least one game card is displayed on the homepage.

### 3. Clicking First Game Opens Game Page

Verifies navigation from the homepage to a game details page.

### 4. Search Button Is Visible

Verifies that the search functionality is accessible to users.

---

## Automated API Tests

### 5. Homepage Returns HTTP 200

Verifies that the homepage endpoint responds successfully with status code 200.

### 6. Homepage Responds Within Acceptable Time

Verifies that the response time is below 3000ms.

---

## Why These Scenarios

I selected these scenarios because they cover the most important user flows and system checks on the website.

The automated tests validate:

* Homepage availability
* Visibility of game content
* Navigation to game pages
* Search accessibility
* API availability
* API performance

These checks provide a good balance between UI and API testing while validating the core functionality of the platform.

---

## How to Run

### Clone the repository

```bash
git clone https://github.com/AynD11/gameloft-qa-automation-challenge.git
```

### Navigate to the project folder

```bash
cd gameloft-qa-automation-challenge
```

### Run all tests

```bash
mvn test
```

---

## Test Results

All 6 automated tests were executed successfully.

* 4 UI tests
* 2 API tests

The project demonstrates both browser-based and API-based automated testing using Java, Selenium WebDriver, Rest Assured, JUnit 5, and Maven.

---

## Project Structure

```text
src
└── test
    └── java
        ├── HomePageTest.java
        └── ApiTest.java
```

* HomePageTest.java contains UI automation tests implemented using Selenium WebDriver.
* ApiTest.java contains API validation tests implemented using Rest Assured.

---



## Test Execution Result

All automated tests passed successfully.

<img width="1871" height="362" alt="Screenshot 2026-06-02 213840" src="https://github.com/user-attachments/assets/1d986ac3-4bb3-42de-a33b-4e21a7420e72" />


## Author

Ayan Dumitrescu
ASE Bucharest – Management





