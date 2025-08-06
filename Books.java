class Book
{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	final static String LIBRARY_NAME="Central library";
	public Book()
	{
		title="Unknown";
	    author="Unknown";
	    bookID=bookCounter++;
	}
	public Book(String title, String author)
	{
		this.title=title;
		this.author=author;
	    this.bookID=bookCounter;
	    bookCounter++;
	    
	}
	public void displayInfo(String title,String author,int bookID)
	{
		System.out.println("Book Title : "+title);
		System.out.println("Authour of book : "+author);
		System.out.println("Book ID : "+bookID);
		
	}
	public void displayinfo(boolean showLibrary)
	{
		if(showLibrary)
		{
			displayInfo(title,author,bookID);
			System.out.println("LIBRARY NAME : "+LIBRARY_NAME);
		}
	}
	public static void displayTotalBooks()
	{
		System.out.println("Total books : "+(bookCounter-1001));
	}
}
public class Books 
{
	public static void main(String args[])
	{
		Book b1=new Book();
		b1.displayinfo(true);
		Book.displayTotalBooks();
		Book b2=new Book("Atomic habit","George");
		b2.displayinfo(true);
		Book.displayTotalBooks();
		
	}
}
