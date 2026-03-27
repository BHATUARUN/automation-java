package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentq6 {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = myconnection.connect("https://demo.automationtesting.in/Register.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        
        driver.findElement(By.id("Skills")).click();
        Select skills = new Select (driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("C");
        Thread.sleep(2000);
        skills.selectByVisibleText("C++");
        Thread.sleep(2000);
        driver.quit();
      
		
	}

}
