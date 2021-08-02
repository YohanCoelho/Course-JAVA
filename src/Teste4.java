
public class Teste4 {

	public static void main(String[] args) {
		int n = 6;
		int j  = 0;
		int count = n-1;
		boolean teste = false;
		for(int i = 0; i < n ; i++) {
			for( ; j < n; j++) {
				teste = count <= j;
				if(teste) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			teste = false;
			count--;
			j = 0;
			System.out.println();
		}
	}
}
