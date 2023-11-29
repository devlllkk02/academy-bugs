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

package org.academy.bugs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page class for the My Cart page on AcademyBugs.Com.
 */
public class MyCartPage {

    public static String URL_MY_CART_PAGE ="https://academybugs.com/my-cart/";

    public static String ELEMENT_TEXT_SUB_TOTAL_ID = "ec_cart_subtotal";
    public static String ELEMENT_TEXT_SHIPPING_ID = "ec_cart_shipping";
    public static String ELEMENT_TEXT_GRAND_TOTAL_ID = "ec_cart_total";

    /**
     * Retrieves the subtotal text element on the My Cart page.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the subtotal text element.
     */
    public static WebElement elementTextSubTotal(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_TEXT_SUB_TOTAL_ID));
    }

    /**
     * Retrieves the shipping text element on the My Cart page.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the shipping text element.
     */
    public static WebElement elementTextShippingTotal(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_TEXT_SHIPPING_ID));
    }

    /**
     * Retrieves the grand total text element on the My Cart page.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the grand total text element.
     */
    public static WebElement elementTextGrandTotal(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_TEXT_GRAND_TOTAL_ID));
    }

}
