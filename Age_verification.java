import java.util.Scanner;
public class Age_verification
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        if(age<18)
        {
        	System.out.println("You are Minor");
        }
        else
        {
        	System.out.println("You are Adult");
        }
	}
}