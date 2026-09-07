package prova;

import java.util.*;

public class ex02 {
	
	/*
	 
Questão 2 - Tempo de Jogo 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma 
duração mínima de 1 hora e máxima de 24 horas. 
Entrada 
A entrada contém dois valores inteiros representando a hora de início e a hora de 
fim do jogo. 
Saída 
Apresente a duração do jogo conforme exemplo abaixo.


	 
	 * */

	public static void main(String[] args) {
		int horaInit;
		int horaFinit;
		
		Scanner jogo = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		horaInit = jogo.nextInt();
	
		
		System.out.println("Digite a hora final: ");
		horaFinit = jogo.nextInt();
		
		int resultJogo = (24 - horaInit) + horaFinit;
		
		
		
		if(horaInit == 0 && horaFinit == 0) {
			System.out.println("Você jogou 24 horas!!");
		}else if(resultJogo > 24) {
			resultJogo = horaFinit - horaInit;
			System.out.println("Você jogou "+ resultJogo + " horas!");
		}
		
		else if(horaInit == horaFinit){
			System.out.println("Você precisa jogar no mínimo 1 hora!");
		}else{
			
			System.out.println("Você jogou: "+ resultJogo + " Horas!");
			
		}
		
		

	}

}
