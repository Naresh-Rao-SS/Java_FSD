package JAVA_TESTING;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
        wd.manage().window().maximize();

        wd.get("https://www.google.com");
        Thread.sleep(1000);
        takeScreenShot(wd,"abc");

        // Find the search box and enter the URL
        wd.findElement(By.name("q")).sendKeys("https://imaginemagicbox.blogspot.com",Keys.ENTER);
        Thread.sleep(2000);
        takeScreenShot(wd,"def");

        wd.quit();
    }
    
    public static void takeScreenShot(WebDriver wd,String fileName) throws IOException {
		//take the screenshot and store it as a file format 
		File file=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//copy the screen shot to the specified location
		FileUtils.copyFile(file,new File("D:\\"+fileName+".png") );
		
		
	}

}
