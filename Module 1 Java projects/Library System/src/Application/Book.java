package Application;

public class Book {
    private String title;
    private String author;
    private boolean isLoaned;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isLoaned = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }
}
