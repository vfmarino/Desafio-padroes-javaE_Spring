package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Apressado".
 * 
 *  
 * @author vf_ma
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	// apressado ja inicia direto
	
	private SingletonEager() {
		// deve ser privado para não conseguirem intanciar 
		super();
		
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	
	}
}