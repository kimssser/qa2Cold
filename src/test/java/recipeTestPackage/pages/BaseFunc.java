package recipeTestPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseFunc {

    WebDriver driver;

    public BaseFunc() {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void openPageByUrl(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public List<WebElement> getElements(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "There is no elements on page");
        return driver.findElements(locator);
    }

    public WebElement getElement(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "There is no element");
        return driver.findElement(locator);
    }

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
