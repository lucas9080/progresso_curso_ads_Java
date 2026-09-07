package vetores;
import java.util.*;

//Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo:

//posição 0 - 5
//posição 1 - 10
//posição 2 - 15
//posição 3 - 20
//posição 4 - 25
//posição 5 - 30
//posição 6 - 35
//posição 7 - 40
//posição 8 - 45
//posição 9 - 50

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num[] = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			
			
			
			for(int calc = 0; calc < 10; calc++) {
				num[i] = 5 * i;
			}
			
			System.out.println(num[i] + 5);
		
		}
		
		
		
		

	}

}
