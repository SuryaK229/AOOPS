package Library;

interface Member {
    String getName();
    int getId();
    void borrow(Book book);
}

class RegularMember implements Member {
    private String name;
    private int memberId;

    public RegularMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return memberId;
    }

    public void borrow(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }
}
