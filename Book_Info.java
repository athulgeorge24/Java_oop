import java.util.Scanner;

class Book
{
	String title;
	String author;
	double price;
	int qty;
	double total;
Book(String title,String author,double price,int qty)
{
	this.title=title;
	this.author=author;
	this.price=price;
	this.qty=qty;
}
public void totalprice()
{
	total=price*qty;
}
public void display()
{
	System.out.println("Book title : "+title);
	System.out.println("Author name : " +author);
	System.out.println("Price : "+price);
	System.out.println("Total Quantity : "+qty);
	System.out.println("Total Price : "+total);
}
Book()
{
	
}
}
public class Book_Info {
	public static void main(String[] args)
	{
		Book b1=new Book("Alpha","Beta",89.99,100);
		b1.totalprice();
		b1.display();
		System.out.println("\n");
		Book b2=new Book("Gamma","Omega",69.69,30);
		b2.totalprice();
		b2.display();
		System.out.println("\n");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Book name :\n");
		String title= sc.next();
		System.out.println("Enter Author name :\n");
		String author = sc.next();
		System.out.println("Enter Price of the Book :\n");
		double price= sc.nextDouble();
		System.out.println("Enter the total quantity of book :\n");
		int qty=sc.nextInt();
	
		Book b3=new Book();
		b3.title=title;
		b3.author=author;
		b3.price=price;
		b3.qty=qty;
		System.out.println("\n");
		b3.totalprice();
		b3.display();
	}

}
