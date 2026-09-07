package testedemesa;
import java.util.*;

public class verificaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner verificaidd = new Scanner(System.in);
		int idade = 0;
		
		System.out.println("Qual sua idade?");
		idade = verificaidd.nextInt();
		
		if(idade < 21) {
			System.out.println("Você é jovem.");
		}else {
			System.out.println("Você é adulto.");
		}
		

	}

}
