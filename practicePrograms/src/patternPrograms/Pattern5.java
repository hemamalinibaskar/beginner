package patternPrograms;

public class Pattern5 {
	public static void main(String args[]) {
		int n = 5;
		for(int i=1;i<2*n;i++) {
			int totalcol = i > n? 2 * n -i:i;
			for(int j=1;j<=totalcol;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
