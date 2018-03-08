import org.testng.annotations.Test;

public class testsForEtsyStore extends hellpers {


    @Test
    public void clickLikeButton() throws InterruptedException {
        clickElements.loginLogout.login();
        /*clickOnProductLikeButton("https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys");
        clickOnProductLikeButton("https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?explicit=1&page=4&use_mmx=1");
        clickOnProductLikeButton("https://www.etsy.com/c/home-and-living/home-decor/wall-decor/wall-decals-and-murals?ref=catcard-1028-469357506&explicit=1");*/
        int k;

        for (k=35;k<37;k++) {
            clickElements.clickOnProductLikeButton("https://www.etsy.com/c/accessories/keychains-and-lanyards/keychains?explicit=1&page="+k+"&use_mmx=1");
        }


    }

    
}
