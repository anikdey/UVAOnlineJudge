import java.util.Scanner;

public class Problem572 {

	static char[][] maze;
	static int[][] visited;
	static int[][] matrix = new int[8][2];
	
	public static void main(String[] args) {
		initializeMatrix();
		Scanner input = new Scanner(System.in);
		
		int mRows = 0;
		int nCols = 0;
		int myCounter = 0;
		
		mRows = input.nextInt();
		
		while( mRows != 0 ) {
			myCounter = 0;
			nCols = input.nextInt();
			input.nextLine();
			
			
			
			maze = new char[mRows][nCols];
			visited = new int[mRows][nCols];
			
			for(int i=0; i<mRows; i++) {
				String temp = input.nextLine();
				for(int x=0; x<nCols; x++) {
					maze[i][x] = temp.charAt(x);
				}
			}
			
			
			for(int i=0; i<mRows; i++) {
				for(int x=0; x<nCols; x++) {
					if( visited[i][x] == 0 && maze[i][x] == '@' ) {
						visited[i][x] = 1;
						myCounter++;
						dfs(i, x, mRows, nCols);
					}
				}
			}
			System.out.println(myCounter);
			mRows = input.nextInt();
		}
		
		input.close();
	}
	
	public static void dfs(int x, int y, int mRows, int nCols) {
		
		for(int i=0; i<8; i++) {
			int newX = x + matrix[i][0];
			int newY = y + matrix[i][1];
			
			if( newX<0 ||  newX>=mRows || newY<0 || newY>=nCols ) {
				continue;
			}
			
			if( visited[newX][newY] == 0 && maze[newX][newY] == '@' ) {
				visited[newX][newY] = 1;
				dfs(newX, newY, mRows, nCols);
			}
		}
		
		
	}
	
	private static void initializeMatrix() {
		matrix[0][0] = 0;  matrix[0][1] = 1;
		matrix[1][0] = 1;  matrix[1][1] = 0;
		matrix[2][0] = 1;  matrix[2][1] = 1;
		matrix[3][0] = -1;  matrix[3][1] = -1;
		matrix[4][0] = -1;  matrix[4][1] = 0;
		matrix[5][0] = 0;  matrix[5][1] = -1;
		matrix[6][0] = 1;  matrix[6][1] = -1;
		matrix[7][0] = -1;  matrix[7][1] = 1;
	}
	
}
