package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class fb_testng_parameters {
    @DataProvider(name = "fbdata")
    public Object[][] data() {
        return new Object[][] {
            {"rahul@gmail.com", "1234"},
            {"ajay@gmail.com", "5678"},
            {"akshay@gmail.com", "9999"}
        };
    }
    @Test(dataProvider = "fbdata")
    
    public void login(String email, String password) throws Exception {
        WebDriver driver =myconnection.connect("https://www.facebook.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailBox =wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//input[@name='email' or @id='email']")));
        emailBox.clear();
        emailBox.sendKeys(email);  
        WebElement passBox =driver.findElement(By.xpath("//input[@name='pass']"));
        passBox.clear();
        passBox.sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")).click();
        System.out.println("Login Attempt Done for: " + email);
        Thread.sleep(5000);
        driver.quit();
    }
}           