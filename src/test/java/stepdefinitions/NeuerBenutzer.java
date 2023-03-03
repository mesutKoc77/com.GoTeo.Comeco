package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.NeuerBenutzerPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class NeuerBenutzer {

    NeuerBenutzerPages neuerBenutzerPages =new NeuerBenutzerPages();

    @Given("Der Benutzer loggt sich auf der Homepage von Teo ein.")
    public void der_benutzer_loggt_sich_auf_der_homepage_von_teo_ein() {
        Driver.getdriver().get(ConfigReader.getProperty("teoUrl"));

    }

    @And("Klickt auf den Link Cookies")
    public void klicktDieCookies() {

      WebElement cookies = ReusableMethods.waitForClickablility(neuerBenutzerPages.linkCookies, 10);
      ReusableMethods.wait(2);
      cookies.click();
    }

    @Given("Klickt auf den Link REGISTRIEREN")
    public void klickt_auf_den_link_registrieren() {
        WebElement register = ReusableMethods.waitForClickablility(neuerBenutzerPages.linkRegistrieren,10);
        ReusableMethods.wait(2);
        register.click();

    }

    @Given("Klickt auf die Schaltfläche -Ich bin mit den Allgemeinen Geschäftsbedingungen einverstanden-.")
    public void klickt_auf_die_schaltfläche_ich_bin_mit_den_allgemeinen_geschäftsbedingungen_einverstanden() {

    }
    @Given("Klickt auf die Schaltfläche -Ich habe die Datenschutzbestimmungen zur Kenntnis genommen-.")
    public void klickt_auf_die_schaltfläche_ich_habe_die_datenschutzbestimmungen_zur_kenntnis_genommen() {

    }

    @When("Klickt auf die Schaltfläche Weiter.")
    public void klickt_auf_die_schaltfläche_weiter() {

    }

    @When("Gibt die Informationen in das Feld Vorname ein.")
    public void gibt_die_informationen_in_das_feld_vorname_ein() {

    }

    @When("Gibt die Informationen in das Feld Nachname ein.")
    public void gibt_die_informationen_in_das_feld_nachname_ein() {

    }

    @When("Gibt die Informationen in das Feld Geburtsdatum ein.")
    public void gibt_die_informationen_in_das_feld_geburtsdatum_ein() {

    }

    @When("Gibt Informationen in das Feld E-Mail ein.")
    public void gibt_informationen_in_das_feld_e_mail_ein() {

    }

    @When("Gibt Informationen in das Feld Passwort ein.")
    public void gibt_informationen_in_das_feld_passwort_ein() {

    }

    @When("Gibt die gleichen Passwortinformationen in das zweite Feld Passwort ein.")
    public void gibt_die_gleichen_passwortinformationen_in_das_zweite_feld_passwort_ein() {

    }

    @When("Überprüft, ob der Bestätigungscode an die entsprechende E-Mail-Adresse gesendet wird.")
    public void überprüft_ob_der_bestätigungscode_an_die_entsprechende_e_mail_adresse_gesendet_wird() {

    }




}
