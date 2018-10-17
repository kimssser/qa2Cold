import org.junit.jupiter.api.Test;
public class LoanExpenses {

    @Test

    // printExpenses created just for set data
    public void printExpenses() {
        calcExpenses(1000);
        calcExpenses(5000);
        calcExpenses(7000);
    }

    public double calcExpenses(double loanAmount) {
        double totalExpenses = loanAmount + loanAmount*0.10*10 + loanAmount*0.08*10 + loanAmount*0.06*10;

        System.out.println("Loan Amount: " + loanAmount + " | " + "Total Loan Expenses: "  + totalExpenses);
        return totalExpenses;
    }
}
