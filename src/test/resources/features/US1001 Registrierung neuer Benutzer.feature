Feature: Registrierung neuer Benutzer

  @neuerBenutzer1
  Scenario: Der Benutzer sollte sich erfolgreich registrieren können, wenn er die richtigen Informationen eingibt

    Given Der Benutzer loggt sich auf der Homepage von Teo ein.
    And Klickt auf den Link Cookies
    And Klickt auf den Link REGISTRIEREN
    And Klickt auf die Schaltfläche -Ich bin mit den Allgemeinen Geschäftsbedingungen einverstanden-.
    And Klickt auf die Schaltfläche -Ich habe die Datenschutzbestimmungen zur Kenntnis genommen-.
    When Klickt auf die Schaltfläche Weiter.
    And Gibt die Informationen in das Feld Vorname ein.
    And Gibt die Informationen in das Feld Nachname ein.
    And  Gibt die Informationen in das Feld Geburtsdatum ein.
    When Klickt auf die Schaltfläche Weiter.
    And Gibt Informationen in das Feld E-Mail ein.
    And Gibt Informationen in das Feld Passwort ein.
    And Gibt die gleichen Passwortinformationen in das zweite Feld Passwort ein.
    When Klickt auf die Schaltfläche Weiter.
    And Überprüft, ob der Bestätigungscode an die entsprechende E-Mail-Adresse gesendet wird.
    Then Klickt auf die Schaltfläche Weiter.



