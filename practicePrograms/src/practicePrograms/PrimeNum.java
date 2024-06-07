package practicePrograms;
import java.util.*;

public class PrimeNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i,j=0,k=0;
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		j = n/2;
		
		if(n==0||n==1) {
			System.out.println(n+" is not a prime number");
		}
		else {
			for(i=2;i<=j;i++) {
				if(n%i==0) {
					System.out.println(n+" is not a prime number");
					k=1;
					break;
				}
			}
		}
		if(k==0) {
			System.out.println(n+" is a prime number");
		}
	}
}
