import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Listener2Test {

    private WebDriver driver;

    @Test
    public void listenerWebEventTest() {
        driver = new ChromeDriver();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NullPointerException.class);


        driver.get("https://test2.autotrader.com/");
        driver.findElement(By.cssSelector("[data-qaid='lnk-fyc']")).click();
        Assert.assertEquals("Search Cars for Sale", "Search Cars for Salez", "Oh, snaps! Wrong!");

    }

    @Test
    public void listenerWebEventZzzTest() {
        driver = new ChromeDriver();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NullPointerException.class);


        driver.get("https://test2.autotrader.com/");
        driver.findElement(By.cssSelector("[data-qaid='lnk-fycZzz']")).click();
        Assert.assertEquals("Search Cars for Sale", "Search Cars for Sale", "Oh, snaps! Wrong!");

    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }
}