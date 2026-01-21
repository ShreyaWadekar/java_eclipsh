package ThreadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
	private String message;
	public WorkerThread(String message) 
	{
		this.message=message;
	}
	public void run() 
	{
		System.out.println(Thread.currentThread().getName() + " (start) message"+message);
		processmessage();
		
		System.out.println(Thread.currentThread().getName() + " (end) ");
	}
	private void processmessage()
	{
		try {
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

public class DemoThreadPool 
{

	public static void main(String[] args) {
		ExecutorService e1= Executors.newFixedThreadPool(5);
		for(int i=1;i<10;i++)
		{
			Runnable worker = new WorkerThread(" "+i);
			e1.execute(worker);
		}
		e1.shutdown();
		while(!e1.isTerminated()) {
		    // wait silently
		}
		System.out.println("All threads terminated");
	}

}
