package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Problem10008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		int testCase = input.nextInt();
		input.nextLine();
		while( testCase >0 ) {
			String line = input.nextLine();
			int length = line.length();
			for(int i=0; i<length; i++) {
				String currentChar = new String(""+line.charAt(i));
				if(isLetter(currentChar)) {		
					String upperCaseString = currentChar.toUpperCase();
					if(map.containsKey(upperCaseString)) {
						Integer prev = map.get(upperCaseString);
						prev++;
						map.put(upperCaseString, prev);
					} else {
						map.put(upperCaseString, 1);
					}
				}
			}
			testCase--;
		}
		
		
		ArrayList<Appearence> list = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			Appearence element = new Appearence(entry.getKey(), entry.getValue());
			list.add(element);
		}
		Collections.sort(list, new AppearenceComparator());
		for(Appearence element : list) {
			System.out.println(element.getmString()+" "+element.getFrequency());
		}
		
		input.close();

	}
	
	private static boolean isLetter(String ch) {
		boolean result = false;
		String[] chars = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		charCheck:
		for(int i=0; i<26; i++) {
			if(chars[i].equalsIgnoreCase(ch)) {
				result = true;
				break charCheck;
			}
		}
		return result;
	}
	

}

class Appearence{
	private String mString;
	private int frequency;
	
	public Appearence(String mString, int frequency) {
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

class AppearenceComparator implements Comparator<Appearence> {

	@Override
	public int compare(Appearence obj1, Appearence obj2) {
		if(obj1.getFrequency()<obj2.getFrequency()) {
			return 1;
		} else if( obj1.getFrequency() == obj2.getFrequency() ) {
			return obj1.getmString().compareTo(obj2.getmString());
		} else {
			return -1;
		}
	}
	
}
