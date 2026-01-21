package ThreadDemo;

public class DemoThreadLifeCycle extends Thread
{
	public void run()
	{
		System.out.println("Running state");
	}
	public static void main(String[] args) {
		DemoThreadLifeCycle t = new DemoThreadLifeCycle();
		
		System.out.println("New(born) State :"+t.getState());
		t.start();
		System.out.println("Ready to execute State :"+t.getState());
		System.out.println("Execution State :"+t.getState());
		System.out.println("Dead State :"+t.getState());

	}

}
