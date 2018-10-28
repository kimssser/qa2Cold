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

    @Test
    public void compareArticles() {

        List<String> givenArticlesList = new ArrayList<String>();
        givenArticlesList.add("Simtgades uguņošana galvaspilsētā izmaksās desmitreiz vairāk nekā parasti");
        givenArticlesList.add("Skudra: Par Saeimas priekšsēdētāju varētu ievēlēt relatīvi nejaušu personu");
        givenArticlesList.add("Žaņa Katlapa balvu šogad pasniegs Andrim Keišam un Uldim Dumpim");
        givenArticlesList.add("'Liepājas' basketbolisti nespēj apturēt 'Avis Utilitas' basketbolistus");
        givenArticlesList.add("Eiropai tuvojas siltuma vilnis, Latvijā paredz rekordu pārsišanu");

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");
        List<WebElement> articlesWeb = driver.findElements(ARTICLE_TITLE);
        List<String> deskArticlesList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            deskArticlesList.add(articlesWeb.get(i).getText());
        }

        driver.get("http://m.delfi.lv");
        List<WebElement> mobArticlesWeb = driver.findElements(M_ARTICLE_TITLE);
        List<String> mobArticlesList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            mobArticlesList.add(mobArticlesWeb.get(i).getText());
        }

        Assertions.assertEquals(givenArticlesList, deskArticlesList, "Given Articles / Desktop Articles not equal");

        Assertions.assertEquals(givenArticlesList, mobArticlesList, "Given Articles / Mobile Articles not equal");

        Assertions.assertEquals(mobArticlesList, deskArticlesList, "Desktop Articles / Mobile Articles not equal");
    }
}
