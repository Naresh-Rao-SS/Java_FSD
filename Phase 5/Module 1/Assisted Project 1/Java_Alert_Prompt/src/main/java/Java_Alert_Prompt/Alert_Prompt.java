package Java_Alert_Prompt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Prompt {

    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException {
        // Setup Brave Browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
        wd.manage().window().maximize();

        // Navigate to the web application
        wd.get("https://artoftesting.com/samplesiteforselenium");

        // Trigger an alert
        WebElement alertButton = wd.findElement(By.id("//*[@id=\"AlertBox\"]/button"));
        alertButton.click();

        // Handle the alert
        Alert alert = wd.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        alert.accept(); // Accept the alert

        // Close the browser
        wd.quit();
    }
}
