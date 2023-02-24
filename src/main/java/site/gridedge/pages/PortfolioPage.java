package site.gridedge.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import site.gridedge.utility.Utility;


/**
 * Created by Pradip
 */

/**
 * Home page class extends to use properties and behaviour of utility class
 */
public class PortfolioPage extends Utility {

    /**
     * logger to print logs
     */

    private static final Logger log = LogManager.getLogger(PortfolioPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[2]/app-portfolio[1]/div[1]/div[2]/div[1]/div[2]/app-portfolio-card[1]/mat-card[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]/span[1]/span[1]")
    WebElement _energyTracker;



    /**
     * Method created to do actions on each web element
     */

    public void clickOnEnergyTrackerButton() {
        Reporter.addStepLog("Click on Energy Tracker button " + _energyTracker.toString() + "<br>");
        clickOnElement(_energyTracker);
        log.info("Click on Energy Tracker button" + _energyTracker.toString());
    }


}
