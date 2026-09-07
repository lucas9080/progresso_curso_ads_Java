package testedemesa;
import java.util.*;

public class comandosSaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Hello word!");
		System.out.print("Hello word!");
		System.out.printf("\n%s %s", "Lucas", "Ferreira");*/
		
		/*int num1 = 10;
		int num2 = 30;
		
		System.out.printf("Soma = %d", (num1 + num2));

 */
		
		Scanner valoresEntrada = new Scanner(System.in);
		
		//VALOR REAL (float):
		
		float preco;
		System.out.print("Informe o preço = R$");
		preco = valoresEntrada.nextFloat();
		System.out.print(preco);
		
		
		//VALOR REAL (double):
		
		double salario;
		
		System.out.print("Informe seu salário: = R$");
		salario = valoresEntrada.nextDouble();
		System.out.print(salario);
		
		//VALOR DE TEXTO (String):
		
		String S;
		
		System.out.println("Digite algo...");
		S = valoresEntrada.nextLine();
		
		System.out.print(S);
		
	}

}
