import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class clickElements {
    protected static final loginLogout loginLogout = new loginLogout();
    private final openLinkInNewWindow openLinkInNewWindow = new openLinkInNewWindow();
    private int i;
    private int n;
    private int sizeOfList;

    public void clickOnProductLikeButton(String url) throws InterruptedException {
        loginLogout.wd.get(url);
        List<WebElement> list = loginLogout.wd.findElements(By.xpath(".//*[@class='etsy-icon not-favorited position-absolute text-white']"));
        sizeOfList = list.size()-24;

        for (i = 0; i < sizeOfList; i++) {
            loginLogout.wd.findElement(By.xpath(".//*[@class='etsy-icon not-favorited position-absolute text-white']")).click();
            n=n+1;
        }
        System.out.println("Количество кликнутых елементов = "+n);

    }

    public void clickOnStoreLikeButton(String url) throws InterruptedException {
        // Store the current window handle
        String winHandleBefore = loginLogout.wd.getWindowHandle();
        loginLogout.wd.get(url);
        // Perform the click operation that opens new window
        WebElement link = loginLogout.wd.findElement(By.xpath(".//*[@class=' display-inline-block listing-link\n']"));
        openLinkInNewWindow.openInNewWindow(link.getAttribute("href"));
        // Switch to new window opened
        for(String winHandle : loginLogout.wd.getWindowHandles()){
            loginLogout.wd.switchTo().window(winHandle);
        }
        // Perform the actions on new window
        loginLogout.wd.findElement(By.xpath(".//*[@class='btn btn-secondary favorite-shop-action unfavorited-button btn-small text-gray-lighter pt-xs-1']")).click();

        Thread.sleep(5000);
        /*loginLogout.wd.close();*/
        loginLogout.wd.switchTo().defaultContent();


        /*List<WebElement> list = loginLogout.wd.findElements(By.xpath(".//*[@class='etsy-icon not-favorited position-absolute text-white']"));
        sizeOfList = list.size()-24;

        for (i = 0; i < sizeOfList; i++) {
            loginLogout.wd.findElement(By.xpath(".//*[@class='etsy-icon not-favorited position-absolute text-white']")).click();
            n=n+1;
        }
        System.out.println("Количество кликнутых елементов = "+n);*/

    }

    public void clickExperement(String url) throws InterruptedException
    {
        // Store the current window handle
        String winHandleBefore = loginLogout.wd.getWindowHandle();
        loginLogout.wd.get(url);
        // Perform the click operation that opens new window
        WebElement link = loginLogout.wd.findElement(By.xpath(".//*[@class=' display-inline-block listing-link\n']"));
        openLinkInNewWindow.openInNewWindow(link.getAttribute("href"));
        // Switch to new window opened
        for(String winHandle : loginLogout.wd.getWindowHandles()){
            loginLogout.wd.switchTo().window(winHandle);
        }
        // Perform the actions on new window
        Thread.sleep(500);
        loginLogout.wd.findElement(By.id("search-query")).click();
      //  loginLogout.wd.findElement(By.xpath(".//*[@class='search-input-wrapper text-field-wrapper']")).clear();
        loginLogout.wd.findElement(By.id("search-query")).sendKeys("123");
        Thread.sleep(5000);

       // loginLogout.wd.findElement(By.xpath(".//*[@class='button-fave-container display-inline-block']")).click();

// Close the new window, if that window no more required
        loginLogout.wd.close();

// Switch back to original browser (first window)

// Continue with original browser (first window)


    }


    public openLinkInNewWindow getOpenLinkInNewWindow() {
        return openLinkInNewWindow;
    }
}
