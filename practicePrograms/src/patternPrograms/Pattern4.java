package patternPrograms;

public class Pattern4 {
	public static void main(String args[]) {
		int n = 8;
		
		for(int i=1;i<=n;i++) {//i same numbers
			for(int j=1;j<=i;j++) {//j different numbers
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
