package driverSetup;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    static Logger log = Logger.getLogger(BaseClass.class.getName());

    public static void SetUpBrowser() {
        PropertyConfigurator.configure("C:\\Users\\USER\\Desktop\\HepsiburadaLogin\\src\\log4j.properties");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com");
    }
}
