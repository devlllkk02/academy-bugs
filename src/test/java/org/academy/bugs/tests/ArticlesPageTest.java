package org.academy.bugs.tests;

import org.academy.bugs.constants.Constants;
import org.academy.bugs.pages.ApplyNowPage;
import org.academy.bugs.pages.ArticlesPage;
import org.academy.bugs.pages.OpportunitiesWeProvidePage;
import org.academy.bugs.utils.SocialMedia;
import org.junit.Assert;
import org.junit.Test;

public class ArticlesPageTest extends BaseTestPage {

    @Test
    public void verifyRedirectUponSocialMediaFacebookClick() {
        driver.get(ArticlesPage.URL_MY_ARTICLES_PAGE);
        ArticlesPage.elementSocialMediaFacebookIcon(driver).click();

        try {
            Thread.sleep(Constants.WAIT_DURATION_IN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Error, page redirection did not occur as expected!", driver.getCurrentUrl(),
                SocialMedia.URL_FACEBOOK_PAGE);
    }

    @Test
    public void verifyRedirectUponReadMoreClick() {
        driver.get(ArticlesPage.URL_MY_ARTICLES_PAGE);
        ArticlesPage.elementReadMore(driver).click();

        try {
            Thread.sleep(Constants.WAIT_DURATION_IN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Error, page redirection did not occur as expected!",
                ArticlesPage.URL_MY_ARTICLES_PAGE_INDIVIDUAL, driver.getCurrentUrl());
    }
}
