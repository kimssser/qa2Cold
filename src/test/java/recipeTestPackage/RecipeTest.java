package recipeTestPackage;

import org.junit.jupiter.api.Test;
import testPackage.pages.BaseFunc;

public class RecipeTest {
    private final String HOME_PAGE = "delfi.lv";
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void delfiTest() {
        baseFunc.openPageByUrl(HOME_PAGE);
    }
}
