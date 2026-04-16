package projects.demoblazetest;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class openpage2 {

    WebDriver driver;
    signup signup;   

    @Test
    public void test() throws Exception {

        String filepath = "C:\\Users\\Tops\\Downloads\\Demoblaze.xlsx";
        File file = new File(filepath);

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("signup2");

        int rows = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rows; i++) {

            Row row = sheet.getRow(i);
            if (row == null) continue;

            String keyword = row.getCell(0).toString().trim().toLowerCase();
            String data = row.getCell(1).toString().trim();

            System.out.println("Step: " + keyword + " -> " + data);

            if (keyword.equals("enter url")) {

                driver = myconnection.connect(data);
                signup = new signup(driver);   
                Thread.sleep(2000);
                
            }

            else if (keyword.equals("enter sign username")) {
                signup.enterSignupUsername(data);
            }

            else if (keyword.equals("enter sign password")) {
                signup.enterSignupPassword(data);
            }

            else if (keyword.equals("click signup")) {
                signup.clickSignup();
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