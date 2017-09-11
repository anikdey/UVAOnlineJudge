package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Problem10336 {

	static int[][] visited;
	static char[][] maze;
	static int[][] matrix = new int[4][2];
	
	public static void main(String[] args) {
		initializeMatrix();
		Scanner input = new Scanner(System.in);
		int hRows = 0; int wCols = 0;
		int testCase = input.nextInt();
		int counter = 0;
		while(testCase>0) {
			
			counter++;
			hRows = input.nextInt();
			wCols = input.nextInt();
			
			HashMap<String, Integer> map = new HashMap<>();
			
			maze = new char[hRows][wCols];
			visited = new int[hRows][wCols];
			
			input.nextLine();
			for(int i=0; i<hRows; i++) {
				String temp = input.nextLine();
				for(int x=0; x<wCols; x++) {
					maze[i][x] = temp.charAt(x);
				}
			}
			
			for(int i=0; i<hRows; i++) {
				for(int x=0; x<wCols; x++) {
					if( visited[i][x] == 0 ) {
						visited[i][x] = 0;
						char ch = maze[i][x];
						String string = new String(""+ch);
						if(map.containsKey(string)) {
							Integer prev = map.get(string);
							prev++;
							map.put(string, prev);
						} else {
							map.put(string, 1);
						}
						dfs(i,x,hRows,wCols,ch);
					}
				}
			}
			
			ArrayList<LanguageAppearence> list = new ArrayList<>();
			
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				LanguageAppearence element = new LanguageAppearence(entry.getKey(), entry.getValue());
				list.add(element);
			}
			System.out.println("World #"+counter);
			Collections.sort(list, new LanguageAppearenceComparator());
			for(LanguageAppearence element : list) {
				System.out.println(element.getmString()+": "+element.getFrequency());
			}
			
			testCase--;
		}

		input.close();
	}

	private static void dfs(int x, int y, int hRows, int wCols, char ch) {
		
		for(int i=0; i<4; i++) {
			int newX = x + matrix[i][0];
			int newY = y + matrix[i][1];
			
			if( newX<0 || newX>=hRows || newY<0 || newY>=wCols ) {
				continue;
			}
			
			if( visited[newX][newY] == 0 && maze[newX][newY] == ch ) {
				visited[newX][newY] = 1;
				dfs(newX, newY, hRows, wCols, ch);
			}	
		}
	}
	
	
	private static void initializeMatrix() {
		matrix[0][0] = 0;  matrix[0][1] = 1;
		matrix[1][0] = 1;  matrix[1][1] = 0;
		matrix[2][0] = -1;  matrix[2][1] = 0;
		matrix[3][0] = -0;  matrix[3][1] = -1;
	}
	
}

class LanguageAppearence{
	private String mString;
	private int frequency;
	
	public LanguageAppearence(String mString, int frequency) {
		this.mString = mString;
		this.frequency = frequency;
	}

	public String getmString() {
		return mString;
	}

	public void setmString(String mString) {
		this.mString = mString;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
}
class LanguageAppearenceComparator implements Comparator<LanguageAppearence> {

	@Override
	public int compare(LanguageAppearence obj1, LanguageAppearence obj2) {
		if(obj1.getFrequency()<obj2.getFrequency()) {
			return 1;
		} else if( obj1.getFrequency() == obj2.getFrequency() ) {
			return obj1.getmString().compareTo(obj2.getmString());
		} else {
			return -1;
		}
	}
	
}