package extras;
import java.util.*;

public class array_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cod = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		System.out.println("Digite um valor: ");
		
		
		
		int pares = 0; int qtdadepares = 0;
		
		for(int i = 0; i < 10; i++) {
			vet[i] = cod.nextInt();
			if(vet[i] %2 == 0) {
				pares = pares + vet[i];
				qtdadepares++;
			}
			
		}
		System.out.println(qtdadepares);
		
		System.out.println(pares);
		

	}

}
