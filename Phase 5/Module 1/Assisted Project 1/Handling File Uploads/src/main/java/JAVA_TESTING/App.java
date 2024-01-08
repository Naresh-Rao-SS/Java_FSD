package JAVA_TESTING;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Setup Brave Browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        WebDriver wd = new ChromeDriver(option);
        wd.manage().window().maximize();

        // Go to the website
        wd.get("https://www.ilovepdf.com/pdf_to_word");

        // Upload file
        wd.findElement(By.id("pickfiles")).click();
        Runtime.getRuntime().exec("D:\\Mphasis\\Mphasis Files\\Phase 5\\Module 1\\Assisted Project 1\\Upload Files\\Upload_pdf.exe");
        Thread.sleep(5000);

        // Process task
        wd.findElement(By.id("processTask")).click();
        Thread.sleep(5000);
        
        // Close the browser
        wd.quit();
    }
}
