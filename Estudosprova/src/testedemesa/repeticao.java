package testedemesa;
import java.util.*;

public class repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		/*System.out.println("Digite um número: ");
		num = somadeNumeros.nextInt();
		
		
		//FAZENDO COM O WHILE
	/*	while(num != 0){
			
			soma = soma + num;
			System.out.println("Digite um número.");
			num = somadeNumeros.nextInt();
			System.out.println("Soma: "+ soma);
			
			
		}*/
		
		
		//FAZENDO COM O DO...WHILE
		
		Scanner somadeNumeros= new Scanner(System.in);
		int num, soma = 0;
		
		
		
		System.out.println("Digite um número. Se o número for igual a 0, o programa será encerrado.");
		
		do {
			System.out.println("Digite um número: ");
			num = somadeNumeros.nextInt();
			
			soma = num + soma;
			System.out.println("Num: "+ num);
			System.out.println("Soma: "+ soma);
			
		}while(num != 0);
		
		
		//FAZENDO COM O DO WHILE
		
		System.out.println("A soma total deu: "+ soma);
		

	}

}
