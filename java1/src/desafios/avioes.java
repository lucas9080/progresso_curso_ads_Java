package desafios;
import java.util.*;

public class avioes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double C;
		double P;
		double F;
		
		Scanner compAvioes = new Scanner(System.in);
		
		System.out.println("Digite quantos alunos vão participar: ");
		C = compAvioes.nextDouble();
		
		System.out.println("Digite qual a quantidade de folhas de papel possuem: ");
		P = compAvioes.nextDouble();

		System.out.println("Digite qual a quantidade de folhas de papel que cada competidor irá receber: ");
		F = compAvioes.nextDouble();
		
		double distPapeis = (P / F);
		
		if(distPapeis >= C) {
			System.out.println("Você tem papéis o suficiente.");
		}else {
			System.out.println("O número de papéis é insuficiente.");
		}

		
	}

}
