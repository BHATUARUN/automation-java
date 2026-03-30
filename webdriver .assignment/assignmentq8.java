package automationjava.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class assignmentq8{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = myconnection.connect("https://www.amazon.in/");
		Thread.sleep(2000);
		  WebElement menu =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[1]/div/a"));
		  Actions act = new Actions(driver);
		  act.moveToElement(menu).perform();
		  Thread.sleep(2000);
		  WebElement menu2 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[5]/div/a"));
		  act.moveToElement(menu2).perform();
		  Thread.sleep(2000);
		  WebElement menu3 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[8]/div/a"));
		  act.moveToElement(menu2).perform();
		  Thread.sleep(2000);
		  WebElement menu4 = driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]/a/span"));
		  act.moveToElement(menu4).perform();
		  Thread.sleep(2000);
		  WebElement menu5 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[11]/div/a"));
		  act.moveToElement(menu5).perform();
		  Thread.sleep(2000);
		  
		  driver.quit();
		  
	}
}