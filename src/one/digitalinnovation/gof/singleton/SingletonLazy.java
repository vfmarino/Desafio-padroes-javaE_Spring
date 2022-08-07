package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Preguiçoso".
 * 
 *  
 * @author vf_ma
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		// deve ser privado para não conseguirem intanciar 
		super();
		
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	
	}
}