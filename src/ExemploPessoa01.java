
public class ExemploPessoa01 {

	public static void main(String[] args) {

		Pessoa eu = new Pessoa("Yohan", 2001, 06, 8);
		
		System.out.println(eu.getNome());
		System.out.println(eu.getDataNascimento());
		System.out.println(eu.calcularIdade());
		
		eu.setNome("Yohan Coelho");
		
		System.out.println(eu.getNome());
	}

}
