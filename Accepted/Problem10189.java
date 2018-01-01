import java.util.Scanner;

public class Problem10189 {
	static char[][] maze;
	static int[][] visited;
	static int[][] matrix = new int[8][2];
	
	public static void main(String[] args) {
		initializeMatrix();
		int nRows = 0;
		int mCols = 0;
		Scanner input = new Scanner(System.in);
		nRows = input.nextInt();
		mCols = input.nextInt();
		int counter = 0;
		while( nRows != 0 && mCols != 0 ) {
			input.nextLine();
			counter++;
			maze = new char[nRows][mCols];
			StringBuffer[] output = new StringBuffer[nRows];
			
			for(int i=0; i<nRows; i++) {
				String temp = input.nextLine();
				for(int x=0; x<mCols; x++) {
					maze[i][x] = temp.charAt(x);
				}
			}

			for(int i=0; i<nRows; i++) {
				StringBuffer bf = new StringBuffer();
				for(int x=0; x<mCols; x++) {
					char currentChar = maze[i][x];
					if(currentChar == '*') {
						bf.append(currentChar);
						continue;
					} else {
						int numberOfAdjacentMine = calculateNumberOfAdjacentMine(maze, i, x, nRows, mCols);
						bf.append(numberOfAdjacentMine);
					}
				}
				output[i] = bf;
			}
			
			System.out.println("Field #"+counter+":");
			for(StringBuffer sb : output) {
				System.out.println(sb);
			}
			
			nRows = input.nextInt();
			mCols = input.nextInt();
			
			if( nRows != 0 && mCols != 0 ) {
				System.out.println();
			}
			
		}
	
		input.close();
	}

	
	private static int calculateNumberOfAdjacentMine(char[][] maze, int x, int y, int nRows, int mCols) {
		int counter = 0;
		for(int i=0; i<8; i++) {
			int newX = x + matrix[i][0];
			int newY = y + matrix[i][1];
			if( newX<0 || newX>=nRows || newY<0 || newY>=mCols ) {
				continue;
			}
			if( maze[newX][newY] == '*' ) {
				counter++;
			}
		}
		return counter;
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
