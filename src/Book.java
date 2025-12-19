public class Book {
    private int id;
    private static int idGen = 1;
    private String title;
    private boolean available;

    public Book(String title) {
        this.id = idGen++;
        this.title = title;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markBorrowed() {
        this.available = false;
    }

    public void markReturned() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', available=" + available + "}";
    }
}
