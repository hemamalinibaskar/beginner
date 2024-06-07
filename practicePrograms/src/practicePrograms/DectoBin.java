package practicePrograms;
import java.util.*;

public class DectoBin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Binary value of "+num+" is: "+Integer.toBinaryString(num));
	}

}
