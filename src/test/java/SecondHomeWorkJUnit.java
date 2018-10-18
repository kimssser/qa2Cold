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
    private final List<String> givenArticlesList = new ArrayList<String>();
    private final List<String> mobArticlesList = new ArrayList<String>();
    private final List<String> deskArticlesList = new ArrayList<String>();

    @Test
    public List<String> returnListTestArticles() {
        givenArticlesList.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticlesList.add("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticlesList.add("KP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticlesList.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticlesList.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");
        return givenArticlesList;
    }


    @Test
    public void checkDelfiTestDesktopBrowsers() {


        //Letting know the system where to find our driver
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        //Creating a new copy of driver to work with - opening Web Browser
        WebDriver driver = new FirefoxDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Open the page
        driver.get("http://delfi.lv");
        //Find 5 elements
        List<WebElement> articlesWeb = driver.findElements(ARTICLE_TITLE);
        //Parbaude
        for (int i = 0; i < 5; i++) {
            deskArticlesList.add(articlesWeb.get(i).getText());
            System.out.println(deskArticlesList);
        }

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(returnListTestArticles().get(i), deskArticlesList.get(i), "Title Nr. " + (i + 1) + " is not correct!");
        }

    }
    @Test
    public void checkDelfiTestMobileBrowsers() {
        //Letting know the system where to find our driver
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        //Creating a new copy of driver to work with - opening Web Browser
        WebDriver driver = new FirefoxDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Open the page
        driver.get("http://m.delfi.lv");
        //Find 5 elements
        List<WebElement> mobArticlesWeb = driver.findElements(M_ARTICLE_TITLE);
        //Parbaude

        for (int i = 0; i < 5; i++) {
            mobArticlesList.add(mobArticlesWeb.get(i).getText());
        }
        System.out.println(mobArticlesList);
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(returnListTestArticles().get(i), mobArticlesList.get(i), "Title Nr. " + (i + 1) + " is not correct!");
        }
    }

    @Test
    public void compareArticles () {

        //Parbaude
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(deskArticlesList, returnListTestArticles().get(i), "Title Nr. " + (i + 1) + " is not equal!");
        }
        System.out.println(deskArticlesList);
        System.out.println(mobArticlesList);

    }

    @Test
    public void checkDesktopArticles () {

        //Parbaude
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(deskArticlesList, returnListTestArticles().get(i), "Title Nr. " + (i + 1) + " is not equal!");
        }
        System.out.println(deskArticlesList);
        System.out.println(givenArticlesList);
    }
}