import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

public class WebEventListener implements WebDriverEventListener {

    public void beforeNavigateTo(String s, WebDriver webDriver) {
        Reporter.log("At before navigate to");

    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        Reporter.log("At after navigate to");

    }

    public void beforeNavigateBack(WebDriver webDriver) {
        Reporter.log("At before navigate back");
    }

    public void afterNavigateBack(WebDriver webDriver) {
        Reporter.log("At after navigate back");
    }

    public void beforeNavigateForward(WebDriver webDriver) {
        Reporter.log("At before navigate forward");

    }

    public void afterNavigateForward(WebDriver webDriver) {
        Reporter.log("At after navigate forward");

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {
        Reporter.log("At before navigate refresh");

    }

    public void afterNavigateRefresh(WebDriver webDriver) {
        Reporter.log("At after navigate refresh");

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        Reporter.log("At before find by");

    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        Reporter.log("At after find by");

    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        Reporter.log("At before click on");

    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        Reporter.log("At after click on");

    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        Reporter.log("At before change value of");

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        Reporter.log("At after change value of");

    }

    public void beforeScript(String s, WebDriver webDriver) {
        Reporter.log("At before script");

    }

    public void afterScript(String s, WebDriver webDriver) {
        Reporter.log("At after script");

    }

    public void onException(Throwable throwable, WebDriver webDriver) {
        Reporter.log("At on exception");

    }
}
