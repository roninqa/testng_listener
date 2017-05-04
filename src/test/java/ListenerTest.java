import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ListenerTest {

    private WebDriver driver;
    private EventFiringWebDriver e_driver;
    private WebEventListener webEventListener;
    private WebDriverWait wait;
    public int time = 10;

//    @Test
//    public void listenerRunsOnFailedTest() {
//        Assert.assertEquals(false, true);
//    }
//
//    @Test
//    public void listenerDoesNotRunOnPassedTest() {
//        Assert.assertEquals(true, true);
//    }

    @Test
    public void listenerWebEventTest() throws InterruptedException {
        driver = new ChromeDriver();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NullPointerException.class);

        e_driver = new EventFiringWebDriver(driver);
        webEventListener = new WebEventListener();
        e_driver.register(webEventListener);

        e_driver.get("http://www.google.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Cars for Sale']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        Assert.assertEquals(e_driver.findElement(By.tagName("h1")).getText(), "Search Cars for Sale");


    }

    @AfterMethod
    public void teardown() {
        if (e_driver != null) {
            e_driver.quit();
        }

    }
}