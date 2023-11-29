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
 * Page class for the Shop page on AcademyBugs.Com.
 */
public class ShopPage {

    public static String URL_SHOP_PAGE = "https://academybugs.com/find-bugs/";
    public static String URL_FLAMINGO_T_SHIRT_PAGE =
            "https://academybugs.com/store/flamingo-tshirt/";
    public static String ELEMENT_BUTTON_ADD_TO_CART_DARK_GREY_JEANS_ID = "ec_add_to_cart_4";
    public static String ELEMENT_BUTTON_ADD_TO_CART_DINK_YELLOW_SHOES_ID = "ec_add_to_cart_5";
    public static String ELEMENT_FLAMINGO_T_SHIRT_ID = "ec_product_image_effect_4881370";
    public static String ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_ID = "ec_quantity_27";
    public static String ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_INCREMENT_CLASSNAME = "ec_plus";
    public static String ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_DECREMENT_CLASSNAME = "ec_minus";

    public static String ELEMENT_SHOP_ITEM_SORT_FIELD_ID = "sortfield";

    public static String ELEMENT_BANNER_ITEM_ADDED_SUCCESSFULLY_CLASSNAME = "ec_product_added_to_cart";

    /**
     * Retrieves the "Add to Cart" button for Dark Grey Jeans.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the "Add to Cart" button for Dark Grey Jeans.
     */
    public static WebElement elementButtonAddToCartDarkGreyJeans(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_BUTTON_ADD_TO_CART_DARK_GREY_JEANS_ID));
    }

    /**
     * Retrieves the "Add to Cart" button for Dink Yellow Shoes.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the "Add to Cart" button for Dink Yellow Shoes.
     */
    public static WebElement elementButtonAddToCartDinkYellowShoes(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_BUTTON_ADD_TO_CART_DINK_YELLOW_SHOES_ID));
    }

    /**
     * Retrieves the Flamingo T-Shirt element.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the Flamingo T-Shirt element.
     */
    public static WebElement elementFlamingoTShirt(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_FLAMINGO_T_SHIRT_ID));
    }

    /**
     * Retrieves the Flamingo T-Shirt quantity element.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the Flamingo T-Shirt quantity element.
     */
    public static WebElement elementFlamingoTShirtQuantity(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_ID));
    }

    /**
     * Retrieves the Flamingo T-Shirt quantity increment button.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the Flamingo T-Shirt quantity increment button.
     */
    public static WebElement elementFlamingoTShirtQuantityIncrement(WebDriver driver) {
        return driver.findElement(By.className(ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_INCREMENT_CLASSNAME));
    }

    /**
     * Retrieves the Flamingo T-Shirt quantity decrement button.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the Flamingo T-Shirt quantity decrement button.
     */
    public static WebElement elementFlamingoTShirtQuantityDecrement(WebDriver driver) {
        return driver.findElement(By.className(ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_DECREMENT_CLASSNAME));
    }

    /**
     * Retrieves the Shop Item Sort field.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the Shop Item Sort field.
     */
    public static WebElement elementShopItemSortField(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_SHOP_ITEM_SORT_FIELD_ID));
    }
}
