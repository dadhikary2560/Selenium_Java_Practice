import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SkillioPracticeAutomation {
    static RemoteWebDriver driver=new ChromeDriver();
    static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    static Actions act=new Actions(driver);
    public static void skillio() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://helloskillio.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,\"dialog-close-button dialog-lightbox-close-button\")]")));

        //remove pop up -> go to free resources -> click on Automation Practice
        driver.findElement(By.xpath("//a[contains(@class,\"dialog-close-button dialog-lightbox-close-button\")]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"Free Resources\")]")).click();
        driver.findElement(By.xpath("//li[contains(@id,\"menu-item-39525\")]/child::a")).click();

        //Entering details for
        // 1. Form Elements
        driver.findElement(By.xpath("//input[contains(@placeholder, \"Enter your name\")]")).sendKeys("Debabrat");
        driver.findElement(By.xpath("//input[contains(@placeholder, \"name@example.com\")]")).sendKeys("dev@gmail.com");
        driver.findElement(By.xpath("//input[contains(@placeholder, \"Enter password\")]")).sendKeys("dev123456");
        driver.findElement(By.xpath("//label[contains(text(), \"Age\")]/following-sibling::input")).sendKeys("34");
        driver.findElement(By.xpath("//label[contains(text(), \"Comments\")]/following-sibling::textarea")).sendKeys(
                "Hi my name is Debabrat Adhikary, i am an Automation Test Engineer, with a relevant experience of 4 years");
        driver.findElement(By.xpath("//button[contains(text(), \"Submit Form\")]")).click();


        //Entering details for
        // 2. Checkbox & Radio
        driver

       /* Thread.sleep(Duration.ofSeconds(5));
        driver.quit();*/
    }

    public static void main(String[] args) throws InterruptedException {
        skillio();
    }
}
