class PaymentGateWay
{
	public void makePayment(String cardNumber,String expiryDay,int CVV)
	{
		System.out.println("Credit Card");
		System.out.println("Card Number : "+cardNumber);
		System.out.println("Expiry date : "+expiryDay);
		System.out.println("CVV : ***");
		System.out.println("Transaction Complete");
	}
	public void makePayment(String UPID)
	{
		System.out.println("UPI Payment");
		System.out.println("UPID : "+UPID);
		System.out.println("Transaction Complete");
	}
	public void makePayment(float amt)
	{
		System.out.println("Cash on Delivery");
		System.out.println("Amount : "+amt);
	}
	
}
public class ECommerceApp
{

	public static void main(String[] args)
	{
		PaymentGateWay p1=new PaymentGateWay();
		p1.makePayment("1232 3232 2342 6353","12/2050",123);
		System.out.println("\n");
		p1.makePayment("alphabeta23@oksbi");
		System.out.println("\n");
		p1.makePayment(69.99f);
	}

}
