package condicionais;
import java.util.*;


public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner menor = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		System.out.println("Diga o valor de x: ");
		x = menor.nextInt();
		
		System.out.println("Diga o valor de y: ");
		y = menor.nextInt();
		
		System.out.println("Diga o valor de z: ");
		z = menor.nextInt();
		
		if(x < y & x < z) {
			System.out.println("X é o menor valor!");
		}else if (y < z & y < x) {
			System.out.println("Y é o menor valor!");
		}else {
			System.out.println("Z é o menor valor!");
		}
		

	}

}
