import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinter {

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        printer.execute();
    }

    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 15; i++) {
            final int number = i;
            executor.submit(() -> {
                printTwo(number);
                printThree(number);
                printFour(number);
                printFive(number);
                printNumber(number);
            });
        }
        executor.shutdown();
    }

    public void printTwo(int number) {
        if (number % 2 == 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println("Number " + number + " is divisible by 2");
        }
    }

    public void printThree(int number) {
        if (number % 3 == 0 && number % 2 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println("Number " + number + " is divisible by 3");
        }
    }

    public void printFour(int number) {
        if (number % 4 == 0 && number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
            System.out.println("Number " + number + " is divisible by 4");
        }
    }

    public void printFive(int number) {
        if (number % 5 == 0 && number % 2 != 0 && number % 3 != 0 && number % 4 != 0) {
            System.out.println("Number " + number + " is divisible by 5");
        }
    }

    public void printNumber(int number) {
        if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println("Number " + number);
        }
    }
}
