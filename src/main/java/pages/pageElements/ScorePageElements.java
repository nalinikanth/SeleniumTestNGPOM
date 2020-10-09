package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebElementUtils;

public class ScorePageElements extends WebElementUtils {

    @FindBy(css=".cb-font-16.cb-col-rt")
    protected WebElement text;

}
