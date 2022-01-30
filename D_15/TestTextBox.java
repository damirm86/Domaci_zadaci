package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TextBox;
import java.time.Duration;


public class TestTextBox {

    private WebDriver wd;
    Faker faker;

    @DataProvider(name = "testTextBox")
    public Object[][] testTextBox() {
        faker = new Faker();

        return new Object[][]{
                {"email245@yahoo.com", faker.name().fullName(), faker.address().fullAddress(), faker.address().secondaryAddress()},
                {"email@hotmail.com", faker.name().fullName(), faker.address().fullAddress(), faker.address().secondaryAddress()},
                {"email@yahoo.com", faker.name().fullName(), faker.address().fullAddress(), faker.address().secondaryAddress()},
                {"123458dd@gmail.com", faker.name().fullName(), faker.address().fullAddress(), faker.address().secondaryAddress()},
        };
    }

    @Test(dataProvider = "testTextBox")
    public void testLoginEmail(String email, String name, String fullAddress, String secondaryAddress) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Damir\\Desktop\\nedelja5_selenium\\chromedriver.exe");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wd.get("https://demoqa.com/text-box");
        wd.manage().window().maximize();

        TextBox tb = new TextBox(wd);

        tb.enterUserName(name);
        tb.enterUserEmail(email);
        tb.enterCurrentAddress(fullAddress);
        tb.enterPermanentAddress(secondaryAddress);
        tb.clickOnSubmit();

        Assert.assertTrue(tb.nameIsDisplayed(), "User name should be displayed");
        Assert.assertTrue(tb.emailIsDisplayed(), "User email should be displayed");
        Assert.assertTrue(tb.curAdrIsDisplayed(), "Current address should be displayed");
        Assert.assertTrue(tb.perAdrIsDisplayed(),"Permanent address should be displayed");
        wd.close();
    }
}