import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
        Integer b[] =  {1, 2, 3};        
        List<Integer> listBob = Arrays.asList(b);        
        
        Integer a[] = {5, 2, 2};
        List<Integer> listAlice = Arrays.asList(a);
        
        Teste teste = new Teste();
        List<Integer> listaComparada = teste.compareTriplets(listAlice, listBob);
        listaComparada.forEach(x -> System.out.println(x));
        


	}

	public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	       // Duas variáveis receb. valores 0.        
	       int aliceTotalPontos = 0;
	       int bobTotalPontos = 0;
	       
	       // Um laço de repetição FOR para percorrer minha lista.
	       // Tendo a expressão booleana 3 pois já foi dado o valor máximo a ser percorrido.
	       for(int i = 0; i < 3; i++) {
	           int alicePonto = a.get(i);
	           int bobPonto = b.get(i);
	           
	           // Estrutura decisiva IF para verificar quem esta pontuando.           
	           if (a.get(i).compareTo(b.get(i)) != 0) {
	               int exec = a.get(i) > b.get(i) ? aliceTotalPontos++ : bobTotalPontos++;
	           }
	       }       
	       // Uma lista para adicionar os pontos e ver quem ganhou.       
	       List<Integer> resultadoFinal = new ArrayList<>();
	       resultadoFinal.add(aliceTotalPontos);
	       resultadoFinal.add(bobTotalPontos);
	       return resultadoFinal;
	}
}
