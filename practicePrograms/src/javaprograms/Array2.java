package javaprograms;
import java.util.*;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i =0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i =0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
