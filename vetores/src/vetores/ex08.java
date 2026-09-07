package vetores;
import java.util.*;

public class ex08 {
	
	//. Crie um programa que leia as notas de uma turma de 10 alunos. Guarde-as em um vetor, calcule a média da turma e conte quantos alunos
	//obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner turmaTec = new Scanner(System.in);
		
		double turma[] = new double[10];
		double somaMedia = 0;
		double media = 0;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Digite a nota ");	
			turma[i] = turmaTec.nextDouble();
			
			somaMedia = somaMedia + turma[i];
				
		}
		
		media = somaMedia / 10;
		
		
		System.out.print("A média da turma foi: " + media);
		
		
		
		
		

	}

}
