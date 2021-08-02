
public class Exemplo001 {

	public static void main(String[] args) {
		
		Carro carro = new Carro(null, null);
		carro.setMarca("Nissan");
		carro.setModelo("Lancer");
		carro.setQuantidadeDePortas(4);
		carro.setValorVenal(1000.0);
		
		Motocicletas moto = new Motocicletas(null, null, null);
		moto.setMarca("Yamaha");
		moto.setModelo("XT");
		moto.setCilindradas("600");
		moto.setValorVenal(1000.0);
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getQuantidadeDePortas());
		carro.acelera();	
		System.out.println(carro.calculaImposto());
		System.out.println("--------------------------");
		System.out.println(moto.getMarca());
		System.out.println(moto.getModelo());
		System.out.println(moto.getCilindradas());
		moto.acelera();
		System.out.println(moto.calculaImposto());
		
	}	
}
