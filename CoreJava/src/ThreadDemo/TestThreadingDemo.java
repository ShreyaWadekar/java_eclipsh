package ThreadDemo;

public class TestThreadingDemo  implements Runnable
{

	public void run()
	{
		System.out.println("thread is running..");
	}
	public static void main(String[] args) 
	{
		Runnable r= new TestThreadingDemo();
		Thread t2= new Thread(r,"My Thread 1");
		t2.start();
		System.out.println(t2.getName());
	}

}
