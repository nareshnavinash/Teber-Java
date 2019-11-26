# Selenium Cucumber Framework in Page Object Model

Basic Framework setup for Selenium with cucumber, maven and allure in Java

## Supports
* Multiple browser automation
* Multi browser automation
* Allure reports
* Jenkins Integration
* Modes of run via CLI command
* Headless run
* Docker Execution

## Yet to be added
* Multi Thread run

## To run the tests
```
mvn clean install
```
This will install the dependencies and runs the test

## To get allure report
```
mvn allure:serve
```
This will open the report in your default browser

## Multiple Browser
Initiate the driver class inside support package mutiple times with different WebDriver objects. You can execute the actions in multiple browsers at the same time by passing the WebDriver Object to the model methods.

## Multi Browser
Currently supports for Chrome browser, but handled in such a way that framework can be easily configured to support multiple browsers. I used webdriver manager to resolve the driver-browser compatibility issues, use the same to add your designated browser (firefox, edge, ie, safari etc.,).

