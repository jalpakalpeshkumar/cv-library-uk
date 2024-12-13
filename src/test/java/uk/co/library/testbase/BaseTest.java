package uk.co.library.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.propertyreader.PropertyReader;

public class BaseTest extends uk.co.library.utilities.Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }



    @AfterMethod
    public void tearDown(){
        //  closeBrowser();
    }
}
