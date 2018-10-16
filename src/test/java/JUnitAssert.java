import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class JUnitAssert {

    @Test
    public void evenNumberTest(){
        LoanExpenses a = new LoanExpenses();
        assertTrue("amount to be returned is incorrect",a.LoanExpenses(1000) == 3300);
    }
}





