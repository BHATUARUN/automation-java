package projects.demoblazetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signup {

    WebDriver driver;

    public signup(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSignupUsername(String username) throws Exception {
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("sign-username")).clear();
        driver.findElement(By.id("sign-username")).sendKeys(username);
    }

    public void enterSignupPassword(String password) {
        driver.findElement(By.id("sign-password")).clear();
        driver.findElement(By.id("sign-password")).sendKeys(password);
    }

    public void clickSignup() throws Exception {
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);

        try {
            driver.switchTo().alert().accept();
            System.out.println("Signup done / alert handled");
        } catch (Exception e) {
            System.out.println("Signup completed");
        }
    }
}