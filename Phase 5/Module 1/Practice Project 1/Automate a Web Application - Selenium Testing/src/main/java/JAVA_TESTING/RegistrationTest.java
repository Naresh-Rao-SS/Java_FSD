package JAVA_TESTING;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {
    static WebDriver wd;

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
        
        wd.manage().window().maximize();
        try {
            // Navigate to the registration page
            wd.get("https://parabank.parasoft.com/parabank/register.htm");

            // Fill out the registration form
            WebElement userfirstnameInput = wd.findElement(By.id("customer.firstName"));
            userfirstnameInput.sendKeys("standard");
            Thread.sleep(7000);

            WebElement userlastnameInput = wd.findElement(By.id("customer.lastName"));
            userlastnameInput.sendKeys("user");
            Thread.sleep(7000);

            WebElement useraddress = wd.findElement(By.id("customer.address.street"));
            useraddress.sendKeys("unknown Street");
            Thread.sleep(7000);
            
            WebElement useraddresscity = wd.findElement(By.id("customer.address.city"));
            useraddresscity.sendKeys("Bengaluru");
            Thread.sleep(7000);

            WebElement useraddressstate = wd.findElement(By.id("customer.address.state"));
            useraddressstate.sendKeys("karnataka");
            Thread.sleep(7000);
            
            WebElement useraddresszipcode = wd.findElement(By.id("customer.address.zipCode"));
            useraddresszipcode.sendKeys("7777777");
            Thread.sleep(7000);
            
            WebElement useraddressphonenumber = wd.findElement(By.id("customer.phoneNumber"));
            useraddressphonenumber.sendKeys("9066124507");
            Thread.sleep(7000);

            WebElement useraddressssn = wd.findElement(By.id("customer.ssn"));
            useraddressssn.sendKeys("52");
            Thread.sleep(7000);
            
            WebElement username = wd.findElement(By.id("customer.username"));
            username.sendKeys("standard_user");
            Thread.sleep(7000);
            
            WebElement password = wd.findElement(By.id("customer.password"));
            password.sendKeys("standard_user");
            Thread.sleep(7000);
         
            WebElement repeatedpassword = wd.findElement(By.id("repeatedPassword"));
            repeatedpassword.sendKeys("secret_sauce");
            Thread.sleep(7000);
            
            WebElement button = wd.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
            button.click();
            Thread.sleep(10000);
            
        } finally {
            // Close the browser
            wd.quit();
        }
    }

}
