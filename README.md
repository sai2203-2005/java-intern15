# Payment Application (Console-Based)

A lightweight, console-based Java application demonstrating Object-Oriented Programming (OOP) concepts—specifically **interfaces**, **polymorphism**, and **loose coupling**—through a payment processing simulation.

---

## 📌 Features

- **Multiple Payment Modes**:
  - 💳 **Card Payment**: Simulates credit/debit card transactions.
  - 📱 **UPI Payment**: Simulates UPI/Virtual Payment Address transactions.
  - 👛 **Wallet Payment**: Simulates digital wallet payments.
- **Input Validation**: Ensures valid payment selection and that amount entered is strictly positive (`amount > 0`).
- **Extensible Architecture**: Built on a unified interface ([`PaymentMethod`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L4-L6)), allowing seamless addition of new payment providers (e.g., Net Banking, Crypto) without modifying existing implementations.

---

## 🏗️ Architecture & OOP Concepts

| Component | Type | Responsibility |
| :--- | :--- | :--- |
| [`PaymentMethod`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L4-L6) | Interface | Declares the contract `pay(double amount)`. |
| [`CardPayment`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L9-L16) | Class | Implements [`PaymentMethod`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L4-L6) for card payments. |
| [`UpiPayment`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L19-L26) | Class | Implements [`PaymentMethod`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L4-L6) for UPI transactions. |
| [`WalletPayment`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L29-L36) | Class | Implements [`PaymentMethod`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L4-L6) for wallet deductions. |
| [`PaymentApplication`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/PaymentApplication.java#L39-L79) | Main Class | Handles user input via `Scanner`, instantiates the selected payment class polymorphically, and triggers payment. |

---

## 📋 Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- Terminal / Command Prompt / PowerShell

Verify your installation:
```bash
java -version
javac -version
```

---

## 🚀 How to Compile and Run

1. **Open terminal** in the project directory:
   ```bash
   cd "c:\Users\sivas\OneDrive\Desktop\java intership"
   ```

2. **Compile** the Java source file:
   ```bash
   javac PaymentApplication.java
   ```

3. **Run** the compiled class:
   ```bash
   java PaymentApplication
   ```

---

## 💻 Sample Execution

```text
===== PAYMENT APPLICATION =====
1. Card Payment
2. UPI Payment
3. Wallet Payment
Choose your payment method: 2
Enter amount: Rs. 1500.50

===== PAYMENT STATUS =====
Processing UPI payment...
Payment of Rs. 1500.5 completed using UPI.
```

---

## 🔮 Future Enhancements

- 🔒 Add OTP / PIN verification steps.
- 🧾 Generate printable transaction receipts with unique Transaction IDs.
- 📜 Maintain transaction history and export to CSV/Database.
