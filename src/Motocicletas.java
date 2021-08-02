
public class Motocicletas extends Veiculos {

	public Motocicletas(String modelo, String marca, String cilindradas) {
		super(modelo, marca);
	}

	private String cilindradas;

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public double calculaImposto() {
		return this.getValorVenal() * 0.03;
	}
	
}
