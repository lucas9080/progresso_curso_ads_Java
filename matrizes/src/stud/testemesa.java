package stud;
import java.util.*;

public class testemesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cod = new Scanner(System.in);
		int[][] m = new int[3][3];
		int soma = 0;
		int maior = 0;
		
		for(int i = 0; i < 3; i++) { // linha  - instrucao 1
			for(int j = 0; j < 3; j++) { // coluna - instrucao 1
				System.out.print("Digite um valor: ");
				m[i][j] = cod.nextInt();
				
			}
			
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) { // coluna - instrucao 1
				soma = m[i][j] + soma;
				
			}
			
			System.out.println("Soma da linha "+ i +" " +  soma );
			soma = 0;
			
		}
		
	}

}
