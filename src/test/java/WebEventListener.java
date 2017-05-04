import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

public class WebEventListener implements WebDriverEventListener {

    public void beforeNavigateTo(String s, WebDriver webDriver) {
        Reporter.log("At before navigate to: " + s, true);

    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        Reporter.log("At after navigate to: " + s, true);

    }

    public void beforeNavigateBack(WebDriver webDriver) {
        Reporter.log("At before navigate back", true);
    }

    public void afterNavigateBack(WebDriver webDriver) {
        Reporter.log("At after navigate back", true);
    }

    public void beforeNavigateForward(WebDriver webDriver) {
        Reporter.log("At before navigate forward", true);

    }

    public void afterNavigateForward(WebDriver webDriver) {
        Reporter.log("At after navigate forward",true);

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {
        Reporter.log("At before navigate refresh", true);

    }

    public void afterNavigateRefresh(WebDriver webDriver) {
        Reporter.log("At after navigate refresh", true);

    }

    // Important to have this
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) throws WebDriverException {
        Reporter.log("At before find by: " + by.toString(), true);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        try {
            js.executeScript("document.getElementsByClassName('acsInviteButton acsDeclineButton')[0].click();");
        } catch (WebDriverException e) {
            Reporter.log(e.toString(), true);
        }

    }

    // Important to have this
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) throws WebDriverException {
        Reporter.log("At after find by: " + by.toString(), true);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        try {
            js.executeScript("document.getElementsByClassName('acsInviteButton acsDeclineButton')[0].click();");
        } catch (WebDriverException e) {
            Reporter.log(e.toString(), true);
        }

    }

    // Important to have this
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) throws WebDriverException{
        Reporter.log("At before click on: " + webElement.toString(), true);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        try {
            js.executeScript("document.getElementsByClassName('acsInviteButton acsDeclineButton')[0].click();");
        } catch (WebDriverException e) {
            Reporter.log(e.toString(), true);
        }

    }

    // Important to have this
    public void afterClickOn(WebElement webElement, WebDriver webDriver) throws WebDriverException {
        Reporter.log("At after click on: " + webElement.toString(), true);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        try {
            js.executeScript("document.getElementsByClassName('acsInviteButton acsDeclineButton')[0].click();");
        } catch (WebDriverException e) {
            Reporter.log(e.toString(), true);
        }

    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        Reporter.log("At before change value of", true);

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        Reporter.log("At after change value of", true);

    }

    public void beforeScript(String s, WebDriver webDriver) {
        Reporter.log("At before script", true);

    }

    public void afterScript(String s, WebDriver webDriver) {
        Reporter.log("At after script", true);

    }

    // Important to maintain this as you may have new popups in the future and will need to catch the exception
    public void onException(Throwable throwable, WebDriver webDriver) {
        Reporter.log(throwable.toString(), true);

    }
}
