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

import org.academy.bugs.pages.MyBookingsPage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for validating the behavior of the MyBookingsPage.
 */
public class MyBookingsTest extends BaseTestPage{

    /**
     * Verifies that the mobile number field on the My Bookings page only contains
     * numeric characters after entering an alphanumeric value.
     */
    @Test
    public void verifyPhoneNumber(){
        driver.get(MyBookingsPage.URL_MY_MY_BOOKINGS_PAGE);
        String inputValue = "abc123";
        MyBookingsPage.elementMobileNumber(driver).sendKeys(inputValue);

        Assert.assertTrue("Error, mobile number field should contain only numeric characters!",
                inputValue.matches("^[0-9]+$"));
    }
}
