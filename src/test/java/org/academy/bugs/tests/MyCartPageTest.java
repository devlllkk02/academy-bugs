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
import org.academy.bugs.pages.MyCartPage;
import org.academy.bugs.pages.ShopPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Test class for validating the behavior of the MyCartPage.
 */
public class MyCartPageTest extends BaseTestPage {

    /**
     * Verifies that the grand total on the My Cart page is calculated correctly
     * based on the subtotal and shipping total.
     */
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
}
