package condicionais;
import java.util.*;
/*
 * 
 Faça um programa que leia dois números A e B e imprima o maior deles.
 
 * */
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		int a = ab.nextInt();
		
		System.out.println("Digite o número B: ");
		int b = ab.nextInt();
		
		if(a > b) {
			System.out.println("O número A é maior que B.");
		}else if(a == b) {
			System.out.println("Os números são iguais. ");
		}else {
			System.out.println("O número B é maior do que A.");
		}
		
		

	}

}
