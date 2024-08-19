package Library;

interface Book {
    String getTitle();
    String getAuthor();
    boolean isAvailable();
    void setAvailable(boolean available);
}

class PhysicalBook implements Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public PhysicalBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}