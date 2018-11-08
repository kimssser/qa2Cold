import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import java.util.List;

public class CompareArticlesTest {

    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By M_ARTICLE_TITLE = By.xpath(".//a[@class='md-scrollpos']");
    private final String HOME_PAGE = "http://delfi.lv";
    private final String HOME_PAGE_M = "http://m.delfi.lv";

    @Test
    public void compareArticles() {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        List<WebElement> articlesWeb = driver.findElements(ARTICLE_TITLE);
        List<String> deskArticlesList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            deskArticlesList.add(articlesWeb.get(i).getText());
        }

        driver.get(HOME_PAGE_M);
        List<WebElement> mobArticlesWeb = driver.findElements(M_ARTICLE_TITLE);
        List<String> mobArticlesList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            mobArticlesList.add(mobArticlesWeb.get(i).getText());
        }

        Assertions.assertEquals(mobArticlesList, deskArticlesList, "Desktop Articles / Mobile Articles not equal");
    }
}
