package practicePrograms;
import java.util.*;
import java.lang.Math;

public class ArmstrongSinglenum {
	static boolean printArmstrong(int n) {
		int temp,digits=0,sum=0,last=0;
		temp = n;
		while(temp>0) {
			temp = temp/10;
			digits++;
		}
		temp = n;
		while(temp>0) {
			last=temp%10;
			sum += (Math.pow(last, digits));
			temp=temp/10;
		}
		if(n==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(printArmstrong(num))
			System.out.println(num+" is ArmStrong number");
		else
			System.out.println(num+" is not an ArmStrong number");
		
	}

}
