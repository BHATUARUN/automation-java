package assignmentwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.myconnection;

public class assugnmentq11 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = myconnection.connect("https://qavbox.github.io/demo/webtable/");
		Thread.sleep(2000);
		  List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total hyperlinks on page: " + links.size());

	        for (int i = 0; i < links.size(); i++) 
	        {
	            System.out.println("Link " + (i + 1) + " Text: " + links.get(i).getText());
	            System.out.println("Link " + (i + 1) + " URL : " + links.get(i).getAttribute("href"));
	            System.out.println("-----------------------------------");
	        }

	        driver.quit();
	    }
	}


