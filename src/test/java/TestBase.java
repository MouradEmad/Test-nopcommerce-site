import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

    protected WebDriver driver;


    @BeforeTest
    public void setUp()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }



//    @AfterTest
//    public void quit()
//    {
//        driver.quit();
//    }

}
