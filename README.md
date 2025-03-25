Automated Testing for Cart Functionality

Project Overview

This project automates the testing of the cart functionality of an e-commerce website using Selenium WebDriver and Cucumber BDD. It ensures that core features such as adding, removing, updating products, and proceeding to checkout work as expected.

Technologies Used

Selenium WebDriver - For web automation

Java - Primary programming language

Cucumber BDD - For behavior-driven development

TestNG - For test execution

Maven - Dependency management

Page Object Model (POM) - Structured framework design

Features Tested

Add a Product to the Cart

Searches for a product

Selects the first product from search results

Adds the product to the cart

Verifies that the product is successfully added and cart count increases

Remove a Product from the Cart

Ensures the user has an item in the cart

Navigates to the cart page

Removes the product from the cart

Validates that the cart count decreases

Update Product Quantity in the Cart

Modifies the quantity of an existing cart item

Verifies that the total price updates correctly

Verify Empty Cart Message

Ensures an empty cart displays the correct message

Proceed to Checkout

Confirms that clicking "Proceed to Checkout" navigates to the checkout page

Folder Structure

Project Root
│── src/test/java
│   │── StepDefinitions/  # Cucumber step definitions
│   │── Runner/           # Cucumber test runner
│   │── POMData/          # Page Object Model classes
│── src/test/resources
│   │── Features/         # Cucumber feature files
│── pom.xml              # Maven dependencies
│── README.md            # Project documentation

How to Run the Tests

Clone the repository

git clone <repository-url>

Navigate to the project folder

cd project-folder

Run tests using Maven

mvn test

Prerequisites

Java (JDK 11 or later)

Maven installed

ChromeDriver/GeckoDriver for browser automation

Reporting

Test results are generated using Extent Reports, providing a detailed view of passed, failed, and skipped test cases.

Future Enhancements

Implementing API Testing for cart functionality

Adding more negative test scenarios

Running tests in parallel for faster execution

Author

Prince Raj - Software Test Engineer

