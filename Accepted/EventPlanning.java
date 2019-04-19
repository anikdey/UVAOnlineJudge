package introduction;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;
import java.util.StringTokenizer;  

public class EventPlanning {
	public static void main(String[] args) throws IOException {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
	
		while(true) {
			boolean canStay = false;
			String inputLine = reader.readLine();
			if( inputLine == null || inputLine.isEmpty() ) 
				break;
			
			StringTokenizer st = new StringTokenizer(inputLine);
			int numberOfPerson = Integer.parseInt(st.nextToken());
			int budget = Integer.parseInt(st.nextToken());
			int numberOfHotels = Integer.parseInt(st.nextToken());
			int numberOfWeeks = Integer.parseInt(st.nextToken());
			int minimumCost = Integer.MAX_VALUE;
			
			for(int i=1; i<=numberOfHotels; i++) {
				int priceForOnePerson = Integer.parseInt(reader.readLine());
				int totalCost = numberOfPerson * priceForOnePerson;
				String[] numberOfAvailableBeds = reader.readLine().split(" ");
				for(int x=0; x<numberOfWeeks; x++) {
					int beds = Integer.parseInt(numberOfAvailableBeds[x]);
					if( beds >= numberOfPerson) {
						if( minimumCost>totalCost )
							minimumCost = totalCost;
					}
				} 
			}
			if(minimumCost<=budget) {
				canStay = true;
			}
			
			if(canStay) {
				System.out.println(minimumCost);
			} else {
				System.out.println("stay home");
			}
		}
	}
}
