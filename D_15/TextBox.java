package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TextBox {
    private WebDriver wd;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement userEmail;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement current;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement permanent;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

    @FindBy(xpath = "//p[@id='name']")
    WebElement disName;

    @FindBy(xpath = "//p[@id='email']")
    WebElement disEmail;

    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement curAdr;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    WebElement perAdr;

    public TextBox(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void enterUserName(String un) {
        this.userName.sendKeys(un);
    }

    public void enterUserEmail(String ue) {
        this.userEmail.sendKeys(ue);
    }

    public void enterCurrentAddress(String cura) {
        this.current.sendKeys(cura);
    }

    public void enterPermanentAddress(String pera) {
        this.permanent.sendKeys(pera);
    }

    public void clickOnSubmit() {
        JavascriptExecutor jse2 = (JavascriptExecutor) wd;
        jse2.executeScript("arguments[0].scrollIntoView()", submit);
        submit.click();
    }

    public boolean nameIsDisplayed() {
        return disName.isDisplayed();
    }

    public boolean emailIsDisplayed() {
        return disEmail.isDisplayed();
    }

    public boolean curAdrIsDisplayed() {
        return curAdr.isDisplayed();
    }

    public boolean perAdrIsDisplayed() {
        return perAdr.isDisplayed();
    }

}
