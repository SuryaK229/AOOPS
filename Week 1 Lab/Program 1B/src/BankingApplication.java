// Main class to demonstrate the banking application
public class BankingApplication {
    public static void main(String[] args) {
        LoginManager loginManager = LoginManager.getInstance();
        loginManager.login("JohnDoe");

        BankAccount account = new BankAccount();
        account.viewBalance();
        account.deposit(1000);
        account.viewBalance();
        account.withdraw(500);
        account.viewBalance();

        loginManager.logout();
        account.viewBalance();
    }
}