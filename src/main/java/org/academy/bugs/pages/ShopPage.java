package org.academy.bugs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {

    public static String URL_SHOP_PAGE ="https://academybugs.com/find-bugs/";

    public static String ELEMENT_BUTTON_ADD_TO_CART_DARK_GREY_JEANS_ID = "ec_add_to_cart_4";
    public static String ELEMENT_BUTTON_ADD_TO_CART_DINK_YELLOW_SHOES_ID = "ec_add_to_cart_5";

    public static String ELEMENT_BANNER_ITEM_ADDED_SUCCESSFULLY_CLASSNAME = "ec_product_added_to_cart";

    public static WebElement elementButtonAddToCartDarkGreyJeans(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_BUTTON_ADD_TO_CART_DARK_GREY_JEANS_ID));
    }

    public static WebElement elementButtonAddToCartDinkYellowShoes(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_BUTTON_ADD_TO_CART_DINK_YELLOW_SHOES_ID));
    }

}
