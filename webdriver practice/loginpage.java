package projects.demoblazetest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

    WebDriver driver;

    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) throws Exception {
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).clear();
        driver.findElement(By.id("loginusername")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("loginpassword")).clear();
        driver.findElement(By.id("loginpassword")).sendKeys(password);
    }

    public void clickLogin() throws Exception {
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(2000);

        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert: " + alert.getText());
            alert.accept();

            driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[1]/button/span")).click();

        } catch (Exception e) {
            System.out.println("Login successful");
        }
    }

    public void clickLogout() throws Exception {
        Thread.sleep(2000);
        driver.findElement(By.id("logout2")).click();
        System.out.println("Logged out");
    }
}