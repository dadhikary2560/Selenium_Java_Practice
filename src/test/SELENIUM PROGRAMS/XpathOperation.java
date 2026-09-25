import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class XpathOperation {
    static RemoteWebDriver driver=new ChromeDriver();
    static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    static Actions act=new Actions(driver);

    public static void skillio()
    {
        driver.get("https://helloskillio.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,\"dialog-close-button dialog-lightbox-close-button\")]")));
        driver.findElement(By.xpath("//a[contains(@class,\"dialog-close-button dialog-lightbox-close-button\")]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"Free Resources\")]")).click();
        driver.findElement(By.xpath("//li[contains(@id,\"menu-item-39525\")]/child::a")).click();

        WebElement e= driver.findElement(By.xpath("//label[contains(text(),\"Full Name\")]/following-sibling::input"));
        e.sendKeys("Debabrat Adhikary");
    }

    public static void orangeHrm()
    {
        //first page, login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, \"Username\")]")));
        driver.findElement(By.xpath("//input[contains(@placeholder, \"Username\")]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[contains(@placeholder, \"Password\")]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@class, 'oxd-button--main orangehrm-login-button')]")).click();

        //dashboard, hover on Assign Leave icon
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@title,'Assign Leave')]")));
        act.moveToElement(driver.findElement(By.xpath("//button[contains(@title,'Assign Leave')]")));
        act.perform();          //action class can only perform with the perform method


        //going to profile icon
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class, 'oxd-userdropdown-tab')]")));
        driver.findElement(By.xpath("//span[contains(@class, 'oxd-userdropdown-tab')]")).click();
    }

    public static void main(String[] args) {
        driver.manage().window().maximize();
//        skillio();
        orangeHrm();
        //driver.quit();
    }
}
