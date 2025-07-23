import java.util.Scanner;
public class Grade {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your mark");
		int marks=sc.nextInt();
		System.out.println("Your name:"+name);
		if (marks>=90)
		{
			System.out.println("Your got an A grade");
			
		}
		else if(marks>=80)
		{
				System.out.println("You got an B grade");
		}
		else if(marks>=70)
		{
			System.out.println("You got an C grade");
		}
		else if(marks>=60)
		{
			System.out.println("You got an D grade");
		}
		else if(marks>=50)
		{
			System.out.println("You got an E grade");
		}
		else if(marks>=40)
		{
			System.out.println("You Passed");
		}
		else 
		{
			System.out.println("You Failed");
		}
		}
}
