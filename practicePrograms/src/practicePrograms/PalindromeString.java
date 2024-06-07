package practicePrograms;
import java.util.*;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String real, reverse="";
		
		System.out.print("Enter the String: ");
		real = sc.nextLine();
		
		int length = real.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse = reverse+real.charAt(i);
		}
		
		if(real.equals(reverse))
			System.out.println(real+" is a Palindrome");
		else
			System.out.println(real+" is not a palindrome");
	}

	

}
