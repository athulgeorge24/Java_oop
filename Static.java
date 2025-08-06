class Student
{
	String name;
	static int studentCount = 0;
	 	
	public Student(String name)
	{
        this.name=name;
        studentCount++;
	}
	public static int getStudentCount() 
	{
        return studentCount;
	}
	public void display()
	{
		System.out.println("Student name :"+ name);
	}
}
public class Static
{
	public static void main(String args[])
	{
	Student s1=new Student("Tippu");
	s1.display();
    System.out.println("total number of students:"+Student.getStudentCount());
	Student s2=new Student("Athul");
	s2.display();
    System.out.println("total number of students:"+Student.getStudentCount());
	Student s3=new Student("Beta");
	s3.display();
    System.out.println("total number of students:"+Student.getStudentCount());
	}
}
