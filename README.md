# AbdulMannanNisar-NHSBSA

This repository contains an automated test suite for the NHSBSA's "Get help with paying for NHS costs" online service. The test suite has been created using User Centric BDD, Java & Selenium.
Welcome to the test repository for the NHSBSA Get Help with Paying for NHS Costs Online Service. This repository contains the test suite and plans for testing the service.
User Story
As a citizen of the UK, I need to know what help I can get with my NHS costs So that I can get the treatment I need.

Test Suite
The test suite has been developed using User Centric BDD, Java, and Selenium, and follows BDD best practices. The suite has been created to cover the acceptance, accessibility, and compatibility testing of the service.

Setup
To run the tests in this repository, you will need to have the following installed:
Java 8 JDK or higher
Maven
Edge and Firefox browsers
Running the tests
IDE used: Intellij IDEA 
To run the tests, clone the repository and execute the following command in your terminal:

mvn test


To generate Test HTML Report, execute the following command in your terminal:
mvn verify

The tests will run in both Edge and Firefox browsers. The results of the test execution will be displayed in the console output as well as HTML report.



Test Approach

Test Approach
For the automation testing of the "Get Help With Paying for NHS Costs" service, the following approach was taken:
User-centric BDD: The tests were designed from the user's perspective using the Cucumber framework, adhering to all BDD best practices.
Function reusability: A functions file was created to reuse common clicks and sendkeys functionality across different test scenarios.
Three test classes: Three classes were created to test the service on Edge, Firefox, and mobile devices respectively.
Driver initialization: The Edge and Firefox driver initiations were performed without using locally downloaded drivers. The tests call the functions file methods. For mobile testing, we set the window dimension of Edge browser for mobile size testing.
Overall, this approach was aimed at ensuring a thorough testing of the service for functionality and compatibility across different devices, operating systems, and browsers.
Used Assertions where ever required
