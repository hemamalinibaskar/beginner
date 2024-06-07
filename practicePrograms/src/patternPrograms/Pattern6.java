package patternPrograms;

public class Pattern6 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<2*n;i++) {
			int totcol =i>n?2*n-i:i;
			for(int s=0;s<=n-totcol;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=totcol;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
