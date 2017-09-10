package easy;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem102 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			int[] bin1 = new int[3];
			int[] bin2 = new int[3];
			int[] bin3 = new int[3];
			
			
			bin1[0] = input.nextInt();
			bin1[1] = input.nextInt();
			bin1[2] = input.nextInt();
			bin2[0] = input.nextInt();
			bin2[1] = input.nextInt();
			bin2[2] = input.nextInt();
			bin3[0] = input.nextInt();
			bin3[1] = input.nextInt();
			bin3[2] = input.nextInt();
			
			
			int BGC = bin2[0] + bin3[0] + bin1[1] + bin3[1] + bin1[2] + bin2[2];
			int BCG = bin2[0] + bin3[0] + bin1[2] + bin3[2] + bin1[1] + bin2[1];
			
			int GBC = bin2[1] + bin3[1] + bin1[0] + bin3[0] + bin1[2] + bin2[2];
			int GCB = bin2[1] + bin3[1] + bin1[2] + bin3[2] + bin1[0] + bin2[0];
			
			int CBG = bin2[2] + bin3[2] + bin1[0] + bin3[0] + bin1[1] + bin2[1];
			int CGB = bin2[2] + bin3[2] + bin1[1] + bin3[1] + bin1[0] + bin2[0];
			
			UtilClass element1 = new UtilClass("BGC", BGC);
			UtilClass element2 = new UtilClass("BCG", BCG);
			UtilClass element3 = new UtilClass("GBC", GBC);
			UtilClass element4 = new UtilClass("GCB", GCB);
			UtilClass element5 = new UtilClass("CBG", CBG);
			UtilClass element6 = new UtilClass("CGB", CGB);
			
			List<UtilClass> list = new ArrayList<>();
			list.add(element1);
			list.add(element2);
			list.add(element3);
			list.add(element4);
			list.add(element5);
			list.add(element6);
			Collections.sort(list, new DemoComparator());
			
//			System.out.println("BGC = " +BGC);
//			System.out.println("BCG = " +BCG);
//			System.out.println("GBC = " +GBC);
//			System.out.println("GCB = " +GCB);
//			System.out.println("CBG = " +CBG);
//			System.out.println("CGB = " +CGB);
//			System.out.println("===================");
			System.out.println(list.get(0).getmString()+" "+list.get(0).getValue());
		}
		
		
		
		input.close();
	}

}

class UtilClass {
	private String mString;
	private int value;
	
	public UtilClass(String mString, int value) {
		this.mString = mString;
		this.value = value;
	}

	public String getmString() {
		return mString;
	}

	public void setmString(String mString) {
		this.mString = mString;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class DemoComparator implements Comparator<UtilClass> {
	@Override
	public int compare(UtilClass obj1, UtilClass obj2) {
		if(obj1.getValue()<obj2.getValue()) {
			return -1;
		} else if( obj1.getValue() == obj2.getValue() ) {
			return obj1.getmString().compareTo(obj2.getmString());
		} else {
			return 1;
		}
	}
}