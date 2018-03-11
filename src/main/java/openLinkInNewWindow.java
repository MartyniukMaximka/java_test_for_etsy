import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class openLinkInNewWindow {


    public void openInNewWindow(String link) {
        ((JavascriptExecutor) clickElements.loginLogout.wd).executeScript("window.open(arguments[0])", link);
    }
}
