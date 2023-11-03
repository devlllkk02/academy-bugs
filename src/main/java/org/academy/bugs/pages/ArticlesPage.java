package org.academy.bugs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlesPage {
    public static String URL_MY_ARTICLES_PAGE = "https://academybugs.com/articles/";
    public static String URL_MY_ARTICLES_PAGE_INDIVIDUAL =
            "https://academybugs.com/why-do-i-need-to-use-financial-consulting-service/";


    public static String ELEMENT_SOCIAL_MEDIA_FACEBOOK_ICON_ID = "square-share-a1";
    public static String ELEMENT_READ_MORE_CLASSNAME = "fa-angle-right";



    public static WebElement elementSocialMediaFacebookIcon(WebDriver driver){
        return driver.findElement(By.id(ELEMENT_SOCIAL_MEDIA_FACEBOOK_ICON_ID));
    }

    public static WebElement elementReadMore(WebDriver driver){
        return driver.findElement(By.className(ELEMENT_READ_MORE_CLASSNAME));
    }
}
