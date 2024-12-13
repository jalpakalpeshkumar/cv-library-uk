package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.library.customlistners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;


@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "jobSearchData", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) {


        homePage.clickOnCookies();

//        enter job title 'jobTitle'
        homePage.enterJobTitle(jobTitle);

//        enter Location 'location'
        homePage.enterLocation(location);


//        select distance 'distance'
        homePage.selectDistance(distance);

//        click on moreSearchOptionsLink
        homePage.clickOnMoreSearchOptionLink();

//        enter salaryMin 'salaryMin'
        homePage.enterMinSalary(salaryMin);

//        enter salaryMax 'salaryMax'
        homePage.enterMaxSalary(salaryMax);

//        select salaryType 'salaryType'
        homePage.selectSalaryType(salaryType);

//        select jobType 'jobType'
        homePage.selectJobType(jobType);

//        click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();

//        verify the result 'result'

    }
}
