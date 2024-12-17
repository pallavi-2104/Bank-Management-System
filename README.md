# 🌟 Bank Management System  

## 🏦 Overview  
XYZ Bank's **Bank Management System** automates the basic functionality of one branch, including:  
- 🧾 Over-the-counter activities  
- 📂 Account lifecycle management  
- 📊 Interest calculation  
- 📜 Generating end-of-day transaction reports  

The system supports various account types, offering tailored features to enhance operational efficiency.  

## 🚀 Features  
1. **Over-the-Counter Activities**  
   - 💵 Deposits, withdrawals, and balance inquiries  
   - 🔄 Fund transfers between accounts  

2. **Account Lifecycle Management**  
   - 🆕 Create, update, and close accounts  
   - ❄️ Freeze accounts with inactivity or insufficient balance as per account rules  

3. **Interest Calculation**  
   - 📈 Automated interest computation for savings and loan accounts  

4. **Daily Transaction Report**  
   - 📑 Summarized report for all transactions at the end of the day  

## 📂 Account Types  

### 1. **💳 Savings Account**  
   - Minimum average balance of ₹10,000 required  
   - ⚠️ Penalty for failing to maintain the required balance  

### 2. **💼 Salary Account**  
   - Functions like a savings account but requires at least one transaction every two months  
   - 🛑 Accounts with no transactions for two months are frozen, and the account holder is notified  

### 3. **🏢 Current Account**  
   - No minimum balance requirement  
   - 🔒 Overdraft facility available with a predefined maximum withdrawal limit  

### 4. **📉 Loan Account**  
   - Tracks the loan repayment for customers  
   - Starts with a negative initial balance, representing the loan amount borrowed  

## 🛠️ Technology Stack  
- **Programming Language**: Java  
- **Frameworks**: Java Collections Framework, JDBC for database operations  
- **Tools**: ID Eclipse 17

🧩 Project Structure
Main.java: Entry point of the application.
Account.java: Base class for handling common account functionalities.
SavingsAccount.java, SalaryAccount.java, CurrentAccount.java, LoanAccount.java: Subclasses implementing specific rules for each account type.
DatabaseManager.java: Manages database connections and queries.
ReportGenerator.java: Generates end-of-day transaction reports.
Start
  |
  v
User Login
  |
  v
Account Selection
  |
  +------------------------+
  |                        | 
Savings Account      Other Account Types
  |                        |
  v                        v
Actions:             Actions:
- View Balance       - Deposit Money
- Deposit Money      - Withdraw Money
- Withdraw Money     - View Balance
- Calculate Interest
  |
  v
Database Interaction
  |
  v
Generate Report
  |
  v
Log Out
  |
  v
End


## 📝 Installation and Setup  
1. Clone this repository:  
   ```bash  
   git clone https://github.com/pallavi-2104/bank-management-system.git  

