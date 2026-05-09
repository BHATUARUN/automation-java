package appiumtesting.apptesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class meaven_junitwebdriver {

    WebDriver driver;

    @Before
    public void login() throws InterruptedException {
        driver = myconnection.connect("https://www.facebook.com/");
        Thread.sleep(1500);
    }

    @Test
    public void fb() {
        System.out.println(driver.getTitle());
    }

    @After
    public void hj() throws InterruptedException {
        driver.findElement(By.cssSelector("#_R_64mkqsr9pb6amH1_")).sendKeys("ayush89@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"_R_66mkqsr9pb6amH1_\"]")).sendKeys("356598");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]")).click();
        Thread.sleep(1500);
        driver.quit();
        
    }
}