import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.*;

public class JUnitAssert {

    @Test
    public void asserTrueTest(){
        LoanExpenses a = new LoanExpenses();
        //assertTrue("amount mismatch",a.calcExpenses(6000) == 17000);
        Assertions.assertTrue(a.calcExpenses(6000) == 20400, "amount mismatch");
    }
}





