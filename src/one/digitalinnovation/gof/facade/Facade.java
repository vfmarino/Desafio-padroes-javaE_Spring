package one.digitalinnovation.gof.facade;

import subsistema1.crm.crmService;

import subsistema2.cep.cepAPI;

public class Facade {

	
	public void migrarCLiente(String nome, String cep) {
		
		String cidade = cepAPI.getInstancia().recuperarCidade(cep);
		String estado = cepAPI.getInstancia().recuperarEstado(cep);
		
		crmService.gravarCliente(nome, cep, cidade, estado);
		
		
		
	}
}
