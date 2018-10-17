import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JUnitDelfiTestCompare {

    @Test
    public void delfiTest(){
        DelfiFirstTest a = new DelfiFirstTest();
       MDelfiFirstTest m = new MDelfiFirstTest();
     Assertions.assertEquals(a.aaa, m.mmm, "Fatal  error!");
    }


}