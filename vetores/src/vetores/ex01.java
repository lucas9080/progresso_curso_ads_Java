package vetores;
import java.util.*;

//Faça um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 8 posições, conforme abaixo:

//posição 0 - 999
//posição 1 - 999
//posição 2 - 999
//posição 3 - 999
//posição 4 - 999
//posição 5 - 999
//posição 6 - 999
//posição 7 - 999



public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] valores = new int[8];
		
		
		
		
		for(int i = 0; i < valores.length; i++) {
			
			
			valores[i] = 999;
			System.out.println("Posição arrays: "+ i + " - "+ valores[i]);
		}
		

	}
}
