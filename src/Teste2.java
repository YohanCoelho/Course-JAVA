import java.util.ArrayList;
import java.util.List;

public class Teste2 {

	public static void main(String[] args) {
		List<Integer> diagonal1 = new ArrayList<>();
		List<Integer> diagonal2 = new ArrayList<>();
		List<Integer> diagonal3 = new ArrayList<>();
		diagonal1.add(11);
		diagonal1.add(2);
		diagonal1.add(4);
		diagonal2.add(4);
		diagonal2.add(5);
		diagonal2.add(6);
		diagonal3.add(10);
		diagonal3.add(8);
		diagonal3.add(-12);
		List<List<Integer>> matriz = new ArrayList<>();
		matriz.add(diagonal1);
		matriz.add(diagonal2);
		matriz.add(diagonal3);
		Teste2 teste = new Teste2();
		int diagonalDifference = teste.diagonalDifference(matriz);
		System.out.println(diagonalDifference);

	}

	public Integer diagonalDifference(List<List<Integer>> arr) {
		// Duas variáveis receb. valores 0.

		Integer primeiraDiagonal = 0;
		Integer segundaDiagonal = 0;

		// Um laço de repetição FOR para percorrer o array.
		for (int i = 0; i < arr.size(); i++) {
			primeiraDiagonal += arr.get(i).get(i);
		}

		// Esse FOR, ele percorrerar o array da mais alta coluna para a mais baixa linha
		// da primeira coluna.
		int j = 0;
		for (int i = arr.size() - 1; i >= 0; i--) {
			segundaDiagonal += arr.get(j).get(i);
			j++;
		}

		// Retornará o valor absoluto positivo.
		return Math.abs(primeiraDiagonal - segundaDiagonal);

	}

}
