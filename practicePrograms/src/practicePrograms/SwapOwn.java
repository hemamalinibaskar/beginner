package practicePrograms;
import java.util.*;

public class SwapOwn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second Number: ");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Swapped First number value is: "+a);
		System.out.println("Swapped second number value is: "+b);
		
	}

}
