import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CheckSelectCompareStoreWebTest {

    private final By WOMEN_BUTTON = By.xpath(".//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a");
    private final By DRESSES_BUTTON = By.xpath(".//li[@class = 'last']/a");
    private final By ORANGE_FILTER = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul color-group']/li/label");
    private final By SEARCH_BOX = By.xpath(".//*[@class = 'col-sm-4 clearfix']/form");

    @Test
    public void compareArticles() {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        List<WebElement> women = driver.findElements(WOMEN_BUTTON);
        women.get(0).click();
        List<WebElement> dresses = driver.findElements(DRESSES_BUTTON);
        dresses.get(1).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_BOX));
        List<WebElement> yellowFilter = driver.findElements(ORANGE_FILTER);
        yellowFilter.get(4).click();
    }


}

