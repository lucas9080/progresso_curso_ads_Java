package desafios;
import java.util.*;

/*
 Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o
animal segundo a figura acima, com todas as letras minúsculas.
Saída
Imprima o nome do animal correspondente à entrada fornecida.
 * */



public class animais {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tiposAnimais = new Scanner(System.in);
		
		System.out.println("Informe a primeira classificação: ");
		String c1 = tiposAnimais.nextLine();
		
		System.out.println("Informe a primeira classificação: ");
		String c2 = tiposAnimais.nextLine();
		
		System.out.println("Informe a primeira classificação: ");
		String c3 = tiposAnimais.nextLine();
		
		if(c1.equals("vertebrado")) {
			//vertebrado
			if(c2.equals("ave")) {
				//ave
				
				if(c3.equals("carnivoro")) {
					//carnivoro
					System.out.println("Águia");
					
				}
				if(c3.equals("onivoro")) {
					//onivoro
					System.out.println("Pomba");
				}
			}
		}else {
			//invertebrado
			
			if(c2.equals("inseto")) {
				
				//Inseto
				
				if(c3.equals("hematofago")) {
					//hematofago
					System.out.println("Pomba");	
				}
				
				if(c2.equals("herbivoro")) {
					//herbivoro
					System.out.println("Lagarta");
				}
				
			}
			
			
			
			if(c2.equals("anelideo")) {
				//anelideo
				
				if(c3.equals("hematofago")) {
					//hematofago
					System.out.println("Sanguessuga");
					
				}
				
				
				if(c3.equals("hematofago")) {
					//onivoro
					System.out.println("Minhoca");
					
				}
				
			}
			
		}
		

	}

}
