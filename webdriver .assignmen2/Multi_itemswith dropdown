package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmentq2 {
	private static WebElement country;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		WebElement dropdown = driver.findElement(By.id("country"));
		Select select =  new Select(dropdown);
		select.selectByVisibleText("Germany");
		Thread.sleep(2000);
		select.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		select.selectByVisibleText("France");
		Thread.sleep(2000);
		select.selectByVisibleText("Japan");
		Thread.sleep(2000);
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		select.selectByVisibleText("Canada");
		Thread.sleep(2000);
		
	   
		
	}

}
