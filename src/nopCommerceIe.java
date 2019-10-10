import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class nopCommerceIe {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login";
        System.setProperty("webdriver.ie.driver","drivers/MicrosoftWebDriver.exe");

        WebDriver driver;
        driver = new InternetExplorerDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // fine elements for login link

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement usename = driver.findElement(By.id("Email"));
        usename.sendKeys("vijaypatel@gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("abc123");

        WebElement loginkbtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginkbtn.click();

       // driver.quit();

    }

}
