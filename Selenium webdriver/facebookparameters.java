package webdriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)

public class facebookparameters {

	String email;
	String password;
	public facebookparameters(String email, String password) {

		this.email = email;
		this.password = password;
	}
	@Parameters
	public static Collection<Object[]> data() {

		return Arrays.asList(new Object[][] {

			{"rahul86@gmail.com", "4567"},
			{"ajay76@gmail.com", "1472"},
			{"akshay90@gmail.com", "5878"}

		});
	}

	
	@Test
	public void loginTest() throws Exception {

		
		WebDriver driver = myconnection.connect("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		System.out.println("login ho gaya");
	}
}