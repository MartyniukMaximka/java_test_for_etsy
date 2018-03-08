import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class startStop {

    protected final clickElements clickElements = new clickElements();

    @BeforeMethod
    public void setUp() throws Exception {
        clickElements.loginLogout.wd = new FirefoxDriver();
        clickElements.loginLogout.wd.manage().deleteAllCookies();
        clickElements.loginLogout.wd.manage().window().maximize();
        clickElements.loginLogout.wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    public loginLogout getLoginLogout() {
        return clickElements.loginLogout;
    }

    public clickElements getClickElements() {
        return clickElements;
    }
}
