package Steps;

import io.cucumber.java.en.*;
import pages.AutomationPracticePage;


public class AutomationPracticeSteps {
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();

    @Given("^Navegar a la pagina de comprar$")
    public void Navegar(){
        automationPracticePage.navegarApagina();
    }

    @When("^Ingresar (.+) buscarla y hacer click sobre ella$")
    public void Buscar(String ropa){
        automationPracticePage.clickBox(ropa);
        automationPracticePage.clickElement();
        automationPracticePage.clickImagen();
        automationPracticePage.switchPanel();
    }


}
