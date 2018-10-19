import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FirstHomeWorkJUnit {

    // calculate total amount to be returned
    private double calcExpenses(double loanAmount) {
        double totalExpenses = loanAmount + loanAmount*0.10*10 + loanAmount*0.08*10 + loanAmount*0.06*10;
        System.out.println("Loan Amount: " + loanAmount + " | " + "Total Loan Expenses: "  + totalExpenses);
        return totalExpenses;
    }

    @Test
    public void compareAmounts(){
        double initLoanAmount = 6000;  //specify loan amount
        double totalAmountToReturn = 204020; //specify total amount to be returned
        Assertions.assertEquals(calcExpenses(initLoanAmount), totalAmountToReturn, "amount mismatch");
    }
}

