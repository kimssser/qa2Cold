import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FirstHomeWorkJUnit {

    private double calcExpenses(double loanAmount) {
        double totalExpenses = loanAmount + loanAmount*0.10*10 + loanAmount*0.08*10 + loanAmount*0.06*10;
        System.out.println("Loan Amount: " + loanAmount + " | " + "Total Loan Expenses: "  + totalExpenses);
        return totalExpenses;
    }

    @Test
    public void compareAmounts(){
        double initLoanAmount = 6000;
        double totalAmountToReturn = 20400;
        Assertions.assertEquals(calcExpenses(initLoanAmount), totalAmountToReturn, "amount mismatch");
    }
}

