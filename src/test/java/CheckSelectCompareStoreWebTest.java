import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class CheckSelectCompareStoreWebTest {

    private final By WOMEN_BUTTON = By.xpath(".//a[@class = 'sf-with-ul']");



    @Test
    public void compareArticles() {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        List<WebElement> women = driver.findElements(WOMEN_BUTTON);

        List<String> mobArticlesList = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            mobArticlesList.add(women.get(i).getText());
        }
    }


}

