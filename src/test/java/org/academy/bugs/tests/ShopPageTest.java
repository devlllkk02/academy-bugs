/*
 * Copyright 2023 AcademyBugs.Com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.academy.bugs.tests;

import org.academy.bugs.constants.Constants;
import org.academy.bugs.pages.ShopPage;
import org.academy.bugs.utils.CommonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Test class for validating the behavior of the ShopPage.
 */
public class ShopPageTest extends BaseTestPage {

    /**
     * Verifies that adding an item to the cart is successful on the Shop page.
     */
    @Test
    public void verifyAddItemToCartSuccessfully() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementButtonAddToCartDinkYellowShoes(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WAIT_DURATION_IN_SECONDS));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.className(ShopPage.ELEMENT_BANNER_ITEM_ADDED_SUCCESSFULLY_CLASSNAME)));
    }

    /**
     * Verifies that clicking on a shop item redirects to the expected page.
     */
    @Test
    public void verifyRedirectUponItemClick() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementFlamingoTShirt(driver).click();

        CommonUtils.sleep();

        Assert.assertEquals("Error, page redirection did not occur as expected!",
                ShopPage.URL_FLAMINGO_T_SHIRT_PAGE, driver.getCurrentUrl());
    }

    /**
     * Verifies the sorting of shop items based on price (Low to High).
     */
    @Test
    public void verifyShopItemSort() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementShopItemSortField(driver).click();
        Select select = new Select(ShopPage.elementShopItemSortField(driver));
        select.selectByVisibleText("Price Low-High");
    }

    /**
     * Verifies that the item quantity increments correctly on the Shop page.
     */
    @Test
    public void verifyShopItemCountIncrement() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementFlamingoTShirt(driver).click();

        CommonUtils.sleep();

        int initialQuantity = Integer.parseInt
                (ShopPage.elementFlamingoTShirtQuantity(driver).getAttribute("value"));
        ShopPage.elementFlamingoTShirtQuantityIncrement(driver).click();
        int newQuantity = Integer.parseInt
                (ShopPage.elementFlamingoTShirtQuantity(driver).getAttribute("value"));
        Assert.assertEquals("Error, in incrementing the item quantity!",
                initialQuantity +1, newQuantity);
    }

    /**
     * Verifies that the item quantity decrements correctly on the Shop page.
     */
    @Test
    public void verifyShopItemCountDecrement() {
        driver.get(ShopPage.URL_SHOP_PAGE);
        ShopPage.elementFlamingoTShirt(driver).click();

        CommonUtils.sleep();

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
