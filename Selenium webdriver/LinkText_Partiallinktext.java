package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.webdriver2test;

public class assingmentq1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Checkboxes")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Chall")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Drag")).click();
		Thread.sleep(2000);
		
	}

}
