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
 * Page class for the Opportunities We Provide page on AcademyBugs.Com.
 */
public class OpportunitiesWeProvidePage {

    public static String URL_OPPORTUNITIES_WE_PROVIDE_PAGE = "https://academybugs.com/opportunities-we-provide/";

    public static String ELEMENT_BUTTON_APPLY_NOW_CLASSNAME = "utest-contact-button";

    /**
     * Retrieves the "Apply Now" button element.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the "Apply Now" button.
     */
    public static WebElement elementButtonApplyNow(WebDriver driver) {
        return driver.findElement(By.className(ELEMENT_BUTTON_APPLY_NOW_CLASSNAME));
    }
}
