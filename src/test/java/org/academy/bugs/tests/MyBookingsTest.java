package org.academy.bugs.tests;

import org.academy.bugs.pages.MyBookingsPage;
import org.junit.Assert;
import org.junit.Test;

public class MyBookingsTest extends BaseTestPage{

    @Test
    public void verifyPhoneNumber(){
        driver.get(MyBookingsPage.URL_MY_MY_BOOKINGS_PAGE);
        String inputValue = "abc123";
        MyBookingsPage.elementMobileNumber(driver).sendKeys(inputValue);

        Assert.assertTrue("Error, mobile number field should contain only numeric characters!",
                inputValue.matches("^[0-9]+$"));
    }
}
