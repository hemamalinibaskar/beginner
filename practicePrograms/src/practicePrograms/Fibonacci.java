package practicePrograms;
import java.util.*;

public class Fibonacci {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int i1 =0,i2 =1,i3;
		System.out.print("Enter the count: ");
		int count = sc.nextInt();
		
		System.out.print(i1+" "+i2);
		for(int i=2;i<count;++i) {
			i3 = i1+i2;
			System.out.print(" "+i3);
			i1 =i2;
			i2 =i3;
		}
	}

}
