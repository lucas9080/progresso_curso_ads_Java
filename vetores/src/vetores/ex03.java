package vetores;
import java.util.*;

//3. Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo:
//ver no doc


public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] cont = new int[10];
		int result = 9;
		
	for(int i = 0; i <= 9; i++) {
		cont[i] = result;
		cont[i] = result - i;
		
		System.out.println(cont[i]);
	}
		
	System.out.println(cont[5]);
	}

}
