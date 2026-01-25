README.md
# 📘 Banking Management System – Java (Console Based)

📌 PROJECT DESCRIPTION

This is a console based Banking Management System developed in Core Java using MVC Architecture.  
The application works completely in the terminal and follows a menu-driven approach.  

It supports multiple account types, basic banking transactions, fund transfer, loan calculation, and monthly reporting.  
All data is stored using **arrays only**, without using any collection framework.

---

📂 PROJECT ARCHITECTURE – MVC

The project is divided into three main layers following the MVC pattern.

1️⃣ MODEL  
This layer contains all account related classes and transaction data.

- Account1 (Abstract Parent Class)  
- SavingAccount1  
- CurrentAccount1  
- SalaryAccount1  
- LoanAccount1  
- Transaction1  

2️⃣ CONTROLLER   
This layer contains the main business logic of the application.

- TransactionManager1 – Used to store and manage all transactions  
- Bank1 – Handles account creation, transfer, reports, and validations  

3️⃣ VIEW   
This layer is responsible for user interaction through console.

- Main – Menu-driven console based interface  

---

🚀 FEATURES & FUNCTIONALITIES

✔ ACCOUNT MANAGEMENT

- Create different types of accounts  
  - Saving Account  
  - Current Account  
  - Salary Account  
  - Loan Account  
 
- Delete existing account  
- Minimum balance rule for Saving Account  
- Overdraft facility for Current Account  
- Freeze condition for Salary Account  
- Account creation date is stored  

✔ TRANSACTION MANAGEMENT

- Deposit money  
- Withdraw money  
- View debit and credit transactions  
- Fund transfer between two accounts  
- Monthly transaction summary  

✔ LOAN MANAGEMENT

- Create loan account  
- Calculate simple interest  
- Store interest as transaction record  

✔ REPORTS

- Check current balance  
- Monthly bank report  
- Account type summary  
- Transaction filtering  

---

✔ STORAGE


Account1 accounts[] = new Account1[80];  
Transaction1 transactions[] = new Transaction1[200];

---

🛠 TECHNOLOGY STACK

Language      : Java (Core Java)  
Architecture : MVC Pattern  
Data Storage : Arrays Only  
Interface    : Console Based  

---

▶ HOW TO RUN

1️⃣ Compile the program  

javac Main.java  

2️⃣ Run the program  

java Main  

3️⃣ Use the menu options to perform banking operations  

---

📑 SAMPLE MENU FORMAT

===== BANK MENU =====  
1. Create Account  
2. Deposit  
3. Withdraw  
4. Show Transactions  
5. Check Balance  
6. Monthly Bank Report  
7. Calculate Interest  
8. Delete Account  
9. Transfer Money  
10. Exit  
