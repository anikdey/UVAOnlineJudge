import java.util.Scanner;
import static java.lang.Integer.*;

public class Problem352 {

	static int[][] maze;
	static int[][] visited;
	static int[][] matrix = new int[8][2];
	
	public static void main(String[] args) {
		initializeMatrix();
		int mazeSize = 0; 
		Scanner input = new Scanner(System.in);
		int imageNumber = 0;
		while(input.hasNext()) {
			imageNumber++;
			String sizeInString = input.nextLine().trim();
			mazeSize = parseInt(sizeInString);
			maze = new int[mazeSize][mazeSize];
			visited = new int[mazeSize][mazeSize];

			for(int i=0; i<mazeSize; i++) {
				String temp = input.nextLine().trim();
				for(int x=0; x<mazeSize; x++) {
					maze[i][x] = parseInt(""+temp.charAt(x));
				}
			}
			int warEagle = 0;
			for(int i=0; i<mazeSize; i++) {
				for(int x=0; x<mazeSize; x++) {
					if( visited[i][x] == 0 && maze[i][x] == 1 ) {
						visited[i][x] = 1;
						warEagle++;
						dfs(i,x, mazeSize);
					}
				}
			}
			
			System.out.println("Image number "+imageNumber+" contains "+warEagle+" war eagles.");
		}
		
		input.close();
	}
	
	private static void dfs(int x, int y, int mazeSize) {
		for(int i=0; i<8; i++) {
			int newX = x + matrix[i][0];
			int newY = y + matrix[i][1];
			
			if( newX<0 || newX>= mazeSize || newY < 0 || newY>=mazeSize ) {
				continue;
			}
			if( maze[newX][newY] == 1 && visited[newX][newY] == 0 ) {
				visited[newX][newY] = 1;
				dfs(newX, newY, mazeSize);
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
