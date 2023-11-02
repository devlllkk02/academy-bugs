package academy.bugs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCart {

    public static String URL_MY_CART_PAGE ="https://academybugs.com/my-cart/";

    public static String ELEMENT_TEXT_SUB_TOTAL_ID = "ec_cart_subtotal";
    public static String ELEMENT_TEXT_SHIPPING_ID = "ec_cart_shipping";
    public static String ELEMENT_TEXT_GRAND_TOTAL_ID = "ec_cart_total";

    public static WebElement elementTextSubTotal(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_TEXT_SUB_TOTAL_ID));
    }

    public static WebElement elementTextShippingTotal(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_TEXT_SHIPPING_ID));
    }
    public static WebElement elementTextGrandTotal(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_TEXT_GRAND_TOTAL_ID));
    }

}
