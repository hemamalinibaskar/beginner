package practicePrograms;
import java.util.*;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i,fact=1;
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		for(i=1;i<=num;i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
