package projects.demoblazetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class cart {

    WebDriver driver;

    public cart(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct(String product) {
        driver.findElement(By.linkText(product)).click();
    }

    public void addToCart() {

        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();
    }

    public void goToCart() {
        driver.findElement(By.id("cartur")).click();
    }

    public void placeOrder() {
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
    }

    public void enterName(String name) {
        driver.findElement(By.id("name")).sendKeys(name);
    }

    public void enterCountry(String country) {
        driver.findElement(By.id("country")).sendKeys(country);
    }

    public void enterCity(String city) {
        driver.findElement(By.id("city")).sendKeys(city);
    }

    public void enterCard(String card) {
        driver.findElement(By.id("card")).sendKeys(card);
    }

    public void enterMonth(String month) {
        driver.findElement(By.id("month")).sendKeys(month);
    }

    public void enterYear(String year) {
        driver.findElement(By.id("year")).sendKeys(year);
    }

    public void purchase() {
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
    }

    public void confirm() {
        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }
}