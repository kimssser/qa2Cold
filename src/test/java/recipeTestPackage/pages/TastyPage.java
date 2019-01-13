package recipeTestPackage.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TastyPage {
    BaseFunc baseFunc;

    private final By RECIPES = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public TastyPage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public RecipePage getRecipe(String name) {
        List<WebElement> recipes = baseFunc.getElements(RECIPES);
        for (int i = 0; i < recipes.size(); i++) {
            String title = recipes.get(i).getText();
            if (title.equals(name)) {
                recipes.get(i).click();
                return new RecipePage(baseFunc);
            }
        }
        return null;
    }

}
