import java.util.Scanner;

public class ContaBuracos {
	
	public static void main(String[] args) {
		char[] letras = {'a', 'b', 'B' ,'c', 'd'};
		int[] numBuracos = {1, 1, 2, 1, 1};
		
		Scanner scan = new Scanner(System.in);
		String texto = scan.next();
		
		char[] palavra = texto.toCharArray();
		
		int contador = 0;
		for(int i=0; i< palavra.length; i++) {
			for (int j = 0; j < letras.length; j++) {
				if(palavra[i] == letras[j]){
					contador += numBuracos[j];
				}
			}
		}
		
		System.out.println("O NÚMERO DE BURACOS DA PALAVRA É: " + contador);
	}

}
