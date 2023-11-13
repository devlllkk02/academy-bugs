package org.academy.bugs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public static WebElement elementButtonAddToCartDarkGreyJeans(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_BUTTON_ADD_TO_CART_DARK_GREY_JEANS_ID));
    }

    public static WebElement elementButtonAddToCartDinkYellowShoes(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_BUTTON_ADD_TO_CART_DINK_YELLOW_SHOES_ID));
    }

    public static WebElement elementFlamingoTShirt(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_FLAMINGO_T_SHIRT_ID));
    }

    public static WebElement elementFlamingoTShirtQuantity(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_ID));
    }

    public static WebElement elementFlamingoTShirtQuantityIncrement(WebDriver driver) {
        return driver.findElement(By.className(ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_INCREMENT_CLASSNAME));
    }

    public static WebElement elementFlamingoTShirtQuantityDecrement(WebDriver driver) {
        return driver.findElement(By.className(ELEMENT_FLAMINGO_T_SHIRT_QUANTITY_DECREMENT_CLASSNAME));
    }

    public static WebElement elementShopItemSortField(WebDriver driver) {
        return driver.findElement(By.id(ELEMENT_SHOP_ITEM_SORT_FIELD_ID));
    }
}
