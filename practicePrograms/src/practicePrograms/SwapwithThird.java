package practicePrograms;
import java.util.*;

public class SwapwithThird {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, z;
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		
		System.out.println("Before swapping 1st val is: "+a+" & 2nd val is:"+ b);
		
		z = a;
		a = b;
		b = z;
		
		System.out.println("After swapping 1st val is: "+a+" & 2nd val is:"+ b);
		 
	}

}
