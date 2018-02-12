import org.testng.annotations.Test;

public class Etsy extends Hellpers{


    @Test
    public void Etsy()
    {
        login();
        likeProduct("https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys");
        /*likeProduct("https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?explicit=1&page=2&use_mmx=1");*/

    }

    
}
