package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Email_regester {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://accounts.google.com/signup");
		Thread.sleep(1500);
		driver.findElement(By.id("firstName")).sendKeys("Arun");
		Thread.sleep(1500);
		driver.findElement(By.id("lastName")).sendKeys("Bhatu");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("#collectNameNext > div > button > span")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[1]/div")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[2]/ul/li[6]")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("day")).sendKeys("14");
		Thread.sleep(1500);
		driver.findElement(By.id("year")).sendKeys("2005");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"gender\"]/div/div[1]/div")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"gender\"]/div/div[2]/ul/li[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("usernameRadio")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("67a@#94856");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("67a@#94856");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[3]/div/div/div/div/button/span")).click();
	}

}
