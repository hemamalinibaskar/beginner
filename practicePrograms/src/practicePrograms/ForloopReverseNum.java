package practicePrograms;
import java.util.*;


public class ForloopReverseNum {
	static int rev=0, r;
	public static int isReverse(int n) {
		
		if(n!=0) {
			r = n%10;
			rev = rev*10+r;
			isReverse(n/10);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int n;//reverse,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		System.out.println("Reversed Number is: "+isReverse(n));
		
		/*for(reverse=0;n!=0;n=n/10) {
			r = n%10;
			reverse = reverse*10+r;
		}
		System.out.println("Reversed Number is: "+reverse);*/
	}

}
