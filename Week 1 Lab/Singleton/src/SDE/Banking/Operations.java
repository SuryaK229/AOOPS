package SDE;

// Class for banking operations
public class Operations {
    // Method to view balance
    public void viewBalance() {
        if (UserSession.getInstance().isLoggedIn()) {
            System.out.println("Balance: $1000");
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (UserSession.getInstance().isLoggedIn()) {
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (UserSession.getInstance().isLoggedIn()) {
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}

