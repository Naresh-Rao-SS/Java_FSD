package Java_Alert_Prompt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Input_Prompt {

    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException {
        // Setup Brave Browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
        wd.manage().window().maximize();

        // Navigate to the web application
        wd.get("https://www.example.com");

        // Trigger a prompt dialog box
        WebElement promptButton = wd.findElement(By.id("promptButton"));
        promptButton.click();

        // Handle the prompt dialog box
        Alert promptBox = wd.switchTo().alert();
        System.out.println("Prompt Box Text: " + promptBox.getText());

        // Send input to the prompt
        promptBox.sendKeys("Selenium Test");
        Thread.sleep(1000);

        // Accept the prompt (click OK)
        promptBox.accept();
        // OR
        // Dismiss the prompt (click Cancel)
        // promptBox.dismiss();

        // Close the browser
        wd.quit();
    }
}
