package practicePrograms;
import java.util.*;

public class LongSumofDigits {
	public static void main(String[] args) {
		long temp,sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		long num = sc.nextLong();
		
		
		
		for(sum=0;num>0;num=num/10) {
			sum += num%10;
		}
		System.out.println("Sum of Digits: "+sum);
		
	}

}
