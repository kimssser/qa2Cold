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

    @Test
    public void compareArticles() {

        List<String> givenArticlesList = new ArrayList<String>();
        givenArticlesList.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticlesList.add("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticlesList.add("KP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticlesList.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticlesList.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");

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

        if (mobArticlesList != givenArticlesList) {
            System.out.println("Mobile articles not equal with Test articles");
        } else {
            System.out.println("Mobile articles are equal with Test articles");
        }
        if (deskArticlesList != givenArticlesList) {
            System.out.println("Desktop articles not equal with Test articles");
        } else {
            System.out.println("Desktop articles are equal with Test articles");
        }
        Assertions.assertEquals(mobArticlesList, deskArticlesList, "Desktop Articles / Mobile Articles not equal");

        System.out.println("Mobile articles are equal with Desktop articles");
    }

}