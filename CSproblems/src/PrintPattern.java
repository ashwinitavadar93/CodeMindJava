import java.util.Scanner;

public class PrintPattern {
	
public static void main(String[] args) {
		
		PrintPattern obj = new PrintPattern();
		obj.printPattern();
		
	}
	
	void printPattern() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Line number");
		int line = sc.nextInt();
		
		for(int i = 1; i <= line; i++) {
			
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
