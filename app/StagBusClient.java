package app;
 
import linkedList.*;
import queue.*;
import stack.*;

public class StagBusClient {

	public static void main(String[] args) {

		System.out.println("-----L I S T  T E S T------");
		
		LinkedListTester llTester = new LinkedListTester();
		llTester.runTests();
 		

		System.out.println("-----S T A C K  T E S T------");

		StackTester stackTester = new StackTester();
		stackTester.runTests();
		

		System.out.println("----Q U E U E  T E S T-------");
		
		QueueTester queueTester = new QueueTester();
		queueTester.runTests();
		
	}
	
}
