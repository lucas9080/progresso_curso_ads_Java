package prova;
import java.util.*;

public class ex01 {
	
	/*
	 Questão 1 -  Coordenadas de um Ponto 
Leia 2 valores (x e y), que devem representar as coordenadas de um ponto em um 
plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está 
sobre um dos eixos cartesianos ou na origem (x = y = 0).


Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver 
sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. 
Entrada 
A entrada contém as coordenadas de um ponto (X Y). 
Saída 
A saída deve apresentar o quadrante em que o ponto se encontra. 
Exemplos 


	 * */

	public static void main(String[] args) {
		
		Scanner eixos = new Scanner(System.in);
		
		double eixoX;
		double eixoY;
		
		System.out.println("Digite o valor de X: ");
		eixoX = eixos.nextDouble();
		System.out.println("Digite o valor de Y: ");
		eixoY = eixos.nextDouble();
		
		//	ORIGEM
		
		if(eixoX == 0 && eixoY == 0) {
			System.out.print("Origem");
		}
		
		
		
		//EIXO X, Q1
		
		if(eixoX > 0) {
			//eixo x
			
			
			
			if(eixoY == 0) {
				System.out.print("Eixo X");
			}
			
			
			
			if(eixoY > 0) {
				System.out.print("Q1");
			}
			
			
		}
		
		
		//EIXO X, Q2
		if(eixoX < 0) {
			//eixo x
			
			if(eixoY == 0) {
				System.out.print("Eixo X");
			}
			
			if(eixoY > 0) {
				System.out.print("Q2");
			}
			
		}
		
		//EIXO X, Q3
		
		if(eixoX < 0) {
			//eixo x
			
			
			if(eixoY < 0) {
				System.out.print("Q3");
			}
			
			
			
		}
		
		
		//EIXO Y
		
	if(eixoY > 0 && eixoX == 0){
			System.out.print("Eixo Y");
		}
		
	if(eixoY < 0 && eixoX == 0){
			System.out.print("Eixo Y");
		}
		
		//EIXO X, Q4
		
		if(eixoX > 0) {
			//eixo x
			
			
			if(eixoY < 0) {
				System.out.print("Q4");
			}
		
			
			
		}
		
		
		

	}

}
