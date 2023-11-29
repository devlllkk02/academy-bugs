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
 * Page class for the My Bookings page on AcademyBugs.Com.
 */
public class MyBookingsPage {
    public static String URL_MY_MY_BOOKINGS_PAGE ="https://academybugs.com/my-bookings";

    public static String ELEMENT_MOBILE_NUMBER_ID = "rtb-phone";

    /**
     * Retrieves the mobile number input field on the My Bookings page.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the mobile number input field.
     */
    public static WebElement elementMobileNumber(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_MOBILE_NUMBER_ID));
    }
}
