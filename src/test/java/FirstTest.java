import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ScorePage;
import utils.Config;
import utils.DriverFactory;


public class FirstTest {

    private WebDriver driver;
    DriverFactory driverFactory;


    @BeforeMethod
    public void setUp(){
        driverFactory=new DriverFactory();
        driver=driverFactory.getDriver();
    }

    @Test
    public void getScore(){
        driver.get(Config.URL);
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(homePage.getHeadingText(),"FEATURED MATCHES");
        ScorePage scorePage=homePage.clickMatchlink();
        driver = scorePage.printText();
    }

    @AfterTest
    public void tearDown(){
        driverFactory.closeDriver();
    }
}
