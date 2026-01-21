package ThreadDemo;

class table   //Non synchronization
{
	synchronized public void printTable(int num)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
			
		   try {
			   Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
	public void fact(int num)
	{
		for(int i=1;i<=5;i++)
		{
			int fact=1;
			fact= fact * i;
			System.out.println(fact);
			
		   try {
			   Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
}

class MyThread1 extends Thread
{
	table t;
	public  MyThread1(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
		t.fact(3);
	}
}

class MyThread2 extends Thread
{
	table t;
	public  MyThread2(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class TestSynchronization {

	public static void main(String[] args) {
		table obj= new table();
		
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();

	}

}

