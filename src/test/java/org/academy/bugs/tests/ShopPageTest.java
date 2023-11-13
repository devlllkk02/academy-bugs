package org.academy.bugs.tests;

import org.academy.bugs.constants.Constants;
import org.academy.bugs.pages.ShopPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPageTest extends BaseTestPage {

    @Test
    public void verifyAddItemToCartSuccessfully() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementButtonAddToCartDinkYellowShoes(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WAIT_DURATION_IN_SECONDS));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.className(ShopPage.ELEMENT_BANNER_ITEM_ADDED_SUCCESSFULLY_CLASSNAME)));
    }

    @Test
    public void verifyRedirectUponItemClick() {
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
    public void verifyShopItemSort() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementShopItemSortField(driver).click();
        Select select = new Select(ShopPage.elementShopItemSortField(driver));
        select.selectByVisibleText("Price Low-High");
    }

    @Test
    public void verifyShopItemCountIncrement() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementFlamingoTShirt(driver).click();

        try {
            Thread.sleep(Constants.WAIT_DURATION_IN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int initialQuantity = Integer.parseInt
                (ShopPage.elementFlamingoTShirtQuantity(driver).getAttribute("value"));
        ShopPage.elementFlamingoTShirtQuantityIncrement(driver).click();
        int newQuantity = Integer.parseInt
                (ShopPage.elementFlamingoTShirtQuantity(driver).getAttribute("value"));
        Assert.assertEquals("Error, in incrementing the item quantity!",
                initialQuantity +1, newQuantity);
    }

    @Test
    public void verifyShopItemCountDecrement() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementFlamingoTShirt(driver).click();

        try {
            Thread.sleep(Constants.WAIT_DURATION_IN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int initialQuantity = Integer.parseInt
                (ShopPage.elementFlamingoTShirtQuantity(driver).getAttribute("value"));
        ShopPage.elementFlamingoTShirtQuantityIncrement(driver).click();
        ShopPage.elementFlamingoTShirtQuantityDecrement(driver).click();

        int newQuantity = Integer.parseInt
                (ShopPage.elementFlamingoTShirtQuantity(driver).getAttribute("value"));
        Assert.assertEquals("Error, in incrementing the item quantity!",
                initialQuantity , newQuantity);
    }
}
