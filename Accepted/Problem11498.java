import java.util.Scanner;

public class Problem11498 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while( testCase != 0 ) {
			int n = input.nextInt();
			int m = input.nextInt();
			for( int i=1; i<=testCase; i++) {
				int x = input.nextInt();
				int y = input.nextInt();
				if( n==x || m==y ) {
					System.out.println("divisa");
				} else if( x>n && y>m ) {
					System.out.println("NE");
				} else if( x>n && y<m ) {
					System.out.println("SE");
				} else if( x<n && y<m ) {
					System.out.println("SO");
				} else if(x<n && y>m) {
					System.out.println("NO");
				}
			}
			testCase = input.nextInt();
		}
		input.close();
	}

}
