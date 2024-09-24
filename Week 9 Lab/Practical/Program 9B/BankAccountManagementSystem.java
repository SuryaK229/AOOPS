class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds. Current balance: " + balance);
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class Transaction implements Runnable {
    private BankAccount account;
    private boolean deposit;
    private double amount;

    public Transaction(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

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
