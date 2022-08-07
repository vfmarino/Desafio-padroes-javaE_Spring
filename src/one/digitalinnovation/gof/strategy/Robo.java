package one.digitalinnovation.gof.strategy;

public class Robo {
	private Comportamento estrategiaDeCOmportamento;

	
	public void setEstrategiaDeCOmportamento(Comportamento estrategiaDeCOmportamento) {
		this.estrategiaDeCOmportamento = estrategiaDeCOmportamento;
	}
	
	public void mover() {
		estrategiaDeCOmportamento.mover();

	}
}
