package discipline;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingmentq3 {
    public static void main(String[] args) throws InterruptedException {

        

        WebDriver driver = myconnection.connect("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

       
        WebDriver driver1 = myconnection.connect("https://the-internet.herokuapp.com/windows");
        Thread.sleep(2000);
        driver1.findElement(By.linkText("Click Here")).click();

        for(String w : driver1.getWindowHandles()) {
            driver1.switchTo().window(w);
        }

       
        driver1.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        driver1.quit();
    }
}