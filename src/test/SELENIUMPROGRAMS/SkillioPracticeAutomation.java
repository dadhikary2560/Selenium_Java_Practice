package SELENIUMPROGRAMS;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class SkillioPracticeAutomation {
    static RemoteWebDriver driver=new ChromeDriver();
    static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    static Actions act=new Actions(driver);
    public static void skillio1stSection() throws InterruptedException {

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
        driver.findElement(By.xpath("//div[contains(@class,\"check\")]/label[text()=\"Selenium\"]")).click();
        driver.findElement(By.xpath("//div[contains(@class,\"check\")]/label[text()=\"Java\"]")).click();
        driver.findElement(By.xpath("//div[contains(@class,\"radio\")]/label[text()=\"Advanced\"]")).click();

    }

    public static void thirdSection()
    {
        //Single select
        WebElement forSelect=driver.findElement(By.id("country"));
        Select var=new Select(forSelect);
        var.selectByValue("India");

        //v/s
        //Multi select
        WebElement forMultiSelect=driver.findElement(By.id("skills"));
        Select select=new Select(forMultiSelect);
        List<String> multiSelect=List.of("TypeScript", "Java");
        for (String multi: multiSelect)
            select.selectByVisibleText(multi);
    }

    public static void fourthSection()
    {
        // The page uses native HTML date/time inputs. Their calendar popup is browser UI,
        // so sendKeys enters dates in the displayed dd-MM-yyyy format.
        String date = "30-06-1994";
        String startDate = "01-10-2025";
        String endDate = "15-10-2025";

        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("dob")));
        dateField.clear();
        dateField.sendKeys(date);

        // The native time input accepts the displayed time through keyboard entry.
        WebElement timeField = wait.until(ExpectedConditions.elementToBeClickable(By.id("meetingTime")));
        timeField.clear();
        timeField.sendKeys("10:30AM");

        WebElement startDateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("startDate")));
        startDateField.clear();
        startDateField.sendKeys(startDate);

        WebElement endDateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("endDate")));
        endDateField.clear();
        endDateField.sendKeys(endDate);

        // Submit the values to the page's date-range validator and wait for its success message.
        wait.until(ExpectedConditions.elementToBeClickable(By.id("dateCheck"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[normalize-space()='Valid date range']")));
    }

    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://helloskillio.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,\"dialog-close-button dialog-lightbox-close-button\")]")));

        //remove pop up -> go to free resources -> click on Automation Practice
        driver.findElement(By.xpath("//a[contains(@class,\"dialog-close-button dialog-lightbox-close-button\")]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"Free Resources\")]")).click();
        driver.findElement(By.xpath("//li[contains(@id,\"menu-item-39525\")]/child::a")).click();
        //skillio1stSection();
       // thirdSection();
        fourthSection();
    }
}
