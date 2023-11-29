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

import org.academy.bugs.pages.ArticlesPage;
import org.academy.bugs.utils.CommonUtils;
import org.academy.bugs.utils.SocialMedia;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for validating the behavior of the ArticlesPage.
 */
public class ArticlesPageTest extends BaseTestPage {

    /**
     * Verifies that clicking on the Facebook icon in the Social Media section
     * redirects to the expected Facebook page.
     */
    @Test
    public void verifyRedirectUponSocialMediaFacebookClick() {
        driver.get(ArticlesPage.URL_MY_ARTICLES_PAGE);
        ArticlesPage.elementSocialMediaFacebookIcon(driver).click();

        CommonUtils.sleep();

        Assert.assertEquals("Error, page redirection did not occur as expected!",
                SocialMedia.URL_FACEBOOK_PAGE, driver.getCurrentUrl());
    }

    /**
     * Verifies that clicking on the "Read More" link on the My Articles page
     * redirects to the individual article page.
     */
    @Test
    public void verifyRedirectUponReadMoreClick() {
        driver.get(ArticlesPage.URL_MY_ARTICLES_PAGE);
        ArticlesPage.elementReadMore(driver).click();

        CommonUtils.sleep();

        Assert.assertEquals("Error, page redirection did not occur as expected!",
                ArticlesPage.URL_MY_ARTICLES_PAGE_INDIVIDUAL, driver.getCurrentUrl());
    }
}
