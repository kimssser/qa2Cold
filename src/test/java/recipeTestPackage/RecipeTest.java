//on Delfi food page open selected recipe
// go through all ingridients and check if this recipe exists on the ingridients page



package recipeTestPackage;

import org.junit.jupiter.api.Test;
import recipeTestPackage.pages.BaseFunc;
import recipeTestPackage.pages.HomePage;
import recipeTestPackage.pages.RecipePage;
import recipeTestPackage.pages.TastyPage;
import org.junit.jupiter.api.Assertions;

public class RecipeTest {
    private final String HOME_PAGE = "delfi.lv";
    private final String recipe_name = "Pufīgās sodas pankūciņas";
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void recipeTest() {
        baseFunc.openPageByUrl(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        TastyPage tastyPage = homePage.getItemByName("TASTY");
        RecipePage recipePage = tastyPage.getRecipe(recipe_name);
        Integer recipeNotFoundCount  = recipePage.recipeIngredients();
        Assertions.assertTrue(recipeNotFoundCount == 0, "Not all the ingredients exist in recipes on ingridient page");
    }
}
