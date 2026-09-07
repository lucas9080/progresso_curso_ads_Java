package repeticao;
import java.util.*;

/*
 * 2. Crie um programa que exiba o seguinte menu até que o usuário escolha a opção 0:
1 - Dizer Olá
	2 - Mostrar data atual
	0 - Sair
Use do...while para repetir o menu. Não precisa implementar a funcionalidade das opções, apenas simular com mensagens como “Olá!” 
ou “Data: simulada”.

 * */



public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	/*	
		if(num == 1) {
			System.out.println("Olá!");
		}else if(num == 2) {
			System.out.println("19/06/2026");
		}else if(num == 0) {
			System.out.println("Você saiu.");
		}else {
			System.out.println("Opção incorreta!");	
			
		}
		
		
		*/
		
	Scanner menu = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite uma opção no menu:");
		System.out.println("1 - boas vindas!");
		System.out.println("2 - diz a data atual");
		System.out.println("0 - sair");
		num = menu.nextInt();
		
		
		do {
			
			
			if(num == 2) {
				System.out.println("19/06/2026");
				num++;
			}
			
			if(num == 1) {
				System.out.println(" boas vindas!");
				num++;
			}
			
			
			
		}while(num != 0);
		

	}

}
