import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class Hellpers {
    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public void likeProduct(String url) {
        wd.get(url);
        List<WebElement> list = wd.findElements(By.xpath(".//*[@class='etsy-icon not-favorited position-absolute text-white']"));

        for (int i = 1; i < list.size(); i++) {
            list.get(i).click();
        }
    }

    public void login() {
        wd.get("https://www.etsy.com/");
        wd.findElement(By.xpath(".//*[@id='sign-in']")).click();
        WebDriverWait wait = new WebDriverWait(wd, 10);
        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("username-existing")));
        wd.findElement(By.id("username-existing")).click();
        wd.findElement(By.id("username-existing")).clear();
        wd.findElement(By.id("username-existing")).sendKeys("olgastarko");
        wd.findElement(By.id("password-existing")).click();
        wd.findElement(By.id("password-existing")).clear();
        wd.findElement(By.id("password-existing")).sendKeys("olgastarko123");
        wd.findElement(By.id("signin-button")).click();
        WebDriverWait wait1 = new WebDriverWait(wd, 10);
        WebElement sucksesLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("gnav-account-favorites-description")));
    }
}
