package admin;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Datadriven {

    WebDriver driver;

    private String[][] readExcel() throws InvalidFormatException, IOException {

        String filepath = "C:\\Users\\Tops\\Downloads\\Demoblaze.xlsx";
        File file = new File(filepath);

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Datadriven");

        int nrows = sheet.getPhysicalNumberOfRows();
        String[][] data = new String[nrows][2];

        for (int i = 0; i < nrows; i++) {

            Row row = sheet.getRow(i);

            Cell emailCell = row.getCell(0);
            Cell passCell = row.getCell(1);

            emailCell.setCellType(CellType.STRING);
            passCell.setCellType(CellType.STRING);

            data[i][0] = emailCell.getStringCellValue();
            data[i][1] = passCell.getStringCellValue();
        }

        workbook.close();
        return data;
    }

    @Test
    public void test() throws Exception {

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");

        String[][] data = readExcel();

        int index = 1;

        for (int i = 0; i < data.length; i++) {
            driver = new ChromeDriver(options);
            driver.get("https://demo.automationtesting.in/SignIn.html");
            Thread.sleep(2000);         
            driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(data[i][0]); 
            Thread.sleep(1500);
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data[i][1]);
            Thread.sleep(1500);
            driver.findElement(By.id("enterbtn")).click();
            Thread.sleep(3000);          
            
            if (driver.getCurrentUrl().contains("Index")) {
                System.out.println("Login Passed for: " + data[i][0]);
            } else {
                System.out.println("Login Failed for: " + data[i][0]);
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File dest = new File("C:\\screenshot\\fail_" + index + ".png");
                FileUtils.copyFile(src, dest);
                index++;
                Assert.fail("Invalid login for: " + data[i][0]);
            }
            Thread.sleep(2000);
            driver.close();
        }
    }
}