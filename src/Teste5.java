import java.util.Arrays;
import java.util.List;

public class Teste5 {

	public static void main(String[] args) {
		Teste5 teste = new Teste5();
		teste.countApplesAndOranges(7, 10, 4, 12, Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));
	}

	public void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		// Duas variáveis receb. valores 0.
		int orange = 0;
		int apple = 0;

		// Criado um laço FOR para percorrer as ditâncias das maçãs.
		for (int i = 0; i < apples.size(); i++) {
			// está pegando A que é a posição da macieira + a qtd de maçãs
			int posicao = a + apples.get(i);

			// está pegando posição maior ou igual á S que é a posição da casa de Sam e
			// posição <= a t que é a posição de Sam
			if (posicao >= s && posicao <= t) {
				apple++;
			}
		}

		// Criado um laço FOR para percorrer as ditâncias das laranjas.
		for (int i = 0; i < oranges.size(); i++) {
			// está pegando A que é a posição da macieira + a qtd de laranjas
			int posicao = a + oranges.get(i);

			// está pegando posição maior ou igual á S que é a posição da casa de Sam e
			// posição <= a t que é a posição de Sam
			if (posicao >= s && posicao <= t) {
				orange++;
			}
		}
		System.out.println(apple);
		System.out.println(orange);

	}

}
