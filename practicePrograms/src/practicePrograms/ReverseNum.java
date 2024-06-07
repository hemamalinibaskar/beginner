package practicePrograms;
import java.util.*;

public class ReverseNum {
	public static void main(String[] args) {
		int n,reverse=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		if(n<=9 && n>=0)
			System.out.println(n);
		else {
			while(n!=0) {
				r = n%10;
				reverse = reverse*10+ r;
				
				n =n/10;
			}
			System.out.println(reverse);
		}
		
	}

}
