package javaprograms;
import java.util.*;

public class ReverseNUm {
	public static void main(String[] args) {
		int sum=0,r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Entered number is: "+n);
		
		if(n<=9) 
			System.out.println(n);
		else
			for(r=0;n!=0;n/=10) {
				r = n%10;
				sum = sum*10 +r;
				
			}
		System.out.println("Reversed number is:"+sum);
		
	}

}
