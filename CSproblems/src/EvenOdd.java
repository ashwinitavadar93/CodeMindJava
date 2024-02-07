import java.util.Scanner;

public class EvenOdd {
	
	//Take a input from user and check whether  number is even or Odd
	// % - 4%2 = 0  , 5%2 = 1, 10%4 = 2
	// Even - number%2 == 0
	
	public static void main(String[] args) {
		
		EvenOdd obj = new EvenOdd();
		obj.checkEvenOrOdd();
		
	}
	
	void checkEvenOrOdd() {
		
		System.out.println("Enter any number");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input%2 == 0) {
			System.out.println("Entered number is Even");
		} else {
			System.out.println("Entered number is Odd");
		}
		
	}

}
