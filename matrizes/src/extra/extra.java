package extra;

// Exercícios do material novo sobre matrizes

// programa que armazena o número de passageiros de onibus em um aeroporto.
//De segunda a sexta, o onibus busca 10 vezes os passageiros, porém no sábado, apenas duas.
//Vamos construir, usando matrizes, um programa que pegue esses 2 casos.

public class extra {

	public static void main(String[] args) {
		
		// Matriz bidimensional 
		
		int riders[] [] = new int[7][];
		
		//Aqui, as segundas dimensões tem 10 elementos
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		//Aqui, tem apenas 2 elementos

		riders[5] = new int[2];
		riders[6] = new int[2];
		
		int i, j;
		
		
		// forja alguns dados fictícios
		for(i=0; i < 5; i++)
		for(j=0; j < 10; j++)
		riders [i] [j] = i + j + 10;
		for(i=5; i < 7; i++)
		for(j=0; j < 2; j++)
		riders [i] [j] = i + j + 10;
		
	    System.out.println("Passageiros por viagem durante a semana: ");
	    
	    for(i=0; i < 5; i++) {
	    	for(j = 0; j < 2; j++)
	    		System.out.print(riders [i] [j] + " ");
	    	System.out.println();
	    }
	    System.out.println();
	    
	    System.out.println("Passageiros por viagem durante o fim de semana: ");
		
		for(i = 5; i < 7; i++) {
			for(j = 0; j < 2; j++)
				System.out.print(riders[i] [j] + " ");
			System.out.println();
		}
		

	}

}
