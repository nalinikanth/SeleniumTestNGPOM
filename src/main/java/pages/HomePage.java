package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.pageElements.HomePageElements;

public class HomePage extends HomePageElements {

    private WebDriver driver;



    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public ScorePage clickMatchlink(){
        click(driver, link);
        return new ScorePage(driver);


    }

    public String getHeadingText(){
        return title.getText();
    }

}
