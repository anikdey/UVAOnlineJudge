package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem11462 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n!=0) {
			ArrayList<Integer> list = new ArrayList<>(n);
			for(int i=0; i<n; i++) {
				list.add(input.nextInt());
			}
			Collections.sort(list);
			
			for(int i=0; i<n; i++) {
				if(i!=n-1) {
					System.out.print(list.get(i)+" ");	
				} else {
					System.out.print(list.get(i));	
				}
			}
			System.out.println();
			n = input.nextInt();
		}
		input.close();
	}

}
