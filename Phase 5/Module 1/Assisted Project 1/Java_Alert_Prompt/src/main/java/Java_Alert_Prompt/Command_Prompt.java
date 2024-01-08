package Java_Alert_Prompt;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Command_Prompt {

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

        // Trigger a confirmation box
        WebElement confirmButton = wd.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button"));
        confirmButton.click();

        // Handle the confirmation box
        Alert confirmationBox = wd.switchTo().alert();
        System.out.println("Confirmation Box Text: " + confirmationBox.getText());

        // Accept the confirmation (click OK)
        //confirmationBox.accept();
        // OR
        
        // Dismiss the confirmation (click Cancel)
         confirmationBox.dismiss();

        // Close the browser
        wd.quit();
    }
}
