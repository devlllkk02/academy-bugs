package org.academy.bugs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyBookingsPage {
    public static String URL_MY_MY_BOOKINGS_PAGE ="https://academybugs.com/my-bookings";

    public static String ELEMENT_MOBILE_NUMBER_ID = "rtb-phone";

    public static WebElement elementMobileNumber(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_MOBILE_NUMBER_ID));
    }
}
