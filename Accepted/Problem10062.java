package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem10062 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isFirstTime = true;
		while(input.hasNext()) {
			
			String userInput = input.nextLine();
			int length = userInput.length();
			
			HashMap<Integer, Integer> map = new HashMap<>();
			
			for(int i=0; i<length; i++) {
				int asci = (int)userInput.charAt(i);
				if(map.containsKey(asci)) {
					Integer prev = map.get(asci);
					prev++;
					map.put(asci, prev);
				} else {
					map.put(asci, 1);
				}
			}
			
			ArrayList<Element> list = new ArrayList<>();
			if(isFirstTime) {
				isFirstTime = false;
			} else {
				System.out.println();
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				Element element = new Element(entry.getKey(), entry.getValue());
				list.add(element);
			}
			Collections.sort(list, new MyComparator());
		
			for(Element element : list) {
				System.out.println(element.getElem()+" "+element.getFrequency());
			}
		}
		input.close();
	}
}


class Element {
	private int elem;
	private int frequency;
	
	public Element(int elem, int frequency) {
		this.elem = elem;
		this.frequency = frequency;
	}

	public int getElem() {
		return elem;
	}

	public void setElem(int elem) {
		this.elem = elem;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
}

class MyComparator implements Comparator<Element>{

	@Override
	public int compare(Element obj1, Element obj2) {
		
		if(obj1.getFrequency()<obj2.getFrequency()) {
			return -1;
		} else if( obj1.getFrequency() == obj2.getFrequency() ) {
			if(obj1.getElem() > obj2.getElem()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}
	
}



