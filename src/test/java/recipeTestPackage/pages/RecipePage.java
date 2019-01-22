package recipeTestPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class RecipePage {
    BaseFunc baseFunc;

    private final By INGREDIENTS = By.xpath(".//a[@itemprop = 'recipeIngredient']");
    private final By INGR_RECIPES = By.xpath(".//h1[@class =  'headline-title text-md']");
    private final By INGR_VISIBILITY = By.xpath(".//div[@class =  'ingredients elevated']");

    public RecipePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public int recipeIngredients(String name) {
        ArrayList<String> tabss = new ArrayList<String>(baseFunc.driver.getWindowHandles());
        baseFunc.driver.switchTo().window(tabss.get(1));
        baseFunc.waitForElement(INGR_VISIBILITY);
        List<WebElement> ingredients = baseFunc.getElements(INGREDIENTS);
        boolean x = false;
        int ingrSize = ingredients.size();
        int recipeNotFoundCount = 0;
        for (int i = 0; i < ingrSize; i++) {
            if (x) {
                baseFunc.waitForElement(INGR_VISIBILITY);
                ingredients = baseFunc.getElements(INGREDIENTS);
            }
            ingredients.get(i).click();
            baseFunc.driver.navigate().back();
            x = true;
            ingredients = new ArrayList<WebElement>();
            if (checkArticleInIngred(name) == false) {
                recipeNotFoundCount = 1;
                break;
            }
        }
        return recipeNotFoundCount;
    }

    public boolean checkArticleInIngred(String name) {
        List<WebElement> tabs = baseFunc.getElements(INGR_RECIPES);
        boolean recipeFound = false;
        for (int i = 0; i < tabs.size(); i++) {
            String title = tabs.get(i).getText();
            if (title.equals(name)) {
                recipeFound = true;
                break;
            }
        }
        return recipeFound;
    }
}






