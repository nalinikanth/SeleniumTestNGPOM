package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private WebDriver driver;
    private WebDriverManager webDriverManager;
    public static String browserName=Config.BROWSER;


    public DriverFactory(){
        this.driver=getDriver();
    }


    public WebDriver createDriver() {

        if (browserName.equalsIgnoreCase("chrome")) {
            webDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-cache");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public  WebDriver getDriver () {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }


    public void closeDriver () {
        driver.close();
        driver.quit();
    }
}
