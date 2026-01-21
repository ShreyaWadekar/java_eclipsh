package ThreadDemo;

public class threadLifeCycle extends Thread
{
	public void run()
	{
		System.out.println("Running state : "+Thread.currentThread().getState());
	}
	public static void main(String[] args) {
		threadLifeCycle t= new threadLifeCycle();
		System.out.println("New(born) State :"+t.getState());
		t.start();
		System.out.println("Ready to execute State :"+t.getState());
		System.out.println("Execution State :"+t.getState());
		System.out.println("Dead State :"+t.getState());

	}

}
