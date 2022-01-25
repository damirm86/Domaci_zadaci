package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Domaci13 {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='naziv']")
    WebElement naziv;
    @FindBy(xpath = "//input[@id='adresa']")
    WebElement adresa;
    @FindBy(xpath = "//input[@id='cena']")
    WebElement cena;
    @FindBy(xpath = "//input[@id='slika']")
    WebElement slika;
    @FindBy(xpath = "//body/app-root[1]/div[1]/div[1]/div[1]/form-dodaj-smestaj[1]/form[1]/div[5]/button[1]")
    WebElement submitDodajSmestaj;
    @FindBy(xpath = "//select[@id='smestaj']")
    WebElement izaberiSmestaj;
    @FindBy(xpath = "//input[@id='tip']")
    WebElement tipSobe;
    @FindBy(xpath = "//input[@id='kvadratura']")
    WebElement kvadratura;
    @FindBy(xpath = "//body/app-root[1]/div[1]/div[1]/div[1]/form-dodaj-sobu[1]/form[1]/div[4]/button[1]")
    WebElement submitDodajSobu;

    public Domaci13(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void dodajSmestaj(String nazivS, String adresaS, String cenaS) {
        naziv.sendKeys(nazivS);
        adresa.sendKeys(adresaS);
        cena.sendKeys(cenaS);
        slika.sendKeys("https://www.google.com/url?sa=i&url=https%3A%2F%2Flakodokuce.rs%2Fytong-porodicne-kuce%2Fkuca-2%2F&psig=AOvVaw3uxFTby0QN3SFoR6yERC8L&ust=1643129622688000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOiz2_7syvUCFQAAAAAdAAAAABAD");
        submitDodajSmestaj.click();
    }

    public void dodajSobu() {
        Actions action = new Actions(driver);
        Select izaberi = new Select(izaberiSmestaj);
        izaberi.selectByValue("Dom mira");
        tipSobe.sendKeys("Spavaca");
        kvadratura.sendKeys("20");
        action.moveToElement(submitDodajSobu).click();
    }
}