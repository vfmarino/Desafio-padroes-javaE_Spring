package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * 
 * @see href="https://stackoverflow.com/a/24018148">Referencia sobre Lazy Holder</a>
 * 
 *  
 * @author vf_ma
 *
 */

public class SingletonLazyHolder {
	
	private static class Holder{
		
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		// apressado ja inicia direto
	
	}
	
	private SingletonLazyHolder() {
		// deve ser privado para não conseguirem intanciar 
		super();
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return Holder.instancia;
	
	}
}