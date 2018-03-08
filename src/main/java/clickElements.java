import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class clickElements {
    protected final loginLogout loginLogout = new loginLogout();
    public int i;
    public int n;
    public int sizeOfList;

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
}
