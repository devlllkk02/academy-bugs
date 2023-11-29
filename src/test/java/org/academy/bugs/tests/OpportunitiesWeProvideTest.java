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

import org.academy.bugs.pages.ApplyNowPage;
import org.academy.bugs.pages.OpportunitiesWeProvidePage;
import org.academy.bugs.utils.CommonUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for validating the behavior of the OpportunitiesWeProvidePage.
 */
public class OpportunitiesWeProvideTest extends BaseTestPage{

    /**
     * Verifies that clicking on the "Apply Now" button on the Opportunities We Provide
     * page redirects to the Apply Now page.
     */
    @Test
    public void verifyRedirectUponApplyNowClick(){
        driver.get(OpportunitiesWeProvidePage.URL_OPPORTUNITIES_WE_PROVIDE_PAGE);
        OpportunitiesWeProvidePage.elementButtonApplyNow(driver).click();

        CommonUtils.sleep();

        Assert.assertEquals("Error, page redirection did not occur as expected!",
                ApplyNowPage.URL_MY_APPLY_NOW_PAGE,driver.getCurrentUrl());
    }
}
