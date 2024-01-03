package JAVA_TESTING;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
        
        wd.manage().window().maximize();
        try {
            // Navigate to the registration page
            wd.get("https://www.saucedemo.com/");

            // Fill out the registration form
            WebElement usernameInput = wd.findElement(By.id("user-name"));
            usernameInput.sendKeys("standard_user");
            Thread.sleep(7000);

            WebElement passwordInput = wd.findElement(By.id("password"));
            passwordInput.sendKeys("secret_sauce");
            Thread.sleep(7000);

            WebElement submitButton = wd.findElement(By.id("login-button"));
            submitButton.click();
            Thread.sleep(10000);

        } finally {
            // Close the browser
            wd.quit();
        }
    }
}

