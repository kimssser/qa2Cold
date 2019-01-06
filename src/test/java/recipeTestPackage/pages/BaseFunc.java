package recipeTestPackage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFunc {
    WebDriver driver;

    public BaseFunc(){

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    public void openPageByUrl(String url){
        if (!url.contains("http://") && !url.contains("https://")){
            url = "http://" + url;
        }
        driver.get(url);
    }
}
