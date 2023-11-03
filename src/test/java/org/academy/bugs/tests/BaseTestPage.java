package org.academy.bugs.tests;

import org.academy.bugs.web.drivers.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTestPage {
    protected WebDriver driver;

    @Before
    public void setup() {
        // Initialize the WebDriver before each test method
        driver = ChromeDriverManager.getDriver();
    }

    @After
    public void tearDown() {
        // Close the WebDriver after each test method
        ChromeDriverManager.quitDriver();
    }
}
