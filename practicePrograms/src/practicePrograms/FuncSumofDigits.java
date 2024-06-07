package practicePrograms;
import java.util.*;

public class FuncSumofDigits {
	static long printSum(long num) {
		int sum=0;
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		long num = sc.nextLong();
		
		System.out.println("The sum of digits of "+num+" is: "+printSum(num));
	}

}
