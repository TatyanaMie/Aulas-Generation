package VetorMatriz;

public class Exercicio3 {
	public static void main (String[] args) {
		
		int M1[][] = new int [4][6], M2[][] = new int [4][6], l, c = 0;
		int N1[][] = {{1,2,3,4,5,6},{7,8,9,1,2,3},{4,5,6,7,8,9},{1,2,3,4,5,6}};
		int N2[][] = {{1,2,3,4,5,6},{7,8,9,1,2,3},{6,5,4,3,2,1},{9,8,7,4,5,6}};
		
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				M1[l][c] = N1[l][c] + N2 [l][c];
				M2[l][c] = N1[l][c] - N2 [l][c];
			}
		}
		
		System.out.println("O resultado de M1 é:");
		for (l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print( M1[l][c] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("\n" + "O resultado de M2 é:");
		for (l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print( M2[l][c] + " ");
			}
			System.out.println("\n");
		}
		
		
	}
}
