
package appiumtesting.Assignment_appium;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class general_store1 {
    public static void main(String[] args) throws Exception {

        DesiredCapabilities Cap = new DesiredCapabilities();

        Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        Cap.setCapability("deviceName", "Android Emulator");
        Cap.setCapability("appPackage", "com.androidsample.generalstore");
        Cap.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");

        AndroidDriver<MobileElement> driver =  new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), Cap);             
        Thread.sleep(3000);

 
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");

        driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
        Thread.sleep(1500);

       
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Arun");
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(3000);
        System.out.println("App chal gaya");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(text(\"Jordan 6 Rings\"));");
      

        System.out.println("Scroll ho rha he");

        driver.quit();
    }
}