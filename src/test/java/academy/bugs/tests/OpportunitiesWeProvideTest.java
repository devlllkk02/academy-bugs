package academy.bugs.tests;

import academy.bugs.constants.Constants;
import academy.bugs.pages.ApplyNowPage;
import academy.bugs.pages.OpportunitiesWeProvidePage;
import org.junit.Assert;
import org.junit.Test;

public class OpportunitiesWeProvideTest extends BaseTestPage{

    @Test
    public void verifyRedirectUponApplyNowClick(){
        driver.get(OpportunitiesWeProvidePage.URL_OPPORTUNITIES_WE_PROVIDE_PAGE);
        OpportunitiesWeProvidePage.elementButtonApplyNow(driver).click();

        try {
            Thread.sleep(Constants.WAIT_DURATION_IN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Error, page redirection did not occur as expected!",driver.getCurrentUrl(),
                ApplyNowPage.URL_MY_APPLY_NOW_PAGE);
    }
}
