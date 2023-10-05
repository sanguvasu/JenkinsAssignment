package Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NavigationTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        // set path of Chromedriver executable
//        System.setProperty("webdriver.chrome.driver",
//                "/src/test/resources/drivers/chromedriver");

        
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
            // Instantiate a ChromeDriver class.
            //WebDriver driver = new ChromeDriver();
     
            // Maximize the browser
            //driver.manage().window().maximize();
     
            // Launch Website
           // driver.get("https://www.geeksforgeeks.org/");
     
            // Launch Website
           // driver.get("https://www.geeksforgeeks.org/");
        
        
        // initialize new WebDriver session
        driver = new ChromeDriver();
        System.out.println("Testingssss");
    }

    @Test
    public void navigateToAUrl() {
        // navigate to the web site
        driver.get("http://demo-store.seleniumacademy.com/");
        // Validate page title
        //Assert.assertEquals(driver.getTitle(), "Madison Island");
    }
    @AfterMethod
    public void afterMethod() {

        // close and quit the browser
        driver.quit();
    }
}