package assignmentwebdriver;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.myconnection;

public class assignmentq10 {
	//private static Alert alret2;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert alert =   driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert.accept();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert.accept();
		
		
		
	}
}


