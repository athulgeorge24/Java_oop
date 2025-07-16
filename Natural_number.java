import java.util.Scanner;
public class Userinput 
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Natural Number Generator");
			System.out.println("Enter the limit");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				if(num<0)
				{
					System.out.println("Enter a valid limit");
				}
				else if(num==0)
				{
					System.out.println("limit cannot be zero");
				}
				else
				{
					System.out.println(i+" ");
				}
			}		
	}
}
