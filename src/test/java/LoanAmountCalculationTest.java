//function test

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LoanAmountCalculationTest {

    private double initLoanAmount = 1000.8;
    private double totalAmountToReturn = 3500.7;

    @Test
    public void calcAndCompareLoanAmount() {

        double firstTenYearsOverpay;
        double secondTenYearsOverpay;
        double thirdTenYearsOverpay;
        double calculatedReturnAmount;

        firstTenYearsOverpay = initLoanAmount * 10 * 0.10;
        secondTenYearsOverpay = initLoanAmount * 10 * 0.08;
        thirdTenYearsOverpay = initLoanAmount * 10 * 0.06;

        calculatedReturnAmount = initLoanAmount + firstTenYearsOverpay + secondTenYearsOverpay + thirdTenYearsOverpay;

        Assertions.assertEquals(calculatedReturnAmount, totalAmountToReturn, "Total amount to be returned is incorrect");
    }
}
