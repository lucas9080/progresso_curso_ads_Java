package condicionais;
import java.util.*;

public class ex04 {
	/*
	 Construa um programa que lê um número de 1 a 7 e informa o dia da semana correspondente,
	  sendo domingo o dia de número 1. Se o dia não corresponder ao dia da semana, é mostrada
	   uma mensagem de erro.
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diaSemanaUser = 0;
		
		Scanner diaSemana = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		diaSemanaUser = diaSemana.nextInt();
		
		if(diaSemanaUser == 1) {
			System.out.println("Esse dia é Domingo!");
		}
		else if(diaSemanaUser == 2) {
			System.out.println("Esse dia é Segunda!");
		}
		else if(diaSemanaUser == 3) {
			System.out.println("Esse dia é Terça!");
		}
		else if(diaSemanaUser == 4) {
			System.out.println("Esse dia é Quarta!");
		}
		else if(diaSemanaUser == 5) {
			System.out.println("Esse dia é Quinta!");
		}
		else if(diaSemanaUser == 6) {
			System.out.println("Esse dia é Sexta!");
		}
		else if(diaSemanaUser == 7) {
			System.out.println("Esse dia é Sábado!");
		}else {
			System.out.println("Esse dia da semana é inexistente!");
		}
		
	}

}
