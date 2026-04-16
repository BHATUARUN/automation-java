package projects.demoblazetest;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class openpage3 {

    WebDriver driver;
    cart cart;

    @Test
    public void test() throws Exception {

        String filepath = "C:\\Users\\Tops\\Downloads\\Demoblaze.xlsx";
        File file = new File(filepath);

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("cart");

        int rows = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rows; i++) {

            Row row = sheet.getRow(i);
            if (row == null) continue;

            String keyword = row.getCell(0).toString().trim().toLowerCase();
            String data = (row.getCell(1) == null) ? "" : row.getCell(1).toString().trim();

            System.out.println("Step: " + keyword + " -> " + data);

            try {

                if (keyword.equals("enter url")) {
                    driver = myconnection.connect(data);
                    cart = new cart(driver);
                }

                else if (keyword.equals("select product")) {
                    cart.selectProduct(data);
                }

                else if (keyword.equals("add to cart")) {
                    cart.addToCart();
                }

                else if (keyword.equals("go to cart")) {
                    cart.goToCart();
                }

                else if (keyword.equals("place order")) {
                    cart.placeOrder();
                }

                else if (keyword.equals("name")) {
                    cart.enterName(data);
                }

                else if (keyword.equals("country")) {
                    cart.enterCountry(data);
                }

                else if (keyword.equals("city")) {
                    cart.enterCity(data);
                }

                else if (keyword.equals("card")) {
                    cart.enterCard(data);
                }

                else if (keyword.equals("month")) {
                    cart.enterMonth(data);
                }

                else if (keyword.equals("year")) {
                    cart.enterYear(data);
                }

                else if (keyword.equals("purchase")) {
                    cart.purchase();
                }

                else if (keyword.equals("confirm")) {
                    cart.confirm();
                }

                else if (keyword.equals("close browser")) {
                    driver.quit();
                }

            } catch (Exception e) {
                System.out.println("Error in step: " + keyword);
                e.printStackTrace();
            }

            Thread.sleep(800);
        }

        workbook.close();
    }
}