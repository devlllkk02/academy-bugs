package academy.bugs.tests;

import academy.bugs.constants.Constants;
import academy.bugs.pages.MyCart;
import academy.bugs.pages.ShopPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPageTest extends BaseTestPage{

    @Test
    public void verifyAddItemToCartSuccessfully() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementButtonAddToCartDinkYellowShoes(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WAIT_DURATION_IN_SECONDS));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.className(ShopPage.ELEMENT_BANNER_ITEM_ADDED_SUCCESSFULLY_CLASSNAME)));
    }
}