package ThreadDemo;

public class SetPriority extends Thread
{
	public void run() 
	{
		System.out.println("thread executing");
	}
	public static void main(String[] args) {
		SetPriority s1= new SetPriority();
		SetPriority s2= new SetPriority();
		SetPriority s3= new SetPriority();
		
		System.out.println(s1.getPriority());
		System.out.println(s2.getPriority());
		System.out.println(s3.getPriority());
		
		s2.setPriority(MAX_PRIORITY);
		System.out.println(s2.getPriority());
		s2.setPriority(8);
		System.out.println(s2.getPriority());
		s1.start();
		s2.start();
		s3.start();
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(MAX_PRIORITY);
	}

}
