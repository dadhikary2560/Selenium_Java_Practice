import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
    }
}
