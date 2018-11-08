import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LoanAmountCalculationTest {

    private double initLoanAmount = 1000.8;
    private double totalAmountToReturn = 3500.7;
    private int periodWithConstRate = 10;

    @Test
    public void calcAndCompareLoanAmount() {

        double firstTenYearsOverpay;
        double secondTenYearsOverpay;
        double thirdTenYearsOverpay;
        double calculatedReturnAmount;

        firstTenYearsOverpay = initLoanAmount * periodWithConstRate * 0.10;
        secondTenYearsOverpay = initLoanAmount * periodWithConstRate * 0.08;
        thirdTenYearsOverpay = initLoanAmount * periodWithConstRate * 0.06;

        calculatedReturnAmount = initLoanAmount + firstTenYearsOverpay + secondTenYearsOverpay + thirdTenYearsOverpay;

        Assertions.assertEquals(calculatedReturnAmount, totalAmountToReturn, "Total amount to be returned is incorrect");
    }
}
