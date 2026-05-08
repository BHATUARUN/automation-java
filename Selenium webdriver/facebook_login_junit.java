package timless;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebook_login_junit {

    @Test 
    public void loginTest() throws InterruptedException {

        WebDriver driver = myconnection.connect("https://www.facebook.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"_R_64mkqsr9pb6amH1_\"]")).sendKeys("anil67@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"_R_66mkqsr9pb6amH1_\"]")).sendKeys("789456");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")) .click();
        Thread.sleep(1500);
        System.out.println("login successfull");
    }
}