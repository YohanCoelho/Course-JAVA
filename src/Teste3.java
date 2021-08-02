import java.util.List;

public class Teste3 {

	public static void main(String[] args) {
		Teste3 teste = new Teste3();
		System.out.println(teste.kangaroo(0, 3, 4, 2));
	}

	public String kangaroo(int x1, int v1, int x2, int v2) {
		// Apliquei a formula encontrada
		// (x1 - x2) % (v1 - v2)

		if (v1 < v2)
			return "NO";

		// Usei um método abreviado para somar o valor restante, poderia ter usado uma
		// variavel do tip INT para declarar um valor restante.
		if ((x2 - x1) % (v1 - v2) == 0)
			return "YES";
		else
			return "NO";

	}

}
