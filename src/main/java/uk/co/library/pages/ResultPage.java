package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlistners.CustomListeners;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    public void selectJobType(String jobType) {
        Reporter.log("Select " + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }
}
