package extras;
import java.util.*;


public class mediaeresultadogeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cod = new Scanner(System.in);
		
		// Criando variáveis das notas
		
		double[] nota1 = new double[11];
		double[] nota2 = new double[11];
		double[] media = new double[11];
		double mediaGeral = 0;
		
		
		// Pegando a primeira nota:
		
		System.out.println("/////////////////   Primeira avaliação  /////////////////////");
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite a nota do " + i + "° aluno: ");
			nota1[i] = cod.nextDouble();
			
		}
		
		System.out.println("/////////////////   Segunda avaliação  /////////////////////");
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite a nota do " + i + "° aluno: ");
			nota2[i] = cod.nextDouble();
			
		}
		
		for(int i = 1; i < 11; i++) {
			
			media[i] = (nota1[i] + nota2[i]) / 2;
			mediaGeral = (mediaGeral + media[i]) / 10;
		}
		
		for(int i = 1; i < 11; i++) {
			
			System.out.println("A média geral da turma foi de: " + media[i]);

		}
		
		
		System.out.println("A média geral da turma foi de: " + mediaGeral);
		
		
	}

}
