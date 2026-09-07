package projetopessoal;
import java.util.*;

/*
 
 precedencia de parenteses
 negação sempre a ser resolvido primeiro nos parênteses
 após, ser resolvido 
 
 * */

public class tabelaverdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tabelas = new Scanner(System.in);
		
		String p;
		String q;
		String r;
		
		System.out.println("Digite a primeira preposição : ");
		p = tabelas.nextLine();
		System.out.println("Digite a segunda preposição : ");
		q = tabelas.nextLine();
		System.out.println("Digite a terceira preposição : ");
		r = tabelas.nextLine();
		
		if(p.equals("p") & q.equals("") & r.equals("")) {
			System.out.println("V");
			System.out.println("F");
			
			System.out.println("Qual o conectivo lógico? ");
			String neg = tabelas.nextLine();
			
			if(neg.equals("~")) {
				
				System.out.println("formula: (p ~p)");
				System.out.println("p\t" + "~p");
				System.out.println("-\t" + "-");
				System.out.println("V\t" + "F");
				System.out.println("F\t" + "V");
				
			}
			
		}else if(p.equals("p") & q.equals("q") & r.equals("")) {
			System.out.println("p\t" + "q");
			System.out.println("-\t" + "-");
			System.out.println("V\t" + "V");
			System.out.println("V\t" + "F");
			System.out.println("F\t" + "V");
			System.out.println("F\t" + "F");
		}else if(p.equals("p") & q.equals("q") & r.equals("r")) {
			System.out.println("p\t" + "q\t" + "r");
			System.out.println("-\t" + "-\t" + "-");
			System.out.println("V\t" + "V\t" + "V");
			System.out.println("V\t" + "V\t" + "F");
			System.out.println("V\t" + "F\t" + "V");
			System.out.println("V\t" + "F\t" + "F");
			System.out.println("F\t" + "V\t" + "V");
			System.out.println("F\t" + "V\t" + "F");
			System.out.println("F\t" + "F\t" + "V");
			System.out.println("F\t" + "F\t" + "F");
		}
		

	}

}
