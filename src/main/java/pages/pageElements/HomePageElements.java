package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebElementUtils;

public class HomePageElements extends WebElementUtils {

    @FindBy(css="h4.cb-mdl-hdr")
    protected WebElement title;

    @FindBy(id="live-scores-link")
    protected WebElement link;
}
