package admin;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Keyworddriven {

    WebDriver driver;

    @Test
    public void runKeywords() throws Exception {

        String filepath = "C:\\Users\\Tops\\Downloads\\Demoblaze.xlsx";
        File file = new File(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("keyworddriven");
        int rows = sheet.getPhysicalNumberOfRows();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        for (int i = 0; i < rows; i++) {

            String keyword = sheet.getRow(i)
                    .getCell(0)
                    .getStringCellValue()
                    .trim();
            if (keyword.equalsIgnoreCase("open")) {
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
            }
            else if (keyword.equalsIgnoreCase("enter url")) {
                driver.get("https://demo.automationtesting.in/SignIn.html");
            }

            else if (keyword.equalsIgnoreCase("enter email")) {
                driver.findElement(By.xpath("//input[@placeholder='E mail']"))
                        .sendKeys("pratik87@gmail.com");
            }
            else if (keyword.equalsIgnoreCase("enter password")) {
                driver.findElement(By.xpath("//input[@placeholder='Password']"))
                        .sendKeys("8544123");
            }
            else if (keyword.equalsIgnoreCase("click login")) {
                driver.findElement(By.id("enterbtn")).click();

                if (driver.getCurrentUrl().contains("Index")) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                    Assert.fail("Login failed");
                }
            }
            else if (keyword.equalsIgnoreCase("close browser")) {
                driver.quit();
            }
        }
        workbook.close();
    }
}