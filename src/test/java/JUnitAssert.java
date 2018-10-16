import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class JUnitAssert {

    @Test
    public void evenNumberTest(){
        LoanExpenses a = new LoanExpenses();
        assertTrue("amount mismatch",a.calcExpenses(6000) == 17000);
    }
}





