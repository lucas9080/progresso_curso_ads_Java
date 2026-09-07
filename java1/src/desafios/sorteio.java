package desafios;
import java.util.Scanner;
import java.util.Random;

/*
 * 
 Implemente um jogo em que o computador sorteia um número entre 1 e 5, e o usuário tenta adivinhar 
 esse número. O programa deve informar se o usuário acertou ou errou, exibindo o número correto no final
 * 
 * */


public class sorteio {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//
		
		
		Random gerador = new Random();
		Scanner sorteio = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numberSort = sorteio.nextInt();
		
		
		for(int i = 0; i < 1; i++) {
			int result = gerador.nextInt(6);
			System.out.println(result);
			
			if(numberSort == result) {
				
				System.out.println("Você acertou!");
				
			}else {
				System.out.println("Você errou!");
			}
		}
		
	
	}

}
