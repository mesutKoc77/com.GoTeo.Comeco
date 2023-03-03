package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NeuerBenutzerPages {

    public NeuerBenutzerPages() {
        PageFactory.initElements(Driver.getdriver(), this);

    }


    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyButtonAccept']")
    public WebElement linkCookies;
    @FindBy(xpath = "(//a[@href='https://onboarding.goteo.de/#/home'])[2]")
    public WebElement linkRegistrieren;







}
