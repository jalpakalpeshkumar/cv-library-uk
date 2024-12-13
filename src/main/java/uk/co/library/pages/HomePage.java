package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlistners.CustomListeners;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(id = "cf_consent-buttons__accept-all")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Keywords / Job Title / Job Ref']")
    WebElement jobTitleField;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Location']")
    WebElement locationField;


    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;


    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;


    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;


    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;


    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;


    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;


    public void clickOnCookies() {
        clickOnElement(cookies);
        CustomListeners.test.log(Status.PASS, "Click on " + cookies);
        Reporter.log("Click on " + cookies.toString());

    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        CustomListeners.test.log(Status.PASS, "Enter Job " + jobTitle);
        Reporter.log("enter job " + jobTitleField.toString());


    }

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
        CustomListeners.test.log(Status.PASS, "Enter Location " + location);
        Reporter.log("enter Location " + locationField.toString());


    }

    public void selectDistance(String distance) {
        Reporter.log("Select " + distanceDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select " + distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown, distance);


    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "Click on " + moreSearchOptionsLink);
        Reporter.log("Click on " + moreSearchOptionsLink.toString());


    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "Enter Salary " + minSalary);
        Reporter.log("Enter Salary " + salaryMin.toString());


    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "Enter Salary" + maxSalary);
        Reporter.log("Enter Salary" + salaryMax.toString());


    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select " + salaryTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);

    }

    public void selectJobType(String jobType) {
        Reporter.log("Select " + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
}