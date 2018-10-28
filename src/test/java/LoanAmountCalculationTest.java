import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LoanAmountCalculationTest {

    private double initLoanAmount = 1000.8;
    private double totalAmountToReturn = 3500.7;
    private double calculatedReturnAmount;
    private double firstTenYearsRate = 0.10;
    private double secondTenYearsRate = 0.08;
    private double thirdTenYearsRate = 0.06;
    private int periodWithConstRate = 10;

    @Test
    public void calcAndCompareLoanAmount() {

        double firstTenYearsOverpay;
        double secondTenYearsOverpay;
        double thirdTenYearsOverpay;

        firstTenYearsOverpay = initLoanAmount * periodWithConstRate * firstTenYearsRate;
        secondTenYearsOverpay = initLoanAmount * periodWithConstRate * secondTenYearsRate;
        thirdTenYearsOverpay = initLoanAmount * periodWithConstRate * thirdTenYearsRate;

        calculatedReturnAmount = initLoanAmount + firstTenYearsOverpay + secondTenYearsOverpay + thirdTenYearsOverpay;

        Assertions.assertEquals(calculatedReturnAmount, totalAmountToReturn, "TotalAmountToReturn is incorrect");
    }
}
