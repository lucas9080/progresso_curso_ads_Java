package stud;

public class pdfmatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Doc de matrizes do sigaa

				

				//int[][] matrizes = new int[linha][coluna]

				

				int[][] mtrz = new int[3][3];

				

				mtrz[0][0] = 1;

				mtrz[0][1] = 2;

				mtrz[0][2] = 3;

				mtrz[1][0] = 4;

				mtrz[1][1] = 5;

				mtrz[1][2] = 6;

				mtrz[2][0] = 7;

				mtrz[2][1] = 8;

				mtrz[2][2] = 9;

				

				// O código acima é basicamente assim, se for printado:

				

					//linha 1: 0		0		0

					//linha 2: 0		0		0

					//linha 3: 0		0		0

						 //Col 1    //Coluna 2//Col 3

				

				/*	for(int i = 0; i < 3; i++) { //Itera sobre as linhas

						for(int j = 0; j < 3; j++) { //Itera sobre as colunas

							System.out.print(mtrz[i][j] + " ");

						}

						System.out.println();

					}
					*/
					// Inicialização explicita
					//matriz de 2 linha e 3 colunas
					
					int expmatriz[][] = {{1,2,3}, {4,5,5}};
					
					for(int i = 0; i < 2; i++) {
						for(int j = 0; j < 3; j++) {
							System.out.print(expmatriz[i][j] + " ");
						}
						System.out.println();
					}
	}

}
