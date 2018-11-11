import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CheckSelectCompareStoreWebTest {

    private final By WOMEN_BUTTON = By.xpath(".//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a");
    private final By DRESSES_BUTTON = By.xpath(".//li[@class = 'last']/a");
    private final By ORANGE_INPUT =  By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul color-group']/li/input");
    private final By ORANGE_FILTER = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul color-group']/li/label/a");
    private final By LOADING = By.xpath(".//ul[@class = 'product_list grid row']/p");
    private final By SELECTED_EL_COUNT = By.xpath(".//*[contains(@class,'ajax_block_product col-xs-12')]");
    private final By ELEMENT_COLORS = By.xpath(".//*[contains(@class,'ajax_block_product col-xs-12')]");



    @Test
    public void compareArticles() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        List<WebElement> women = driver.findElements(WOMEN_BUTTON);
        women.get(0).click();
        List<WebElement> dresses = driver.findElements(DRESSES_BUTTON);
        dresses.get(1).click();
        List<WebElement> input = driver.findElements(ORANGE_INPUT);
        input.get(3).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOADING));
        List<WebElement> yellowFilter = driver.findElements(ORANGE_FILTER);
        yellowFilter.get(3).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOADING));
        List<WebElement> elementCount = driver.findElements(SELECTED_EL_COUNT);
        List<WebElement> elementColors = driver.findElements(ELEMENT_COLORS);
        int a = 0;
        for (int i = 0; i < elementCount.size(); i++) {
            for (int k = 0; k < elementColors.size(); k++) {
                if (elementColors.get(k).getText().contains("color-orange")) {
                    a = a + 1;
                    break;
                }
            }
            }




    }


}