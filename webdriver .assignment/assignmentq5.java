package discipline;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assignmentq5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@name='radiooptions']"));
		
		for (int i = 0;i <radiobutton.size(); i++){
			
			radiobutton.get(i).click();
			Thread.sleep(2000);
		}
	}

}
