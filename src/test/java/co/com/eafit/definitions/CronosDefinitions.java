package co.com.eafit.definitions;

import co.com.eafit.steps.CronosStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CronosDefinitions {
	
	@Steps
	
	CronosStep cronosStep;
	
	@Given("^que yo quiero consultar requerimientos de bienes$")
	public void que_yo_quiero_consultar_requerimientos_de_bienes() throws Exception {
	   
		cronosStep.cargaPagina();
	}

	@When("^se selecciona una fechaini \"([^\"]*)\" y una fechafin \"([^\"]*)\"$")
	public void se_selecciona_una_fechaini_y_una_fechafin(String fechaIni, String fechaFin) throws Exception {
		
		cronosStep.ingresarFiltros(fechaIni, fechaFin);
	    
	}

	@Then("^se muestra el mensaje \"([^\"]*)\"$")
	public void se_muestra_el_mensaje(String resultado) throws Exception {
	    cronosStep.verificarResultado(resultado);
		
	}

}
