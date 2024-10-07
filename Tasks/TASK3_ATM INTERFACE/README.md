# ATM Application

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Overview
The **ATM Application** is a simple console-based application developed in Java that simulates the basic functionalities of an Automated Teller Machine (ATM). Users can perform operations such as depositing money, withdrawing cash, and checking their account balance through a straightforward user interface.

## Features
- **Deposit Funds**: Users can deposit money into their bank account.
- **Withdraw Funds**: Users can withdraw money with validation for sufficient balance.
- **Check Balance**: Users can view their current account balance.
- **User-Friendly Menu**: Interactive menu system for easy navigation.

## Technologies Used
- **Java**: The programming language used for development.
- **Java SDK**: Version 8 or higher is required to run the application.
- **IDE/Text Editor**: Any IDE (e.g., IntelliJ IDEA, Eclipse) or text editor (e.g., VSCode) for coding.

## Getting Started

### Prerequisites
Before you begin, ensure you have met the following requirements:
- JDK 8 or higher installed on your machine.
- A suitable IDE or text editor to edit Java code.

### Installation
1. **Clone the repository** to your local machine:
   ```bash
   git clone https://github.com/PriyantNikhare/CODSOFT.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd Task/TASK3_ATM INTERFACE
   ```

## Running the Application
1. **Open the `ATMApplication.java` file** in your preferred IDE or text editor.
2. **Compile the Java file** using the terminal:
   ```bash
   javac ATMApplication.java
   ```
3. **Run the compiled Java application**:
   ```bash
   java ATMApplication
   ```

## Usage
- Upon starting the application, the user will be presented with a menu containing the following options:
  1. Deposit
  2. Withdraw
  3. Check Balance
  4. Exit
- **Select an option** by entering the corresponding number.
- Follow the on-screen prompts to complete your transactions.

## Code Structure
- **ATMApplication.java**: Main class that runs the ATM application.
- **BankAccount**: Class that manages the bank account balance and operations (deposit, withdraw, check balance).
- **ATM**: Class that provides the ATM interface and handles user interactions.

### Sample Code
Here’s a brief overview of the key classes:

1. **BankAccount.java**
   ```java
   class BankAccount {
       private double balance;

       public BankAccount(double initialBalance) {
           this.balance = initialBalance;
       }

       public void deposit(double amount) { /* Implementation */ }
       public void withdraw(double amount) { /* Implementation */ }
       public double checkBalance() { return balance; }
   }
   ```

2. **ATM.java**
   ```java
   class ATM {
       private BankAccount account;

       public ATM(BankAccount account) { this.account = account; }
       public void displayMenu() { /* Implementation of the menu */ }
   }
   ```

3. **ATMApplication.java**
   ```java
   public class ATMApplication {
       public static void main(String[] args) {
           BankAccount userAccount = new BankAccount(10000.0);
           ATM atm = new ATM(userAccount);
           atm.displayMenu();
       }
   }
   ```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
- This application is a demonstration project for educational purposes and does not connect to a real banking system.
- Special thanks to the developers and educators who contribute to the Java programming community.

## Contributing
Contributions are welcome! If you have suggestions for improvements or features, please open an issue or submit a pull request.

## Contact
For any inquiries, please contact [nikharepriyant@gmail.com](mailto:nikharepriyant@gmail.com).