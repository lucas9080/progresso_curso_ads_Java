package testedemesa;
import java.util.*;


/*
 * 
 * – Pegar uma escada;
– Posicionar a escada embaixo da lâmpada;
– Buscar uma lâmpada nova;
- trocar a lampada;
*/

public class trocaLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner troca = new Scanner(System.in);
		
		String escada;
		
		System.out.println("Você pegou uma escada? S/N");
		escada = troca.nextLine();
		
		
		if(escada.equals("S")) {//1
			
			String posiçaoEscada;
			System.out.println("Sua escada está abaixo da lâmpada?");
			posiçaoEscada = troca.nextLine();
			
			if(posiçaoEscada.equals("S")) {//2
				
				System.out.println("Você já buscou uma nova lâmpada ?");
				String newLampada = troca.nextLine();
				
				if(newLampada.equals("S")) {
					System.out.println("Pode trocar a lâmpada!");
				}//3
				
				
			}//2
			
			
		}//1
		
	}

	
	
	
}
