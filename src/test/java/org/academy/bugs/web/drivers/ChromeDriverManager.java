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

package org.academy.bugs.web.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Manager class for creating and managing ChromeDriver instances.
 */
public class ChromeDriverManager {

    private ChromeDriverManager() {
        // Private constructor to prevent instantiation
    }

    /**
     * Retrieves a new instance of the ChromeDriver.
     *
     * @return A new instance of the ChromeDriver.
     */
    public static WebDriver getDriver() {
        return new ChromeDriver();
    }

    /**
     * Quits the provided WebDriver instance.
     *
     * @param driver The WebDriver instance to quit.
     */
    public static void quitDriver(WebDriver driver) {
//        driver.quit();
    }
}
