import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FirstHomeWorkJUnit {

    @Test

    // calculate total amount to be returned
    public double calcExpenses(double loanAmount) {
        double totalExpenses = loanAmount + loanAmount*0.10*10 + loanAmount*0.08*10 + loanAmount*0.06*10;
        System.out.println("Loan Amount: " + loanAmount + " | " + "Total Loan Expenses: "  + totalExpenses);
        return totalExpenses;
    }

    @Test
    public void compareAmounts(){
        double initLoanAmount = 6000;  //specify loan amount
        double totalAmountToReturn = 20400; //specify total amount to be returned
        FirstHomeWorkJUnit a = new FirstHomeWorkJUnit();
        Assertions.assertEquals(a.calcExpenses(initLoanAmount), totalAmountToReturn, "amount mismatch");
    }
}

