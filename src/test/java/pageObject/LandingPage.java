package pageObject;
import driverSetup.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LandingPage extends BaseClass{

    public static WebElement element;
    static Logger log = Logger.getLogger(LandingPage.class.getName());

    public static WebElement GetPageLogoLabel(){
        element = driver.findElement(By.xpath("//div[@class='containerFullWidth']/div/div/div/div/div/div/div/a"));

        if(element == null){
            log.debug("Hepsiburada logosu bulunamadı");
        }
        else {
            log.debug("Hepsiburada logosu bulundu");
            }
        return element;
    }
}

