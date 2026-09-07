package condicionais;
import java.util.*;

public class ex03 {
	
	/*
	  Ler um número inteiro, e verificar se o número corresponde a um mês válido
	   no calendário e escrever o nome do mês, senão escrever uma mensagem ‘Mês Inválido’.
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mes = new Scanner(System.in);
		
		int mesValido = 0;
		
	System.out.println("Digite o mês válido: ");
	mesValido = mes.nextInt();
		
		switch(mesValido) {
		case 01:
			System.out.println("Esse mês é Janeiro!");
			break;
		case 02:
			System.out.println("Esse mês é Fevereiro!");
			break;
		case 03:
			System.out.println("Esse mês é Março!");
			break;
		case 04:
		System.out.println("Esse mês é Abril!");
		break;
		case 05:
			System.out.println("Esse mês é Maio!");
		break;
		case 06:
			System.out.println("Esse mês é Junho!");
		break;
		case 07:
			System.out.println("Esse mês é Julho!");
		break;
		case 8:
			System.out.println("Esse mês é Agosto!");
		break;
		case 9:
			System.out.println("Esse mês é Setembro!");
		break;
		case 10:
			System.out.println("Esse mês é Outubro!");
		break;
		case 11:
			System.out.println("Esse mês é Novembro!");
			break;
			
		case 12:
			System.out.println("Esse mês é Dezembro!");
			break;
			default:
			System.out.println("Não existe esse mês!");
		}
		

	}

}
