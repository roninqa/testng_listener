import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ListenerTest {

    private WebDriver driver;
    private EventFiringWebDriver e_driver;
    private WebEventListener webEventListener;

    @Test
    public void listenerRunsOnFailedTest() {
        Assert.assertEquals(false, true);
    }

    @Test
    public void listenerDoesNotRunOnPassedTest() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void listenerWebEventTest() {
        driver = new ChromeDriver();
        e_driver = new EventFiringWebDriver(driver);
        webEventListener = new WebEventListener();
        e_driver.register(webEventListener);

        e_driver.get("http://www.google.com");
        e_driver.findElement(By.cssSelector("a[title='Cars for Sale']")).click();
        String x = e_driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(x, "Search Cars for Sale");


    }

    @AfterMethod
    public void teardown() {
        if (e_driver != null) {
            e_driver.quit();
        }

    }
}