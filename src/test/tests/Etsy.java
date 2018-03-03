import org.testng.annotations.Test;

public class Etsy extends Hellpers{


    @Test
    public void Etsy() throws InterruptedException {
        login();
        /*likeProduct("https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys");
        likeProduct("https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?explicit=1&page=4&use_mmx=1");
        likeProduct("https://www.etsy.com/c/home-and-living/home-decor/wall-decor/wall-decals-and-murals?ref=catcard-1028-469357506&explicit=1");*/

        likeProduct("https://www.etsy.com/c/accessories/keychains-and-lanyards/keychains?explicit=1&page=10&use_mmx=1");



    }

    
}
