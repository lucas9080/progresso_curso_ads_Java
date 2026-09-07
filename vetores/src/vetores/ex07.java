package vetores;
import java.util.*;

public class ex07 {
	
	// TODO Auto-generated method stub
			//Faça um programa que leia 10 números inteiros e armazene em um vetor. Após, some estes valores e mostre o resultado.
			

	public static void main(String[] args) {
		
		Scanner somaNum = new Scanner(System.in);
		
		int num[] = new int[10];
		int soma = 0;
		for(int i = 0; i <=9; i++) {
			System.out.println("Digite um número: ");
			num[i] = somaNum.nextInt();
			soma = soma + num[i];
		}
		
		System.out.println(soma);
		
	}

}
