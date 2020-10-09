package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.pageElements.ScorePageElements;

public class ScorePage extends ScorePageElements {

    private WebDriver driver;



    ScorePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver printText(){
        System.out.println(text.getText());
        return driver;
    }

}
