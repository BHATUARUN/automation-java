package projects.demoblazetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class myconnection
{
	static WebDriver driver;
	
	public static WebDriver connect(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver1\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();      
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}