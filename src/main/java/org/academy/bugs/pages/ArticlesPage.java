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
 * Page class for the Articles page on AcademyBugs.Com.
 */
public class ArticlesPage {
    public static String URL_MY_ARTICLES_PAGE = "https://academybugs.com/articles/";
    public static String URL_MY_ARTICLES_PAGE_INDIVIDUAL =
            "https://academybugs.com/why-do-i-need-to-use-financial-consulting-service/";


    public static String ELEMENT_SOCIAL_MEDIA_FACEBOOK_ICON_ID = "square-share-a1";
    public static String ELEMENT_READ_MORE_CLASSNAME = "fa-angle-right";

    /**
     * Retrieves the social media Facebook icon element on the Articles page.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the social media Facebook icon.
     */
    public static WebElement elementSocialMediaFacebookIcon(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_SOCIAL_MEDIA_FACEBOOK_ICON_ID));
    }

    /**
     * Retrieves the "Read More" button element on the Articles page.
     *
     * @param driver The WebDriver instance.
     * @return The WebElement representing the "Read More" button.
     */
    public static WebElement elementReadMore(WebDriver driver){
        return driver.findElement(By.className(ELEMENT_READ_MORE_CLASSNAME));
    }
}
