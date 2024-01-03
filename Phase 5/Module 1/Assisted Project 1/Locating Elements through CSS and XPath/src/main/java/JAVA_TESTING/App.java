package JAVA_TESTING;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        wd.get("https://imaginemagicbox.blogspot.com/");
        wd.manage().window().maximize();
        Thread.sleep(7000);
     // Locate element by css
        WebElement elementByCSS = wd.findElement(By.cssSelector("#HTML1 > div > p > strong > span:nth-child(1)"));
        String textFromCSS = elementByCSS.getTagName();
        System.out.println("Text from CSS: " + textFromCSS);


        // Locate element by XPath
        WebElement elementByXPath = wd.findElement(By.xpath("//*[@id=\"HTML1\"]/div/p/strong/span[1]"));
        String textFromXPath = elementByXPath.getText();
        System.out.println("Text from XPath: " + textFromXPath);


        wd.quit();
    }

}
