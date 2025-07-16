import java.util.Scanner;
public class palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to find palindrome:");
		int n=sc.nextInt();
		int temp=n;
		int m=0;int rev=0;
		while(n!=0)
		{
		    m=n%10;
		    rev=rev*10+m;
		    n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}
