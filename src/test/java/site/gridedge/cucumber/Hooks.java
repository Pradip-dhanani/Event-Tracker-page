package site.gridedge.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import site.gridedge.basePage.BasePage;
import site.gridedge.browserSelector.BrowserSelector;
import site.gridedge.loadProperty.LoadProperty;
import site.gridedge.utility.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


/**
 * Created by Pradip
 */

public class Hooks extends BasePage {

    /**
     * Object creation for browser selector class
     */
    BrowserSelector browserSelector = new BrowserSelector();
    /**
     * Object creation for load property class
     */
    LoadProperty loadProperty = new LoadProperty();

    /**
     * Initialize global variable
     */
    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @Before
    /**
     * Below method open browser and maximize browser and wait method to wait on each element when execution start
     */

    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    /**
     * Below quit method to close all browser after executions and it will take screenshot if any test fail on execution
     */

    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace("","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e){
                e.printStackTrace();
            }
            //driver.quit();
        }

    }
}