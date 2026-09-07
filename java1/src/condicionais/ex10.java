package condicionais;
import java.util.*;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner math = new Scanner(System.in);
		
		int op;
		
		System.out.println("---------  1 - Soma --------------");
		System.out.println("---------  2 - Subtração --------------");
		System.out.println("---------  3 - Multiplicação --------------");
		System.out.println("---------  4 - Divisão --------------");
		
		System.out.println("Escolha uma das 4 operações básicas acima: ");
		op = math.nextInt();
		
		if(op == 1) {
			
			System.out.println("Digite o primeiro número para soma: ");
			int soma01 = math.nextInt();
			
			System.out.println("Digite o segundo número para soma: ");
			int soma02 = math.nextInt();
			
			int resultSoma = soma01 + soma02;
			
			System.out.println("O resultado da soma é de: " + resultSoma);
			
			
		}else if(op == 2) {
			
			System.out.println("Digite o primeiro número para subtração: ");
			int sub01 = math.nextInt();
			
			System.out.println("Digite o segundo número para subtração: ");
			int sub02 = math.nextInt();
			
			int resultSub = sub01 - sub02;
			
			System.out.println("O resultado da subtração é de: " + resultSub);
			
			
		}else if(op == 3) {
			
			System.out.println("Digite o primeiro número para multiplicação: ");
			int mult01 = math.nextInt();
			
			System.out.println("Digite o segundo número para multiplicação: ");
			int mult02 = math.nextInt();
			
			int resultMult = mult01 * mult02;
			
			System.out.println("O resultado da multiplicação é de: " + resultMult);
			
			
		}else if(op == 4) {
			
			System.out.println("Digite o primeiro número para divisão: ");
			double div01 = math.nextInt();
			
			System.out.println("Digite o segundo número para divisão: ");
			double div02 = math.nextInt();
			
			double resultDiv = div01 / div02;
			
			System.out.println("O resultado da divisão é de: " + resultDiv);
			
			
		}else {
			System.out.println("Digite um número válido!");
		}

	}

}
