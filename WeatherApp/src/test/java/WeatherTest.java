import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class WeatherTest {

    AppiumDriver driver;
    WebDriverWait wait ;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.1.0");
        caps.setCapability("deviceName", "Pixel6_API27");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/com.info.weather.forecast.25.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver,20 );

    }

    @Test
    public void testWeatherApp() throws InterruptedException {

        driver.findElement(DashboardPage.TempList).click();
        driver.findElement(DashboardPage.FUnitTemp).click();
        driver.findElement(DashboardPage.TimeFormatList).click();
        driver.findElement(DashboardPage._12Hour).click();
        driver.findElement(DashboardPage.DoneBTN).click();
        Thread.sleep(5000);
        driver.findElement(DashboardPage.GotItBTN).click();
        Thread.sleep(5000);
        driver.findElement(DashboardPage.GotItBTN2).click();
        Thread.sleep(5000);
        new AndroidTouchAction(driver).tap(ElementOption.element(driver.findElement(DashboardPage.AllowLocationBTN))).perform();
        Thread.sleep(5000);
        new AndroidTouchAction(driver).tap(ElementOption.element(driver.findElement(DashboardPage.AllowPermBTN))).perform();
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(HomePage.TempUitInHome).getText().contains("F"));
        Assert.assertEquals(driver.findElements(HomePage.NumbOfHoursPrediction).size(),6);
        Assert.assertEquals(driver.findElements(HomePage.RainIcons).size(), 6);
        Assert.assertEquals(driver.findElements(HomePage.HumidityIcons).size(), 6);
    }

    @AfterTest
    public void teardown() {
        driver.quit();

    }
}


