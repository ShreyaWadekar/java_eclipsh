package ThreadDemo;

public class JoinMethod extends Thread{

	public void run() {
		for(int i=0;i<=4;i++)
		{
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoinMethod j1 = new JoinMethod();
		JoinMethod j2 = new JoinMethod();
		JoinMethod j3 = new JoinMethod();
		
		try {
			j1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		j1.start();
		j2.start();
		j3.start();
		

	}

}
