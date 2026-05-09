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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hybridriven {

    WebDriver driver = null;

    @DataProvider(name = "tops")
    public static Object[][] readExcel() throws InvalidFormatException, IOException {

        String filepath = "C:\\Users\\Tops\\Downloads\\Demoblaze.xlsx";
        File file = new File(filepath);

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Hybriddriven");

        int nrows = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[nrows][];

        for (int i = 0; i < nrows; i++) {

            Row row = sheet.getRow(i);
            int ncols = row.getPhysicalNumberOfCells();

            data[i] = new Object[ncols];

            for (int j = 0; j < ncols; j++) {
                Cell cell = row.getCell(j);
                cell.setCellType(CellType.STRING);
                data[i][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "tops")
    public void test(String keyword, String data)
            throws InterruptedException, InvalidFormatException, IOException {

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        if (keyword.equalsIgnoreCase("open browser")) {
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }

        else if (keyword.equalsIgnoreCase("enter url")) {
            driver.get("https://demo.automationtesting.in/SignIn.html");
            Thread.sleep(2000);
        }
        else if (keyword.equalsIgnoreCase("enter email")) {
            driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(data);
            Thread.sleep(2000);
        }
        else if (keyword.equalsIgnoreCase("enter password")) {
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data);
            Thread.sleep(2000);
        }

        else if (keyword.equalsIgnoreCase("click login")) {
            driver.findElement(By.id("enterbtn")).click();
            Thread.sleep(2000);

            System.out.println("Login attempted");

            
            if (driver.getCurrentUrl().contains("Register")) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");

                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File dest = new File("D:\\screenshot\\login_fail.png");
                FileUtils.copyFile(src, dest);

                Assert.fail("Login failed");
            }
        }

        else if (keyword.equalsIgnoreCase("close browser")) {
            driver.quit();
        }
    }
}