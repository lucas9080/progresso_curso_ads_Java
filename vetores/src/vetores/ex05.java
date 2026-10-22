package vetores;
import java.util.*;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cod = new Scanner(System.in);

		
		String[] nomes = new String[7];
		
		
		
			for(int i = 0; i < 7; i++) {
				
				nomes[i] = nomes[i] + i;
				
				System.out.println("Digite um nome: ");
				nomes[i] = cod.nextLine();
			
		
		}
			
			for(int i = 6; i >= 0; i--) {
				
				System.out.println(nomes[i]);
			
			
		
		}
		
	
		
		
		
		

	}

}
