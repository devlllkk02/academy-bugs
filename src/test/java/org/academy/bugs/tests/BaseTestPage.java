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

import org.academy.bugs.web.drivers.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**
 * Base test class providing setup and teardown methods for WebDriver initialization and cleanup.
 */
public class BaseTestPage {
    protected WebDriver driver;

    /**
     * Setup method to initialize the WebDriver before each test method.
     */
    @Before
    public void setup() {
        // Initialize the WebDriver before each test method
        driver = ChromeDriverManager.getDriver();
    }

    /**
     * Teardown method to close the WebDriver after each test method.
     */
    @After
    public void tearDown() {
        // Close the WebDriver after each test method
        ChromeDriverManager.quitDriver(driver);
    }
}
