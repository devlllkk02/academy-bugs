package org.academy.bugs.tests;

import org.academy.bugs.constants.Constants;
import org.academy.bugs.pages.ArticlesPage;
import org.academy.bugs.pages.MyCartPage;
import org.academy.bugs.pages.ShopPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyCartPageTest extends BaseTestPage {

    @Test
    public void verifyMyCartGrandTotal() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementButtonAddToCartDarkGreyJeans(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WAIT_DURATION_IN_SECONDS));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ec_product_added_to_cart")));

        driver.get(MyCartPage.URL_MY_CART_PAGE);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(MyCartPage.ELEMENT_TEXT_SUB_TOTAL_ID)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(MyCartPage.ELEMENT_TEXT_SHIPPING_ID)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(MyCartPage.ELEMENT_TEXT_GRAND_TOTAL_ID)));

        double subTotal = Double.parseDouble(MyCartPage.elementTextSubTotal(driver).getText().
                replace("$", ""));
        double shippingTotal = Double.parseDouble(MyCartPage.elementTextShippingTotal(driver).getText().
                replace("$", ""));
        double grandTotal = Double.parseDouble(MyCartPage.elementTextGrandTotal(driver).getText().
                replace("$", ""));

        Assert.assertEquals(subTotal + shippingTotal, grandTotal, 0.001);
    }

    @Test
    public void verifyRedirectUponItemClick(){
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementFlamingoTShirt(driver).click();

        try {
            Thread.sleep(Constants.WAIT_DURATION_IN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Error, page redirection did not occur as expected!",
                ShopPage.URL_FLAMINGO_T_SHIRT_PAGE, driver.getCurrentUrl());
    }

    @Test
    public void verifyShopItemSort(){
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementShopItemSortField(driver).click();
        Select select = new Select(ShopPage.elementShopItemSortField(driver));
        select.selectByVisibleText("Price Low-High");
    }
}
