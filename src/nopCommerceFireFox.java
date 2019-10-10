import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class nopCommerceFireFox {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver;
        driver = new FirefoxDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

        // find elements for login link

        WebElement loginlink =  driver.findElement(By.linkText("Log in"));
        loginlink.click();

        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("vijaypatel@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("abc123");

        WebElement loginbtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginbtn.click();




        //driver.quit();




    }
}
