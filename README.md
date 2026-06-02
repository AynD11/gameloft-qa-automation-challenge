# Gameloft QA Automation Challenge

## Technologies Used

- Java 17
- Selenium WebDriver
- JUnit 5
- Rest Assured
- Maven

---

## Automated UI Tests

### 1. Homepage loads successfully

Verifies that the Ludigames homepage can be opened successfully.

### 2. Homepage contains game cards

Verifies that at least one game card is displayed.

### 3. Clicking first game opens game page

Verifies navigation from the homepage to a game details page.

### 4. Search button is visible

Verifies that the search functionality is accessible to users.

---

## Automated API Tests

### 5. Homepage returns HTTP 200

Verifies that the homepage endpoint responds successfully.

### 6. Homepage responds within acceptable time

Verifies that the response time is below 3000ms.

---

## Why These Scenarios

I selected these scenarios because they cover the most important user flows and system checks on the website.

The automated tests validate:

- Homepage availability
- Visibility of game content
- Navigation to game pages
- Search accessibility
- API availability
- API performance

These checks provide a good balance between UI and API testing while validating the core functionality of the platform.

---

## How to Run

Clone the repository:

```bash
git clone https://github.com/AynD11/gameloft-qa-automation-challenge.git
```

Navigate to the project folder:

```bash
cd gameloft-qa-automation-challenge
```

Run all tests:

```bash
mvn test
```

---

## Test Results

All 6 automated tests pass successfully.

- 4 UI tests
- 2 API tests

The project demonstrates both browser-based and API-based automated testing using Java, Selenium WebDriver, Rest Assured, JUnit 5, and Maven.
