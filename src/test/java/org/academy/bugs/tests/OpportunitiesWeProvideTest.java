package org.academy.bugs.tests;

import org.academy.bugs.constants.Constants;
import org.academy.bugs.pages.ApplyNowPage;
import org.academy.bugs.pages.OpportunitiesWeProvidePage;
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

        Assert.assertEquals("Error, page redirection did not occur as expected!",
                ApplyNowPage.URL_MY_APPLY_NOW_PAGE,driver.getCurrentUrl());
    }
}
