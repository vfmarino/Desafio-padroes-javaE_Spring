package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.facade.Facade;


public class test {

	public static void main(String[] args) {
		
		// Testando  o Desgin Parttner Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Testando  o Desgin Parttner Strategy
		
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setEstrategiaDeCOmportamento(normal);
		
		robo.mover();
		robo.mover();
		
		robo.setEstrategiaDeCOmportamento(agressivo);
		
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		
		robo.setEstrategiaDeCOmportamento(defensivo);
		
		robo.mover();
		robo.mover();
	
		robo.mover();
		
		robo.setEstrategiaDeCOmportamento(normal);
		
		robo.mover();
		
		// Testando  o Desgin Parttner Facade
		
		Facade facade = new Facade();
		facade.migrarCLiente("Victor","13567-182");
		
	}

}
