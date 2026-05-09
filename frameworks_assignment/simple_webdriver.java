package appiumtesting.apptesting;

import org.openqa.selenium.WebDriver;

public class simple_webdriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://facebook.com");
		Thread.sleep(1500);
		System.out.println("facebook is open");
		driver.quit();
	}
	

}
