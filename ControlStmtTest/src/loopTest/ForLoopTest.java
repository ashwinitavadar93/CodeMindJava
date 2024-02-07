package loopTest;

public class ForLoopTest {
	
	public static void main(String[] args) {

		ForLoopTest obj = new ForLoopTest();
		obj.printTables();
		//obj.printNumberUsingWhile();
		//obj.printNumberUsingDoWhile();
		
	}
	
	
	
	void printNumberUsingDoWhile() {
		
		int i = 5;
		do {
			System.out.println(i);
			i--;
			//break;
		} while (i >= 1);
	}
	
	void printNumberUsingWhile() {
		
		int i = 1;
		
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("After While loop");
	}
	
	void printTables() {
		
		System.out.println("Table using extra varible");
		
		int j = 10;
		
		for(int k=1; k <= 10; k++) {
			if(k==5)
				continue;
			System.out.println(j*k);
		}
		
		System.out.println("Table using one variable");
		
		for(int i=5; i<= 50; i = i+5) {
			System.out.println(i);
		}
		
		System.out.println("Using Modulo Operator");
		
		for(int i=5; i <= 50; i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	void printNumber() {
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		
		/* for(initialization ; condition ; increament/decreament){
		
			//code 
		} */
		
		for(int i=5; i >= 1; i--) {
			
			System.out.println(i);
			
		}	
		
		System.out.println("Aftre For loop");
		
	}
}
