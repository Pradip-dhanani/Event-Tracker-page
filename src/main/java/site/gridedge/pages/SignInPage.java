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
public class SignInPage extends Utility {

    /**
     * logger to print logs
     */

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(css = "[placeholder=Email]")
    WebElement _emailId;
    @FindBy(css = "[placeholder=Password]")
    WebElement _passwordField;
    @FindBy(className = "mat-checkbox-inner-container")
    WebElement _clickOnCheckbox;
    @FindBy(id = "signInButton")
    WebElement _signInButton;
    @FindBy(xpath = "//span[contains(text(),'Portfolio')]")
    WebElement _getPorfolioTitle;




    /**
     * Method created to do actions on each web element
     */
    public void enterEmailId(String email) {
        Reporter.addStepLog("Enter email " + email + "On Email Field" + _emailId.toString() + "<br>");
        sendTextToElement(_emailId, email);
        log.info("Enter email" + email + "On Email Field" + _emailId.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter password " + password + "On password Field" + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Enter password" + password + "On password Field" + _passwordField.toString());
    }

    public void clickOnCheckBoxButton() {
        Reporter.addStepLog("Click on check box button " + _clickOnCheckbox.toString() + "<br>");
        clickOnElement(_clickOnCheckbox);
        log.info("Click on check box button" + _clickOnCheckbox.toString());
    }

    public void clickOnSignInButton() {
        Reporter.addStepLog("Click on Sign In button " + _signInButton.toString() + "<br>");
        clickOnElement(_signInButton);
        log.info("Click on Sign In button" + _signInButton.toString());
    }

    public String getPorfolioTitleOnThePage() {
        Reporter.addStepLog("Getting porfolio title on the page " + _getPorfolioTitle.toString() + "<br>");
        log.info("Getting porfolio title on the page " + _signInButton.toString());
        return getTextFromElement(_getPorfolioTitle);
    }





}
