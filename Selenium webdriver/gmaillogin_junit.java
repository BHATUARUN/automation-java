package webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin_junit {

    WebDriver driver;

    @Before
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://accounts.google.com/");
    }

    @Test
    public void loginTest() throws Exception {

        
        driver.findElement(By.id("identifierId")).sendKeys("kishan09@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);      
        driver.findElement(By.name("Passwd")).sendKeys("yourpassword");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);
        System.out.println("Gmail Login Successful");
    }

    @After
    public void closeBrowser() {

        driver.quit();

        System.out.println("perfect");
    }
}