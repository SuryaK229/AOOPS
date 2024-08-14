package Library;

interface Service {
    void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
}

class SimpleBorrowService implements Service {

    @Override
    public void borrowBook(Member member, Book book) {
        member.borrow(book);
    }

    @Override
    public void returnBook(Member member, Book book) {
        book.setAvailable(true);
        System.out.println(member.getName() + " returned " + book.getTitle());
    }
}

