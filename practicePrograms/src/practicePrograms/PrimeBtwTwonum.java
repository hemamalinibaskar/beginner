package practicePrograms;
import java.util.Scanner;

public class PrimeBtwTwonum {
	public static boolean checkPrime(int n) {
		if (n<=1) {
			return false;
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter the last number: ");
		int lastNum = sc.nextInt();
		
		System.out.println("Prime numbers from "+ firstNum+ "to "+lastNum);
		
		for(int i=firstNum;i<=lastNum;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
			
		}
	}

}
