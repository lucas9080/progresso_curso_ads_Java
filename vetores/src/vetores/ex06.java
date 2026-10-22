package vetores;
import java.util.*;


public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor. 
		//No final, mostre quais são os números pares que foram digitados e em que posições eles estão armazenados.
		
		Scanner cod = new Scanner(System.in);
		
		int[] vetNum = new int[10];
		int[] pos = new int[10];
		System.out.println("Digite um número: ");
		
		
		for(int i = 0; i < 10; i++) {
			pos[i] = vetNum[i] + i;
			vetNum[i] = cod.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Posição: " + pos[i] + "valor: " + vetNum[i]);
			
		}
		
	
	
	}

}
