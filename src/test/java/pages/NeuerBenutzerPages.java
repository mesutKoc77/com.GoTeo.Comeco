package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NeuerBenutzerPages {

    public NeuerBenutzerPages() {
        PageFactory.initElements(Driver.getdriver(), this);

    }


    @FindBy(xpath = "(//a[text()='Registrieren'])[1]")
    public WebElement linkRegistrieren;

    @FindBy(xpath = "//span[text()='Cookies akzeptieren']")
    public WebElement linkCookies;





}
