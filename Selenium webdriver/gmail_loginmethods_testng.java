package webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gmail_loginmethods_testng {

	WebDriver driver;
	
	@Before
	public void start() {
		driver = myconnection.connect("https://accounts.google.com/");
	}

	@Test
	public void login() throws InterruptedException {

		driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Passwd")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		Thread.sleep(5000);
	}
	@After
	public void close() {

		System.out.println("login done");
	}
}