package ThreadDemo;

public class TestThreadClass extends Thread
{
	
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		TestThreadClass t = new TestThreadClass();
		t.start();
		t.run();
	}

}
