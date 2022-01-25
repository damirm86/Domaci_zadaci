package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductComparison {

    public WebDriver driver;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement women;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dresses;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement summerDresses;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]")
    WebElement prvaSlika;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[3]/div[2]/a[1]")
    WebElement addToCompare1;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]")
    WebElement drugaSlika;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[3]/div[2]/a[1]")
    WebElement addToCompare2;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/form[1]/button[1]")
    WebElement compare;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h5[1]/a[1]")
    WebElement confirmationBoxFirst;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/h5[1]/a[1]")
    WebElement confirmationBoxSecond;

    public ProductComparison(WebDriver driver) { //pravljenje konstruktora sa Web driverom
        this.driver = driver;
        PageFactory.initElements(driver, this); //inicijalizuja svih elemenata na web strani
    }

    public String getConfirmationMessageFirst() {
        return confirmationBoxFirst.getText();
    }

    public String getConfirmationMessageSecond() {
        return confirmationBoxSecond.getText();
    }


    public void ProductComparison() throws InterruptedException {
        Actions action = new Actions(driver);
        women.click();
        dresses.click();
        summerDresses.click();
        action.moveToElement(prvaSlika).build().perform();
        addToCompare1.click();
        Thread.sleep(2000);
        action.moveToElement(drugaSlika).build().perform();
        addToCompare2.click();
        compare.click();
    }

}
