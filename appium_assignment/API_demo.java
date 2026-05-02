package appiumtesting.Assignment_appium;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class API_demo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

		cap.setCapability("appPackage", "io.appium.android.apis");

		cap.setCapability("appActivity", ".ApiDemos");

		AndroidDriver<MobileElement> driver =
		        new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), cap);
		Thread.sleep(2000);
				
	}

}
