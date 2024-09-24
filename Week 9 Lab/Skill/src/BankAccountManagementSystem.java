public class BankAccountManagementSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        Thread t1 = new Thread(new Transaction(account, true, 500.0), "User1");
        Thread t2 = new Thread(new Transaction(account, false, 200.0), "User2");
        Thread t3 = new Thread(new Transaction(account, true, 300.0), "User3");
        Thread t4 = new Thread(new Transaction(account, false, 700.0), "User4");
        Thread t5 = new Thread(new Transaction(account, false, 400.0), "User5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
