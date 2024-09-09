package Application;

import java.util.*;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Patron> patrons = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void registerPatron(Patron patron) {
        patrons.put(patron.getName(), patron);
    }

    public boolean loanBook(String title, String patronName) {
        Book book = books.get(title);
        Patron patron = patrons.get(patronName);
        if (book != null && patron != null && !book.isLoaned()) {
            book.setLoaned(true);
            return true;
        }
        return false;
    }

    public boolean returnBook(String title) {
        Book book = books.get(title);
        if (book != null && book.isLoaned()) {
            book.setLoaned(false);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Add some books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("1984", "George Orwell"));

        // Register some patrons
        library.registerPatron(new Patron("John Doe"));
        library.registerPatron(new Patron("Jane Smith"));

        while (true) {
            System.out.println("\nLibrary System:");
            System.out.println("1. Loan Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 1) {
                System.out.print("Enter book title to loan: ");
                String title = scanner.nextLine();
                System.out.print("Enter patron name: ");
                String patronName = scanner.nextLine();
                if (library.loanBook(title, patronName)) {
                    System.out.println("Book loaned successfully.");
                } else {
                    System.out.println("Failed to loan the book.");
                }
            } else if (option == 2) {
                System.out.print("Enter book title to return: ");
                String title = scanner.nextLine();
                if (library.returnBook(title)) {
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Failed to return the book.");
                }
            } else if (option == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
