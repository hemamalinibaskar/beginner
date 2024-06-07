package practicePrograms;
import java.util.*;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r, sum=0, temp;
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		temp = num;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
		
	}

}
