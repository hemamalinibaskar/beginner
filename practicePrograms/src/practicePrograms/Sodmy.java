package practicePrograms;
import java.util.*;

public class Sodmy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum=0;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		System.out.println("sum of numbers:"+sum);
	}

}
