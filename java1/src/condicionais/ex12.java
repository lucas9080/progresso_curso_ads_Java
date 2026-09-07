package condicionais;
import java.util.*;

/*
 
12. Faça um programa que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição:	
• “F1”, se N <= 10
• “F2”, se N > 10 e N <= 100 
• “F3”, se n > 100
 * */

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = numero.nextInt();
		
		if(n <= 10) {
			System.out.println("F1");
		}
		if(n > 10 && n <= 100) {
			System.out.println("F2");
		}
		
		if(n > 100) {
			System.out.println("F3");
		}

	}

}
