import org.openqa.selenium.By;


public class HomePage {

    static By TempUitInHome = By.id("com.info.weather.forecast:id/tv_current_temper_unit");
    static By NumbOfHoursPrediction = By.xpath("//*[@resource-id='com.info.weather.forecast:id/tv_hour_item']");
    static By RainIcons = By.xpath("//*[@resource-id='com.info.weather.forecast:id/iv_rain_chance']");
    static By HumidityIcons = By.xpath("//*[@resource-id='com.info.weather.forecast:id/tv_humidity']");

}
