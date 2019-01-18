package co.com.eafit.steps;

import co.com.eafit.pageobject.CronosPage;
import net.thucydides.core.annotations.Step;

public class CronosStep {
	CronosPage cronosPage;

	
	@Step
	public void cargaPagina() {
		cronosPage.open();
		
	}


	public void ingresarFiltros(String fechaIni, String fechaFin ) {
		cronosPage.escribirFiltros(fechaIni, fechaFin);
		
	}


	public void verificarResultado(String resultado) {
		cronosPage.verificarRespuesta(resultado);
		
	}


	
	
}
