import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(Member member, Book book) {
        if (!books.contains(book)) {
            System.out.println("Book not in library.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book already borrowed.");
            return;
        }

        Loan loan = new Loan(member, book);
        loans.add(loan);
        book.markBorrowed();

        System.out.println(member.getName() + " borrowed " + book.getTitle());
    }

    public void returnBook(Member member, Book book) {
        for (Loan loan : loans) {
            if (loan.getMember() == member && loan.getBook() == book) {
                loans.remove(loan);
                book.markReturned();
                System.out.println(member.getName() + " returned " + book.getTitle());
                return;
            }
        }
        System.out.println("Loan not found.");
    }
}
