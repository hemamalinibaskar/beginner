package javaprograms;
import java.util.Random;

public class RandomObj {
	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(50);
		int s = random.nextInt(100);
		
		boolean b = random.nextBoolean();
		boolean j = random.nextBoolean();
		
		double d = random.nextDouble();
		double e = random.nextDouble();
		
		float f = random.nextFloat();
		float g = random.nextFloat();
		
		System.out.println("Random value of r is: "+r);
		System.out.println("Random value of s is: "+s);
		
		System.out.println("Random value of d is: "+d);
		System.out.println("Random value of e is: "+r);
		
		System.out.println("Random value of b is: "+b);
		System.out.println("Random value of j is: "+j);
		
		System.out.println("Random value of f is: "+f);
		System.out.println("Random value of g is: "+g);
		}

}
