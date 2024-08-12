// Class representing a bank account
class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void viewBalance() {
        if (LoginManager.getInstance().isUserLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        if (LoginManager.getInstance().isUserLoggedIn()) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        if (LoginManager.getInstance().isUserLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}