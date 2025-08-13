import java.util.Scanner;
public class Array {
	public static void main(String args[])
	{
		int [] array= new int[10];
		try (Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the element");
			for(int i=0;i<10;i++)
			{
				array[i]=sc.nextInt();
			}
			System.out.println("\n");
			System.out.println(array.length);
			System.out.println("\n");
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]+"\t");
			}
			System.out.print("\n");
			for(int num:array)
			{
				System.out.print(num+"\t");
			}
			
		}
		int [] array1=new int[10];
		System.out.println();
		System.out.println("Elements in new array...:");
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			array1=array;
			System.out.print(array1[i]+"\t");
		}
	}

}
