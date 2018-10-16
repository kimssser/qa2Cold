import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class JUnitAssert {

    @Test
    public void evenNumberTest(){
        LoanExpenses a = new LoanExpenses();
        assertTrue("amount to be returned is incorrect",a.calcExpenses(5000) == 17000);
    }
}





