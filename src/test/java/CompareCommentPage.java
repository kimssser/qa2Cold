import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;


public class CompareCommentPage {
    private final By ETHALON_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By ETHALON_COMMENT_COUNT = By.xpath(".//a']");
    @Test

    public void compareCommentPage() {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        //Creating a new copy of driver to work with - opening Web Browser
        WebDriver driver = new FirefoxDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Open the page
        driver.get("http://delfi.lv");
    }


        //create article Locator
        //create comment Locator
        //open browser
        //open delfi
        // find article element
        // find 3rd eelement
        // get article title
        // find comment count
        // cut brackets
        // convert comment count string to int
        // check article titles with 1st page
        // check comment counts with 1st page
        // go to the comment page
        //create comment page article Locator
        //create comment count comment page Locator
        //get comment pages title text
        //check comment page title text with main title
        // find comment page registered users comment count











}

