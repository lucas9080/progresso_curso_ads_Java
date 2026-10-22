package vetores;
import java.util.*;

public class sequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cod = new Scanner(System.in);
		
		
		System.out.println("Digite quantos números terão em sequência: ");
		int numSeq = cod.nextInt();
		
		//número real da sequencia
		int[] numList = new int[numSeq - 1];
	
		
		
		// incrementa os números no for
		int soma = 0;
		
		
		//sequencia digitada pelo usuario
		int numSeqReal = 0;
		
		//adiciona 1 a mais
		int adicao = 0;
		
		// pega o tamanho da lista e passa por ela.
		for(int i = 0; i < numList.length; i++) {
			
			soma = numList[i] + i;
			soma = numList[i] + i + 1;
			System.out.println("Digite o " + (i + 1) + "° número: ");
			
			
			//guarda todos os números na sequencia
			 numSeqReal = cod.nextInt();
			 
			 adicao = numList[i] + 1;	
			 
		}
		
		System.out.println(adicao);
		
		
		

	}

}
