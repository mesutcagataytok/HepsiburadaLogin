import driverSetup.BaseClass;
import pageObject.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @org.testng.annotations.Test
    public void IsHepsiBuradaPageCorrect(){
        BaseClass.SetUpBrowser();
        Assert.assertEquals(LandingPage.GetPageLogoLabel().getAttribute("title"),"Hepsiburada");
    }
}
