package inheritance;

interface Payment
{
	public void paymentProcess(double amount);
}

interface Notification
{
	public void sendNotification(String msg);
}

class OnlineOrder implements Payment, Notification
{
	public void paymentProcess(double amount)
	{
		System.out.println("Payment of "+amount + " payment successfully");
	}
	public void sendNotification(String msg)
	{
		System.out.println("Notification sent : "+msg);
	}
}

public class OnllinePayment {

	public static void main(String[] args) {
		OnlineOrder order=new OnlineOrder();
		order.paymentProcess(1500.00);
		order.sendNotification("Order has been Placed");
		order.sendNotification("Payment has been seccessfully");

	}

}
