package vetores;
import java.util.*;

public class sequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cod = new Scanner(System.in);
		int numSeq = 0;
		
		System.out.println("Digite os números da sequência: ");
		numSeq = cod.nextInt();
		int[] num = new int[numSeq];
		
		
		int res = 0;
		for(int i = 0; i < num.length; i++) {
			numSeq = num[i] + i;
			res = num[i] + i + 1;
			System.out.println(res);
			
			
			
		}
		
		System.out.println(res);
		
		
		int numList = 0;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite o "+ (i + 1) +"° número: ");
			 numList = cod.nextInt();
			 numList += numList;
			
		}
		
		int result = 0;
		
		
		
		////if(numList < res) {
		
		///}
	
		

	}

}
