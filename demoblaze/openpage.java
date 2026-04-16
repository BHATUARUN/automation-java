package projects.demoblazetest;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class openpage {

    WebDriver driver;

    @Test
    public void test() throws Exception {

        String filepath = "C:\\Users\\Tops\\Downloads\\Demoblaze.xlsx";
        File file = new File(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("login1");

        int rows = sheet.getPhysicalNumberOfRows();

        loginpage login = null;

        for (int i = 0; i < rows; i++) {

            Row row = sheet.getRow(i);
            if (row == null) continue;

            String keyword = row.getCell(0).toString().trim().toLowerCase();
            String data = row.getCell(1).toString().trim();

            System.out.println("Step: " + keyword + " -> " + data);

            if (keyword.equals("enter url")) {

                driver = myconnection.connect(data);
                login = new loginpage(driver);
                Thread.sleep(2000);
            }

            else if (keyword.equals("enter username")) {
                login.enterUsername(data);
            }

            else if (keyword.equals("enter password")) {
                login.enterPassword(data);
            }

            else if (keyword.equals("click login")) {
                login.clickLogin();
            }

            else if (keyword.equals("click logout")) {
                login.clickLogout();
            }

            else if (keyword.equals("close browser")) {
                driver.quit();
                System.out.println("Browser closed");
            }

            Thread.sleep(1500);
        }

        workbook.close();
    }
}