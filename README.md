# 🛒 Automated Testing for Cart Functionality

## 📌 Project Overview  
This project automates the cart functionality of an e-commerce website using **Selenium WebDriver** and **Cucumber BDD**. It validates core cart operations such as:  
- Adding products  
- Removing products  
- Updating product quantities  
- Proceeding to checkout  

The goal is to ensure a seamless shopping experience by catching potential issues through automated testing.  

---

## 🛠️ Technologies Used  
- **Selenium WebDriver** – Web automation tool  
- **Java** – Programming language  
- **Cucumber BDD** – Behavior-driven testing framework  
- **TestNG** – Test execution and assertions  
- **Maven** – Dependency and build management  
- **Page Object Model (POM)** – Framework for maintainable code  

---

## ✅ Features Tested  

### 1️⃣ Add a Product to the Cart  
✔️ Searches for a product  
✔️ Selects the first search result  
✔️ Adds the product to the cart  
✔️ Verifies cart count increases  

### 2️⃣ Remove a Product from the Cart  
✔️ Ensures a product is in the cart  
✔️ Navigates to the cart page  
✔️ Removes the product  
✔️ Validates cart count decreases  

### 3️⃣ Update Product Quantity in the Cart  
✔️ Modifies product quantity  
✔️ Checks if the total price updates accordingly  

### 4️⃣ Verify Empty Cart Message  
✔️ Ensures an empty cart displays the correct message  

### 5️⃣ Proceed to Checkout  
✔️ Confirms that clicking **"Proceed to Checkout"** redirects to the checkout page  

---

## 📂 Folder Structure  
── src/test/java │ │── StepDefinitions/ # Cucumber step definitions │ │── Runner/ # Cucumber test runner │ │── POMData/ # Page Object Model classes │── src/test/resources │ │── Features/ # Cucumber feature files │── pom.xml # Maven dependencies │── README.md # Project documentation


---

## 🚀 How to Run the Tests  
### 1️⃣ Clone the repository  
```sh
git clone <https://github.com/princu2701/CucumberPom_Selenium-Java_Project/>

## 🔧Prerequisites
Java (JDK 11 or later)

##📊 Reporting
Test results are generated using Extent Reports, providing a detailed view of:
✔️ Passed test cases
❌ Failed test cases
⚠️ Skipped test cases

##🔮 Future Enhancements

✅ Implement API Testing for cart functionality

✅ Add more negative test scenarios

✅ Run tests in parallel for faster execution

##Author

###Prince Raj

