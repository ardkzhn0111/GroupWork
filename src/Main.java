public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("Абай жолы");
        Book b2 = new Book("ГауҺартас");
        Book b3 = new Book("QWE");

        library.addBook(b1);
        library.addBook(b2);

        Member m1 = new Member("Шалқар");
        Member m2 = new Member("Жанар");

        library.issueBook(m2, b1);
        library.issueBook(m1, b1);
    }
}

