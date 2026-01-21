package FileHandling;

import java.io.Console;

public class ConsolReadTest {

	public static void main(String[] args) {

		Console c = System.console();
		if (c == null) {
		    System.out.println("Console not available");
		    return;
		}

		System.out.println("Enter your name : ");
		String name = c.readLine();
		System.out.println("Thank you " + name);
	}

}
