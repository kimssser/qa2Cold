package recipeTestPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.WebDriver.*;


public class RecipePage {
    BaseFunc baseFunc;

    private final By INGREDIENTS = By.xpath(".//a[@itemprop = 'recipeIngredient']");
    private final By INGR_RECIPES = By.xpath(".//h1[@class =  'headline-title text-md']");
    public RecipePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }


    public int recipeIngredients() {
        List<WebElement> ingredients = baseFunc.getElements(INGREDIENTS);
        boolean x = false;
        int ingrSize = ingredients.size();
        int recipeNotFoundCount = 0;
        for (int i = 0; i < ingrSize; i++) {
            if (x) {
                ingredients = baseFunc.getElements(INGREDIENTS);
            }
            ingredients.get(i).click();
            baseFunc.driver.navigate().back();
            x = true;
            ingredients = new ArrayList<WebElement>();
         //   if (RecipePage(INGR_RECIPES).size() == 0) { here should be function to check whether recipe exists in ingredients
                recipeNotFoundCount = 1;
        //    }
        }
     return recipeNotFoundCount;
    }
}





