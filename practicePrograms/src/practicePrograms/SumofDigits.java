package practicePrograms;
import java.util.*;


public class SumofDigits {
	public static void main(String[] args) {
		int temp,sum=0,last;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		temp = num;
		while(temp>0) {
			last=temp%10;
			sum+=last;
			temp/=10;
			
		}
		System.out.println(sum);
		
	}

}
