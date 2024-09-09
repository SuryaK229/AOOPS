import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    private Deque<String> backStack = new ArrayDeque<>();
    private Deque<String> forwardStack = new ArrayDeque<>();
    private String currentPage = "Home";

    public void visit(String page) {
        if (!currentPage.equals("Home")) {
            backStack.addLast(currentPage);
        }
        currentPage = page;
        forwardStack.clear();
        System.out.println("Visited: " + page);
    }

    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("No previous page.");
        } else {
            forwardStack.addFirst(currentPage);
            currentPage = backStack.removeLast();
            System.out.println("Went back to: " + currentPage);
        }
    }

    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No next page.");
        } else {
            backStack.addLast(currentPage);
            currentPage = forwardStack.removeFirst();
            System.out.println("Went forward to: " + currentPage);
        }
    }

    public void showCurrent() {
        System.out.println("Current page: " + currentPage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowserHistory history = new BrowserHistory();

        while (true) {
            System.out.println("\n1. Visit Page\n2. Go Back\n3. Go Forward\n4. Show Current Page\n5. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String page = scanner.nextLine();
                    history.visit(page);
                    break;
                case 2:
                    history.goBack();
                    break;
                case 3:
                    history.goForward();
                    break;
                case 4:
                    history.showCurrent();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
            scanner.close();
        }
    }
}
