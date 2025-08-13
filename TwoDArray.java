import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int [][]matrix= new int[3][3];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of matrix(rows, columns):");
		int r=sc.nextInt();
		int c=sc.nextInt();

		System.out.println("Enter the matrix elements:");
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is...:");

		System.out.println();
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transpose of it is...");
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println();
		}
		System.out.println("Sum of matrix and its transpose...");
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				matrix[i][j]+=matrix[j][i];
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		}
	}



