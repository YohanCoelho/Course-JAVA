import java.util.Arrays;
import java.util.List;

public class Teste5 {

	public static void main(String[] args) {
		Teste5 teste = new Teste5();
		teste.countApplesAndOranges(7, 10, 4, 12, Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));
	}

	public void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		// Duas vari�veis receb. valores 0.
		int orange = 0;
		int apple = 0;

		// Criado um la�o FOR para percorrer as dit�ncias das ma��s.
		for (int i = 0; i < apples.size(); i++) {
			// est� pegando A que � a posi��o da macieira + a qtd de ma��s
			int posicao = a + apples.get(i);

			// est� pegando posi��o maior ou igual � S que � a posi��o da casa de Sam e
			// posi��o <= a t que � a posi��o de Sam
			if (posicao >= s && posicao <= t) {
				apple++;
			}
		}

		// Criado um la�o FOR para percorrer as dit�ncias das laranjas.
		for (int i = 0; i < oranges.size(); i++) {
			// est� pegando A que � a posi��o da macieira + a qtd de laranjas
			int posicao = a + oranges.get(i);

			// est� pegando posi��o maior ou igual � S que � a posi��o da casa de Sam e
			// posi��o <= a t que � a posi��o de Sam
			if (posicao >= s && posicao <= t) {
				orange++;
			}
		}
		System.out.println(apple);
		System.out.println(orange);

	}

}
