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
        loginLogout.wd.get(url);
        WebElement link = loginLogout.wd.findElement(By.xpath(".//*[@class=' display-inline-block listing-link\n']"));
        openLinkInNewWindow.openInNewWindow(link.getAttribute("href"));
        loginLogout.wd.findElement(By.xpath(".//*[@class='button-fave-container display-inline-block']")).click();
        /*loginLogout.wd.findElement(By.xpath(".//*[@class='ss-etsy ss-icon ss-heartempty']")).click();*/


        Thread.sleep(5000);



        /*List<WebElement> list = loginLogout.wd.findElements(By.xpath(".//*[@class='etsy-icon not-favorited position-absolute text-white']"));
        sizeOfList = list.size()-24;

        for (i = 0; i < sizeOfList; i++) {
            loginLogout.wd.findElement(By.xpath(".//*[@class='etsy-icon not-favorited position-absolute text-white']")).click();
            n=n+1;
        }
        System.out.println("Количество кликнутых елементов = "+n);*/

    }


    public openLinkInNewWindow getOpenLinkInNewWindow() {
        return openLinkInNewWindow;
    }
}
