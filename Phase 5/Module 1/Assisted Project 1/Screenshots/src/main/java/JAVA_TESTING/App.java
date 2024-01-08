package JAVA_TESTING;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class App {

    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException, IOException {
        // Setup Brave Browser
    	 WebDriverManager.chromedriver().setup();
         ChromeOptions option = new ChromeOptions();
         option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
         wd = new ChromeDriver(option);
         wd.manage().window().maximize();


        // Navigate to the web application
        wd.get("https://www.linkedin.com/in/nareshraoss/");
        captureScreenshot("openingwebsite");


        // Close the browser
        wd.quit();
    }

    private static void captureScreenshot(String fileName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) wd;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("D:\\" + fileName + ".png");
        FileUtils.copyFile(sourceFile, destinationFile);
    }
}
