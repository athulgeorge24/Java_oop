import java.util.Scanner;
class Student{
	String name;
	int roll_no;
	int m1,m2,m3;
	float avg;
Student(String name,int roll_no,int m1,int m2,int m3)
{
	this.name=name;
	this.roll_no=roll_no;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}
public void calcAvg()
{
	avg=(m1+m2+m3)/3;
}
public void display()
{
	System.out.println("Roll number : "+roll_no);
	System.out.println("Name : " +name);
	System.out.println("Mark 1 : "+m1+"\nMark 2 : "+m2+"\nMark 3 : "+m3);
	System.out.println("Average : "+avg);
}
Student(){
	
}

}
public class Student_new {
	public static void main(String[] args)
	{
		Student s1=new Student("Alpha",28,23,34,54);
		s1.calcAvg();
		s1.display();
		Student s2=new Student("Beta",12,64,32,65);
		s2.calcAvg();
		s2.display();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your roll no :\n");
		int roll_no= sc.nextInt();
		System.out.println("Enter your Name :\n");
		String name = sc.next();
		System.out.println("Enter your mark 1 :\n");
		int m1= sc.nextInt();
		System.out.println("Enter your mark 2 :\n");
		int m2= sc.nextInt();
		System.out.println("Enter your mark 3 :\n");
		int m3= sc.nextInt();
		Student s3=new Student();
		s3.name=name;
		s3.roll_no=roll_no;
		s3.m1=m1;
		s3.m2=m2;
		s3.m3=m3;
		s3.calcAvg();
		s3.display();
	}

}
