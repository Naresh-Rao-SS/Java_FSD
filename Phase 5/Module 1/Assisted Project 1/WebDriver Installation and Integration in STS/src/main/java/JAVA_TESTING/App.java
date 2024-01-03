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
     // Locate element by id
        WebElement elementById = wd.findElement(By.id("header"));
        String elementByIdInfo = "ID - Text: " + elementById.getText() +
                                ", Tag Name: " + elementById.getTagName() +
                                ", Attribute Value: " + elementById.getAttribute("attributeName");
        System.out.println(elementByIdInfo);
        
        System.out.println("");

        // Locate element by Name
        WebElement elementByName = wd.findElement(By.name("description"));
        String elementByNameInfo = "Name - Text: " + elementByName.getText() +
                                  ", Tag Name: " + elementByName.getTagName() +
                                  ", Attribute Value: " + elementByName.getAttribute("attributeName");
        System.out.println(elementByNameInfo);
        
        System.out.println("");
        
        // Locate element by XPath
        WebElement elementByXPath = wd.findElement(By.xpath("//*[@id=\"HTML1\"]/div/p/strong/span[1]"));
        String elementByXPathInfo = "XPath - Text: " + elementByXPath.getText() +
                                    ", Tag Name: " + elementByXPath.getTagName() +
                                    ", Attribute Value: " + elementByXPath.getAttribute("attributeName");
        System.out.println(elementByXPathInfo);
        
        System.out.println("");

        wd.quit();
    }

}
