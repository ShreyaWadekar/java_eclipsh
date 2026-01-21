package ThreadDemo;

class Table1   //Non synchronization
{
	public void printTable(int num)
	{
		synchronized (this) 
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
			
		   try {
			   Thread.sleep(500);
		        }
		   catch (Exception e) 
		   {
			System.out.println(e);
		   }
		}
		}
		for(int j=1;j<=5;j++)
		{
			System.out.println("other calculation in printable method");
			try {
				   Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread3 extends Thread
{
	Table1 t;
	public  MyThread3(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

class MyThread4 extends Thread
{
	Table1 t;
	public  MyThread4(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class TestSynchronizationBlock {

	
	
	public static void main(String[] args) {
Table1 obj= new Table1();
		
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj);
		
		t1.start();
		t2.start();
	}

}
