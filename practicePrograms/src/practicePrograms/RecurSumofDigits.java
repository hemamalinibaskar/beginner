package practicePrograms;
import java.util.*;

public class RecurSumofDigits {
	int st = 0;
	
	int sum(int n) {
		
		if(n!=0) {
		st += n%10;
		n=n/10;
		sum(n);
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecurSumofDigits sod = new RecurSumofDigits();
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println("Sum of digits of "+n+" is: "+sod.sum(n));
	}

}
