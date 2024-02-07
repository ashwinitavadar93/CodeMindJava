import java.util.Scanner;

public class SumOfNaturalNumber {
	
	//Write a Program to Find sum of Natural number using while and For loop
	// till 10 - 1+2+3+4+5+6+7+8+9+10 = 55
	
	public static void main(String[] args) {
		SumOfNaturalNumber obj = new SumOfNaturalNumber();
		obj.findSumOfNaturalNumber();
	}
	
	void findSumOfNaturalNumber() {
		
		int i = 1;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a last numbe till you want sum");
		
		int num = sc.nextInt();
		
		while(i <= num) {
			sum = sum+i;  //sum +=i
			i++;
		}
		
		System.out.println("Sum of Natural number is-"+sum);
	}
}
