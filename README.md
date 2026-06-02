# Gameloft QA Automation Challenge

## Technologies Used

- Java 17
- Selenium WebDriver
- JUnit 5
- Rest Assured
- Maven

## Automated UI Tests

### 1. Homepage loads successfully
Verifies that the Ludigames homepage can be opened successfully.

### 2. Homepage contains game cards
Verifies that at least one game card is displayed.

### 3. Clicking first game opens game page
Verifies navigation from homepage to a game details page.

### 4. Search button is visible
Verifies that the search functionality is accessible to users.

## Automated API Tests

### 5. Homepage returns HTTP 200
Verifies that the homepage endpoint responds successfully.

### 6. Homepage responds within acceptable time
Verifies response time is below 3000ms.

## How to Run

```bash
mvn test
