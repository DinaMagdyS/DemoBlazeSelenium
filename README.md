<div align="center">
  <h1>Test Automation Project for Demoblaze Website</h1>
</div>

![DemoBlazeWebsite](https://github.com/user-attachments/assets/4aedf6f2-7ede-45e9-9ad1-762681171fc4)
![SeleniumE2E](https://github.com/user-attachments/assets/1acef93c-903d-4f21-a846-c5b0b4429d7b)

## Overview
This project automates testing processes on the Demoblaze website using Selenium WebDriver, TestNG, and Java. The aim is to validate the functionality of various user workflows such as user login, product selection, adding products to the cart, and completing a purchase.

* Automated end-to-end tests for user registration, login, and product purchase
* Data-driven testing with TestNG
* Page Object Model (POM) for maintaining a clean and scalable codebase
* Reports generated using TestNG and integrated into the project

## Technologies Used
<a href="https://selenium.dev" rel="nofollow"><img src="https://camo.githubusercontent.com/c14bdde117aab22a44a4a4f23e66844c855076e8beaf2e32f568ff53dce2450f/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" width="40" height="40" alt="Selenium" data-canonical-src="https://selenium.dev/images/selenium_logo_square_green.png" style="max-width: 100%;"></a>
- Selenium WebDriver  
- Java
- TestNG
- Maven (for managing dependencies)
- Emailable Reports (for generating test reports)

 ## Prerequisites
Before diving into the project, ensure you have the following prerequisites:

- Java (Version 8 or higher).
- Maven for project management.
- An IDE like Eclipse or IntelliJ.
- Selenium WebDriver (Java bindings).
- TestNG(for organizing test cases, managing test execution, and generating reports).
- Optionally, Allure Reports for enhanced reporting.

 ## Installation Instructions
   1. Clone the repository:
      git clone https://github.com/DinaMagdyS/DemoBlazeSelenium.git
  2. Navigate to the project directory.
  3. Install the required dependencies (Selenium WebDriver, TestNG) using Maven.

## Project Structure
The project structure is organized implementing POM as follows:

 - src/main/java: Contains classes and methods for every page.
 - src/test/java: Contains test automation scripts for every page on the website.

## Example Test Scenarios
Some of the automated test cases implemented are :
- Validate user can register and login
- Verify product can be added to the cart
- Ensure purchase flow works correctly
- Assert that cart total is accurate

## Execution


https://github.com/user-attachments/assets/89ac0935-8be1-46d9-87ec-7612e477ff61



## Testing and Reporting
Reporting is an integral part of the framework, and I've implemented the TestNG report feature to generate comprehensive test reports. Specifically, I utilized listeners such as:

Emailable Reporter: Generates a detailed email-friendly report that summarizes the test results.
Failed Reporter: Creates a report focusing on failed tests, enabling easy tracking and debugging of issues.
These reports facilitate a clear overview of test executions and failures, helping streamline test analysis and improve overall testing efficiency.

![EmailableReportPassed](https://github.com/user-attachments/assets/eebe0159-4c0c-4578-b529-90153f36cd17)


 ## Contributing 
 Contributions and collaboration are more than welcome and very much encouraged to make this project a valuable resource for the testing community.

 ## Team Collaboration
 This project was a team effort by Dina Magdy and Sarah Mohammed as part of our graduation project from the Software Testing Track - Information Technology Institute (ITI).

 ## Contact
 For any queries or assistance, feel free to contact me via email at dinamagdyelmorsy@outlook.com
 
  
