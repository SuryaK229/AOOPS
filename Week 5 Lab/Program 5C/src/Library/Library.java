package Library;

public class Library {
    public static void main(String[] args) {
        Book book1 = new PhysicalBook("Harry Potter", "J.K. Rowling");
        Book book2 = new PhysicalBook("The Hobbit", "J.R.R. Tolkien");

        Member member1 = new RegularMember("Alice", 101);
        Member member2 = new RegularMember("Bob", 102);

        Service borrowService = new SimpleBorrowService();

        borrowService.borrowBook(member1, book1);
        borrowService.borrowBook(member2, book1); 

        borrowService.returnBook(member1, book1);
        borrowService.borrowBook(member2, book1); 
    }
}

