import java.util.ArrayList;
import java.util.List;

public class Member {
    private int id;
    private static int idGen = 1;
    private String name;
    private List<Loan> loans = new ArrayList<>();

    public Member(String name) {
        this.id = idGen++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }

    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "'}";
    }
}


