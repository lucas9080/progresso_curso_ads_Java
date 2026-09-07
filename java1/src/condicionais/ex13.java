package condicionais;
import java.util.*;

/*
 * 
13. Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de serviços é de: 
•R$ 5.50 por diária, se o número de diárias for maior que 15;
•R$ 6.00 por diária, se o número de diárias for igual a 15;
•R$ 8.00 por diária, se o número de diárias for menor que 15.			
Construa um programa que leia o número de diárias de um cliente e mostre o seu nome e o total da conta.
 
 * */

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner hotel = new Scanner(System.in);
		
		double diaria;
		double valorDiaria = 60;
		
		System.out.println("Qual seu nome? ");
		String nome = hotel.nextLine();
		
		System.out.println("Quantos dias pretende ficar ");
		diaria = hotel.nextDouble();
		
		if(diaria > 15) {
			double resultDiaria = (5.50 + valorDiaria) * diaria;
			System.out.println("Seu nome é: "+ nome);
			System.out.println("O valor total da sua conta ficou em: "+ resultDiaria);
			
		}else if(diaria == 15) {
			double resultDiaria = (6.00 + valorDiaria) * diaria;
			System.out.println("Seu nome é: "+ nome);
			System.out.println("O valor total da sua conta ficou em: "+ resultDiaria);
			
		}else {
			double resultDiaria = (8.00 + valorDiaria) * diaria;
			System.out.println("Seu nome é: "+ nome);
			System.out.println("O valor total da sua conta ficou em: "+ resultDiaria);
		}

	}

}
