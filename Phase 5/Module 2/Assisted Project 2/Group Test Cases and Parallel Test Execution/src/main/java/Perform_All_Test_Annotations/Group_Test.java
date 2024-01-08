package Perform_All_Test_Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class Group_Test {

    static WebDriver wd;

    @BeforeClass
    public static void setUpBraveBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
        wd.manage().window().fullscreen();
    }

    @Test(groups = "GoogleProducts")
    public void testGoogleSearch() throws InterruptedException {
        wd.get("https://www.google.com");
        Thread.sleep(7000);
        System.out.println("Test Google Search - Group: GoogleProducts - Website: www.google.com");
        // Add test logic for Google Search
    }

    @Test(groups = "GoogleProducts")
    public void testYouTubeSearch() throws InterruptedException {
        wd.get("https://www.youtube.com");
        Thread.sleep(7000);
        System.out.println("Test YouTube Search - Group: GoogleProducts - Website: www.youtube.com");
        // Add test logic for YouTube Search
    }

    @Test(groups = "Ecommerce")
    public void testAmazonPurchase() throws InterruptedException {
        wd.get("https://www.amazon.in");
        Thread.sleep(7000);
        System.out.println("Test Amazon Purchase - Group: Ecommerce - Website: www.amazon.in");
        // Add test logic for Amazon Purchase
    }

    @Test(groups = "Ecommerce")
    public void testFlipkartPurchase() throws InterruptedException {
        wd.get("https://www.flipkart.com");
        Thread.sleep(7000);
        System.out.println("Test Flipkart Purchase - Group: Ecommerce - Website: www.flipkart.com");
        // Add test logic for Flipkart Purchase
    }

    @AfterClass
    public static void tearDown() {
        wd.quit();
    }
}
