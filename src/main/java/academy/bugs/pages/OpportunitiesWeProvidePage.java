package academy.bugs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpportunitiesWeProvidePage {

    public static String URL_OPPORTUNITIES_WE_PROVIDE_PAGE = "https://academybugs.com/opportunities-we-provide/";

    public static String ELEMENT_BUTTON_APPLY_NOW_CLASSNAME = "utest-contact-button";

    public static WebElement elementButtonApplyNow(WebDriver driver) {
        return driver.findElement(By.className(ELEMENT_BUTTON_APPLY_NOW_CLASSNAME));
    }

}
