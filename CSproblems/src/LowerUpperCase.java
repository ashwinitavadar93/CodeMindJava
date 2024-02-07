import java.util.Scanner;

public class LowerUpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		String str=sc.nextLine();
		System.out.println("\n Lower Case:"+str.toLowerCase());
//		System.out.println("Enter Character");
//		String str1=sc.nextLine();
		System.out.println("\n Upper Case:"+str.toUpperCase());
	}

}
