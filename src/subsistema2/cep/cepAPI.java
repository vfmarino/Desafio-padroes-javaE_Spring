package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class cepAPI {
	private static cepAPI instancia = new cepAPI();
	// apressado ja inicia direto
	
	private cepAPI() {
		// deve ser privado para não conseguirem intanciar 
		super();
		
	}
	
	public static cepAPI getInstancia() {
		
		return instancia;
	
	}
	
	public String recuperarCidade(String cep) {
		return "São Carlos";
	}
	
	public String recuperarEstado(String cep) {
		return "São Paulo";
	}
}
