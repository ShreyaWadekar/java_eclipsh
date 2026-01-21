package ThreadDemo;

public class TwiceThread extends Thread
{
	public void run() 
	{
		System.out.println("Thread exception");
	}
	public static void main(String[] args) {
		TwiceThread t = new TwiceThread();
		t.start();
		t.start();

	}

}
