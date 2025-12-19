public class Book {
    private String title;
    private boolean available = true;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markBorrowed() {
        available = false;
    }

    public void markReturned() {
        available = true;
    }
}
