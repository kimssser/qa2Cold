import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import java.util.List;

public class NewTestDelfi5Art {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");

    @Test
    public void delfiFirstTitleTest() {
        //Letting know the system where to find our driver
        List<String> givenArticles = new ArrayList <String>();
        givenArticles.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticles.add("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticles.add("JKP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticles.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticles.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        //Creating a new copy of driver to work with - opening Web Browser
        WebDriver driver = new FirefoxDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Open the page
        driver.get("http://delfi.lv");

        //Setting an article name to check
        String articleToCheck = "'OlyBet' basketbola līga: LU - 'Kalev/Cramo'. Video tiešraide";

        //Searching web element by locator created before
        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);
        for (int i = 0; i < 5;i++) {

    Assertions.assertEquals(givenArticles.get(i), articles.get(i).getText(), "tstustu");

        }


       // {

      //  }


       // WebElement article = driver.findElement(ARTICLE_TITLE);
        //Getting text only from web element(Elements contains not oly the text but tags also)
      //  String articleText = article.getText();

        //Checking
        //Assertions.assertEquals(articleToCheck, articleText, "Fatal Laura's error!");
    }
}
