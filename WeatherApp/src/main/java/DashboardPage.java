import org.openqa.selenium.By;

public class DashboardPage {
    static By FUnitTemp = By.xpath("(//*[@text='F'])[1]");
    static By TempList = By.id("com.info.weather.forecast:id/iv_temp_dropdown");
    static By DoneBTN = By.id("com.info.weather.forecast:id/tv_button_done");
    static By GotItBTN = By.id("com.info.weather.forecast:id/ll_got_it");

    static By GotItBTN2 = By.xpath("//android.view.ViewGroup");
    static By AllowLocationBTN = By.id("com.android.packageinstaller:id/permission_allow_button");
    static By AllowPermBTN = By.id("android:id/button2");

    static By TimeFormatList = By.id("com.info.weather.forecast:id/iv_timeformat_dropdown");
    static By _12Hour = By.xpath("//*[@text='12 Hour']");

}