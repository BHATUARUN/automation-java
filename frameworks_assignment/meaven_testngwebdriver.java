package appiumtesting.apptesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class meaven_testngwebdriver {
	
    WebDriver driver;
    @BeforeTest
    public void setup() throws InterruptedException {
        driver = myconnection.connect("https://www.facebook.com/");
        Thread.sleep(1500);
        System.out.println(driver.getTitle());
    }
    @Test
    public void gb() throws InterruptedException {
        driver.findElement(By.cssSelector("#_R_64mkqsr9pb6amH1_")).sendKeys("rohit34@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#_R_66mkqsr9pb6amH1_")).sendKeys("574524");
        Thread.sleep(1500);
    }
    @AfterTest
    public void finish() {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]")).click();
        System.out.println("champ");
        driver.quit();
    }
}
