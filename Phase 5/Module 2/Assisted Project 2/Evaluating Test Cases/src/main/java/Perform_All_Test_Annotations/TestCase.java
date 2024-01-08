package Perform_All_Test_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase {

    static WebDriver wd;

    @BeforeClass
    public static void setUpBraveBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
    }

    @Test
    public void evaluateGoogleSearch() throws InterruptedException {
        wd.get("https://www.google.com");
        WebElement searchInput = wd.findElement(By.name("q"));
        searchInput.sendKeys("Naresh Rao S S");
        Thread.sleep(7000);
        searchInput.submit();

        // Assert that the search results page is displayed
        WebElement resultCount = wd.findElement(By.id("result-stats"));
        Assert.assertTrue(resultCount.isDisplayed(), "Google search results are not displayed");
    }

    @Test
    public void evaluateAmazonSearch() throws InterruptedException {
        wd.get("https://www.amazon.in");
        WebElement searchInput = wd.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("I mac");
        Thread.sleep(7000);
        searchInput.submit();

        // Assert that the search results page is displayed
        WebElement resultCount = wd.findElement(By.xpath("//span[contains(text(),'results for')]"));
        Assert.assertTrue(resultCount.isDisplayed(), "Amazon search results are not displayed");
    }

    @AfterClass
    public static void tearDown() {
        wd.quit();
    }
}
