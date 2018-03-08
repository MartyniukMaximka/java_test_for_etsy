import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginLogout {


    FirefoxDriver wd;

    public void login() throws InterruptedException {
        wd.get("https://www.etsy.com/");
        wd.findElement(By.xpath(".//*[@id='sign-in']")).click();
        WebDriverWait wait = new WebDriverWait(wd, 100);
        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("username-existing")));
        wd.findElement(By.id("username-existing")).click();
        wd.findElement(By.id("username-existing")).clear();
        wd.findElement(By.id("username-existing")).sendKeys("olgastarko");
        wd.findElement(By.id("password-existing")).click();
        wd.findElement(By.id("password-existing")).clear();
        wd.findElement(By.id("password-existing")).sendKeys("olgastarko123");
        wd.findElement(By.id("signin-button")).click();
        WebDriverWait wait1 = new WebDriverWait(wd, 100);
        WebElement sucksesLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("gnav-account-favorites-description")));
    }
}
