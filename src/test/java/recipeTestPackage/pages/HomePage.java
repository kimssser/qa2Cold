package recipeTestPackage.pages;

import org.openqa.selenium.By;

public class HomePage {

    private final By NAME = By.xpath(".//a[contains(@class, 'nav-link')]");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

}
