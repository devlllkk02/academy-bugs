package org.academy.bugs.web.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager {
    private static WebDriver driver;

    private ChromeDriverManager() {
        // Private constructor to prevent instantiation
    }

    public static WebDriver getDriver() {
//        if (driver == null) {
//            // Set ChromeDriver system property (you can configure this path)
//            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
//
//            // Initialize the WebDriver
//            driver = new ChromeDriver();
//        }
//        return driver;
        return new ChromeDriver();
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
