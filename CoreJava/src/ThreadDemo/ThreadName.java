package ThreadDemo;

public class ThreadName extends Thread
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadName t1= new ThreadName();
		ThreadName t2= new ThreadName();
		ThreadName t3= new ThreadName();
		
		
		System.out.println("name of thread t1 : "+t1.getName());
		System.out.println("name of thread t2 : "+t2.getName());
		System.out.println("name of thread t3 : "+t3.getName());
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setName("fortune");
		t2.setName("cload");
		t3.setName("technologies");
		System.out.println("name of thread t1 : "+t1.getName());
		System.out.println("name of thread t2 : "+t2.getName());
		System.out.println("name of thread t3 : "+t3.getName());
	}

}
