package webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebooklogintestng {
     @Test
     public void login() throws InterruptedException {
    	 WebDriver driver = myconnection.connect("https://www.facebook.com/");
    	 Thread.sleep(1500);
    	 driver.findElement(By.cssSelector("#_R_64mkqsr9pb6amH1_")).sendKeys("ajay89@gmail.com");
    	 Thread.sleep(1500);
    	 driver.findElement(By.cssSelector("#_R_66mkqsr9pb6amH1_")).sendKeys("978698");
    	 Thread.sleep(1500);
    	 driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div/span/span")).click();
    	 Thread.sleep(1000);
    	 driver.quit();
    			 
    			 
    			 
    			 
    			 
    			 
    	 
     }

}
