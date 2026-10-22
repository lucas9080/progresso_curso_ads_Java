package vetores;
import java.util.*;

//  Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo:

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vet = new int[10];
		
		
		
		for(int i = 0; i < 10; i++) {
			
			//Iterando a posição do meu vetor
			vet[i] = vet[i] + i;
			
		//	System.out.println(vet[i]);
			
			if(vet[i]%2 == 0) {
				System.out.println(vet[i] = 5);
			}else {
				System.out.println(vet[i] = 3);
			}
		
		}
		
		
		
		

	}

}
