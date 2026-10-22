package extras;
import java.util.*;

public class matrizes {
	
	//1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m = new int[4][4];
		
		Scanner cod = new Scanner(System.in);

		System.out.println("Digite um número: ");
	
		for(int i = 0; i < 4; i++) {//linhas
			for(int j = 0; j < 4; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
