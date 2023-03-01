package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class StepsMethodes {

    @Given("Kullanici teoweb anasayfaya gider")
    public void kullanici_teoweb_anasayfaya_gider() {
        Driver.getdriver().get(ConfigReader.getProperty("yenikayitURL"));

    }
}
