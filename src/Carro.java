
public class Carro extends Veiculos {

	public Carro(String modelo, String marca) {
		super(modelo, marca);
	}

	private int quantidadeDePortas;

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
	
	public double calculaImposto() {
		return this.getValorVenal() * 0.07;
	}
	
	
	
	
}
