package SELENIUMPROGRAMS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestGeoLocation {
    public static void main(String[] args) {
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--start-maximized");
        RemoteWebDriver driver=new ChromeDriver(opt);
        driver.get("https://www.speedtest.net/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,\"ot-sdk-twelve ot-sdk-columns\")]/following::button")));
        driver.findElement(By.xpath("//div[contains(@class,\"ot-sdk-twelve ot-sdk-columns\")]/following::button")).click();

        System.out.println("end arrived");
        driver.quit();
        }
}
