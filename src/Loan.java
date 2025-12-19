public class Loan {
    private Member member;
    private Book book;

    public Loan(Member member, Book book) {
        this.member = member;
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }
}