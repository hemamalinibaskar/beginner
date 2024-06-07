package practicePrograms;
import java.util.*;

public class FibWithRecur {
	static int i1 =0,i2=1,i3=0;
	static void printCount(int count) {
		if(count>0) {
		i3 = i1+i2;
		System.out.print(" "+i3);
		i1 = i2;
		i2 = i3;
		printCount(count-1);
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Fibonacci Count: ");
		int count = sc.nextInt();
		System.out.print(i1+" "+i2);
		printCount(count-2);
		
		
		
	}

}
