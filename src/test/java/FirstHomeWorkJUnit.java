import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FirstHomeWorkJUnit {

    @Test
    //setting data to get the correct amounts
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

    @Test
    public void compareAmounts(){
        double initLoanAmount = 6000;  //specify loan amount
        double totalAmountToReturn = 20400; //specify total amount to be returned
        FirstHomeWorkJUnit a = new FirstHomeWorkJUnit();
        Assertions.assertTrue(a.calcExpenses(initLoanAmount) == totalAmountToReturn, "amount mismatch");
    }
}

