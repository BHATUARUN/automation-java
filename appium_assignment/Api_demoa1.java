package appiumtesting.Assignment_appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Api_demoa1 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		AndroidDriver<MobileElement> driver =
		new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub/"), cap);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +".scrollIntoView(text(\"App\"));");
		WebElement app = driver.findElement(By.xpath("//*[@text='App']"));
		TouchAction action = new TouchAction(driver);
		action.longPress(
				LongPressOptions.longPressOptions().withElement(ElementOption.element(app)).withDuration(Duration.ofSeconds(2))).release().perform();	
		System.out.println("Long press gaya");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator(	"new UiScrollable(new UiSelector().scrollable(true))" +".scrollIntoView(text(\"Views\"));"	);
		
		
	}
}