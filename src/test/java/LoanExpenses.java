import org.junit.jupiter.api.Test;

public class LoanExpenses {
    private String text = "Loan Expenses: ";

    @Test
    public void printExpenses() {
        loanExpenses(1000);
        loanExpenses(3000);
        loanExpenses(3000);
    }

    private double loanExpenses(double loanAmount) {
        double totalExpenses = loanAmount + loanAmount*0.10*10 + loanAmount*0.08*10 + loanAmount*0.06;
        System.out.println(text  + totalExpenses);
        return totalExpenses;
    }
}
