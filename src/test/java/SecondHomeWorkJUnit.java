import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import java.util.List;

public class SecondHomeWorkJUnit {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By M_ARTICLE_TITLE = By.xpath(".//a[@class='md-scrollpos']");
    private final List<String> givenArticles = new ArrayList<String>();

    @Test
    public void checkDelfiTestDesktopBrowsers() {

        givenArticles.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticles.add("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticles.add("KP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticles.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticles.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");
        //Letting know the system where to find our driver
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        //Creating a new copy of driver to work with - opening Web Browser
        WebDriver driver = new FirefoxDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Open the page
        driver.get("http://delfi.lv");
        //Find 5 elements
        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);
        //Parbaude
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(givenArticles.get(i), articles.get(i).getText(), "Title Nr. " + (i + 1) + " is not correct!");
        }
    }
    @Test
    public void checkDelfiTestMobileBrowsers() {
        givenArticles.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticles.add("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticles.add("KP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticles.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticles.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");
        //Letting know the system where to find our driver
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        //Creating a new copy of driver to work with - opening Web Browser
        WebDriver driver = new FirefoxDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Open the page
        driver.get("http://m.delfi.lv");
        //Find 5 elements
        WebElement mobArticle = driver.findElement(M_ARTICLE_TITLE);
        //Getting text only from web element(Elements contains not oly the text but tags also)
        List<WebElement> mobArticles = driver.findElements(M_ARTICLE_TITLE);
        //Parbaude
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(givenArticles.get(i), mobArticles.get(i).getText(), "Title Nr. " + (i + 1) + " is not correct!");
        }
    }
}