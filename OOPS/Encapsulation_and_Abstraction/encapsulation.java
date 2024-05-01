package OOPS.Encapsulation_and_Abstraction;

public class encapsulation {
    // Encapsulation is a fundamental principle in OOP that binds data (attributes)
    // and the methods that operate on that data into a single unit called a class.
    // It promotes data protection, modularity, and code reusability. By restricting
    // direct access to data, encapsulation enforces data integrity and consistency.

}

class Account {
    private int accountNumber;  // Private data member
    private double balance;     // Private data member

    // Public setter method with validation for minimum balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance: Must be non-negative.");
        }
    }

    // Public getter method
    public double getBalance() {
        return balance;
    }
}

