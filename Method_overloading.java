class Shape
{
	public int area(int a)
	{
		System.out.println("This is Square");
		return a*a;
	}
	public int area(int l,int b)
	{
		System.out.println("This is Rectangle");
		return l*b;
	}
	public float area(float r)
	{
		System.out.println("This is Circle");
		return 3.14f*r*r;
	}
}
public class Method_overloading
{

	public static void main(String[] args)
	{
		Shape s1=new Shape();
		System.out.println("Area of circle :"+s1.area(12.5f));
		System.out.println("\n");
		System.out.println("Area of Square :"+s1.area(12));
		System.out.println("\n");
		System.out.println("Area of Rectangle :"+s1.area(12,10));
}

}
