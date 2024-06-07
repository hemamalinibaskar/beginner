package practicePrograms;
import java.util.*;

public class NonegReverse {
	static int reverse(int n) {
		boolean noNeg = n<0?true:false;
		if(noNeg)
			n *= -1;
		int rev=0,r;
		while(n!=0) {
			r = n%10;
			rev = rev*10 +r;
			n = n/10;
		}
		return noNeg == true? rev*-1:rev;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		System.out.println("Reversed Number: "+reverse(n));
		
	}

}
