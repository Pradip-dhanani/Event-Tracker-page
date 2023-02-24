package site.gridedge.pages;


/**
 * Created by Pradip
 */

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import site.gridedge.utility.Utility;

/**
 * Home page class extends to use properties and behaviour of utility class
 */
public class EnergyTrackerPage extends Utility {

    /**
     * logger to print logs
     */

    private static final Logger log = LogManager.getLogger(EnergyTrackerPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//span[contains(text(),'Custom Date Range')]")
    WebElement _getTextMessageCustomDateRange;




    /**
     * Method created to do actions on each web element
     */

    public String customDateRangeMessage() {
        Reporter.addStepLog("Getting Custom Date Range text message " + _getTextMessageCustomDateRange.toString() + "<br>");
        log.info("Getting Custom Date Range text message" + _getTextMessageCustomDateRange.toString());
        return getTextFromElement(_getTextMessageCustomDateRange);
    }

}
