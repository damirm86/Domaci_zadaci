import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.ProductComparison;
import java.io.IOException;
import java.time.Duration;

public class TestProductComparison {

    private WebDriver wd;

    @BeforeClass
    public void init() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                PropReader.fetchProperty("WEBDRIVER.CHROME.PATH"));
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterClass
    public void zatvoriWebDriver() {
        wd.close();
    }

    @Test
    public void productComparisonHappyPath() throws IOException, InterruptedException {

        System.out.println("Go to http://automationpractice.com/index.php");
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

        Assert.assertEquals(wd.getCurrentUrl(), "http://automationpractice.com/index.php",
                "The current url should be equal to http://automationpractice.com/index.php");

        ProductComparison pc = new ProductComparison(wd);

        pc.ProductComparison();

        String confirmationMsg1 = pc.getConfirmationMessageFirst();

        String confirmationMsg2 = pc.getConfirmationMessageSecond();


        System.out.println("Assert that first dress has been added to compare.");
        Assert.assertEquals(confirmationMsg1, "Printed Summer Dress",
                "The message should be equal to 'Printed Summer Dress'");

        System.out.println("Assert that second dress has been added to compare");
        Assert.assertEquals(confirmationMsg2, "Printed Summer Dress",
                "The message should be equal to 'Printed Summer Dress'");
    }
}



