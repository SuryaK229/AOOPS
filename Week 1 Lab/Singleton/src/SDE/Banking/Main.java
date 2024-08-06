package SDE.Banking;

public class Main {
    public static void main(String[] args) {
        // Get the single instance of UserSession
        UserSession session = UserSession.getInstance();

        // Create an instance of BankOperations
        Operations bankOps = new Operations();

        // Attempt to perform operations without logging in
        bankOps.viewBalance();
        bankOps.deposit(200);
        bankOps.withdraw(100);

        // Log in the user
        session.login();

        // Perform operations after logging in
        bankOps.viewBalance();
        bankOps.deposit(200);
        bankOps.withdraw(100);

        // Log out the user
        session.logout();

        // Attempt to perform operations after logging out
        bankOps.viewBalance();
        bankOps.deposit(200);
        bankOps.withdraw(100);
    }
}

