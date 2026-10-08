import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRM {
    static RemoteWebDriver driver=new ChromeDriver();
    static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
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
        wait.pollingEvery(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@title,'Assign Leave')]")));
        act.moveToElement(driver.findElement(By.xpath("//button[contains(@title,'Assign Leave')]")));
        act.perform();          //action class can only perform with the perform method


        //going to profile icon and logout
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class, 'oxd-userdropdown-tab')]")));
        driver.findElement(By.xpath("//span[contains(@class, 'oxd-userdropdown-tab')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Logout\"]")));
        driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();

        //doing login again
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, \"Username\")]")));
        driver.findElement(By.xpath("//input[contains(@placeholder, \"Username\")]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[contains(@placeholder, \"Password\")]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@class, 'oxd-button--main orangehrm-login-button')]")).click();

        //refreshing page to see if dashboard is still active during an active session
        driver.navigate().refresh();

        //going to admin page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'/web/index.php/admin/viewAdminModule')]")));
        driver.findElement(By.xpath("//a[contains(@href,'/web/index.php/admin/viewAdminModule')]")).click();

        //entering Username as Admin to validate, if this user exists or not
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class, \"oxd-input oxd-input--active\")])[2]")));
        driver.findElement(By.xpath("(//input[contains(@class, \"oxd-input oxd-input--active\")])[2]")).sendKeys("Admin");
        //or this xpath can be used         //div[contains(@class,"oxd-input-field-bottom-space")]/div/input
        driver.findElement(By.xpath("//div[contains(@class, \"oxd-form-actions\")]/button[contains(@class, \"orangehrm-left-space\")]")).click();


        //now going to PIM menu
        driver.findElement(By.xpath("//span[text()=\"PIM\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Employee Name\"]/ancestor::div[contains(@class,\"oxd-input-group\")]//input")));
        driver.findElement(By.xpath("//label[text()=\"Employee Name\"]/ancestor::div[contains(@class,\"oxd-input-group\")]//input")).sendKeys("Amelia");
        driver.findElement(By.xpath("//div[contains(@class,\"oxd-form-actions\")]/button[2]")).click();

        //adding employee to PIM Menu
        driver.findElement(By.xpath("//button[contains(@class, \"oxd-button oxd-button--medium oxd-button--secondary\")]/i")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,\"oxd-file-input\")]/following::button[1]")));
        driver.findElement(By.xpath("//input[contains(@class,\"oxd-file-input\")]")).sendKeys(
                "D:\\D drive\\images\\Photos-001 (10)\\Dev.jpg");
        driver.findElement(By.xpath("//input[contains(@placeholder, \"First Name\")]")).sendKeys("Debabrat");
        driver.findElement(By.xpath("//input[contains(@placeholder, \"Last Name\")]")).sendKeys("Adhikary");
        driver.findElement(By.xpath("//span[contains(@class, \"oxd-switch-input oxd-switch-input--active --label-right\")]")).click();

        //input field to add user (found xpath using ancestor)
        driver.findElement(By.xpath("//label[text()=\"Username\"]/ancestor::div[contains(@class,\"oxd-input-group\")]//input")).sendKeys("DEBADH");
        driver.findElement(By.xpath("//label[text()=\"Password\"]/ancestor::div[contains(@class,\"oxd-input-group\")]//input")).sendKeys("deb1234");
        driver.findElement(By.xpath("//label[text()=\"Confirm Password\"]/ancestor::div[contains(@class,\"oxd-input-group\")]//input")).sendKeys("deb1234");

        driver.findElement(By.xpath("//button[contains(@class,\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\")]")).click();
    }

    public static void main(String[] args) {
        driver.manage().window().maximize();
//        skillio();
        orangeHrm();
        //driver.quit();
    }
}
