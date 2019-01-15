package recipeTestPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private final By COOKIES = By.xpath(".//*[@class = 'btn btn-primary btn-pill w-100 my-2']");
    private final By TASTY_TAB = By.xpath(".//a[@class = 'nav-link text-pale-sky notranslate p-2']/span");
    private final By RECIPE_TAB = By.xpath(".//a[@class =  'nav-item-link']");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {

        baseFunc.getElement(COOKIES).click();
    }


    public TastyPage getItemByName(String name) {


        List<WebElement> tabs = baseFunc.getElements(TASTY_TAB);
        for (int i = 0; i < tabs.size(); i++) {
            String title = tabs.get(i).getText();
            if (title.equals(name)) {
                tabs.get(i).click();
                List<WebElement> recipeTabs;
                recipeTabs = baseFunc.getElements(RECIPE_TAB);
                for (int k = 0; k < recipeTabs.size(); k++) {
                    String title1 = recipeTabs.get(k).getText();
                    if (title1.equals("RECEPTES")) {
                        recipeTabs.get(k).click();
                        return new TastyPage(baseFunc);
                    }
                }
            }
        }
        return null;
    }
}
