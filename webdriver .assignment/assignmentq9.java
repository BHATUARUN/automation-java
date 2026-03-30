package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class assignmentq9 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = myconnection.connect("https://www.google.com/?zx=1774874545010&no_sw_cr=1");
		
		Thread.sleep(2000);
		
		WebElement box = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		Actions act = new Actions(driver);
		act.click(box).sendKeys("vikings").perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DELETE).perform();
		Thread.sleep(2000);
		act.click(box).sendKeys("kingragnar").sendKeys(Keys.ENTER).perform();
	}
}