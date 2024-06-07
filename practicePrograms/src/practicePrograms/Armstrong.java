package practicePrograms;
import java.util.*;
import java.lang.Math;

public class Armstrong {
	static boolean isArmstrong(int n) {
		int temp,sum=0,digits=0,last =0;
		temp = n;
		while(temp>0) {
			temp = temp/10;//removing the last digit
			digits++;//it will add it as digit
		}
		temp =n;//resetting the temp value to n
		while(temp>0) {
			last = temp%10;//getting the remainders as last digit
			sum += (Math.pow(last, digits));//based on the digits it will square it
			temp=temp/10;// again the temp value is removing the last digit after saved in last
		}
		if(n==sum)
			return true;//if the passed argument and processed number is same. return true
		else
			return false;//else false
			
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int first_num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the ending number: ");
		int last_num = sc.nextInt();
		
		System.out.println("List of Armstrong number from "+first_num+" to "+last_num+" is: ");
		
		for(int i=first_num;i<=last_num;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

}
