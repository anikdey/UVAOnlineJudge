package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoansomeCarBuyer {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int months = 0;
		double downPayment = 0;
		double loanAmount = 0;
		double actualPriceOfCar = 0;
		double dueLoanAmount = 0;
		double monthlyPayment = 0;
		int records = 0;
		
		
		while(true) {
			String line = reader.readLine();
			String[] initValues = line.split(" ");
			months = Integer.parseInt(initValues[0]);
			if(months<0)
				break;
		
			int targetMonth = 0;
			
			downPayment = Double.parseDouble(initValues[1]);
			loanAmount = Double.parseDouble(initValues[2]);
			monthlyPayment = loanAmount / months;
			actualPriceOfCar = downPayment + loanAmount;
			dueLoanAmount = loanAmount;
			records = Integer.parseInt(initValues[3]);
			int sequenceNumberOfPreviousMonth = 0;
			double rateCalculatedForPreviousMonth = 0;
			double marketValueOfCar = 0;
			
			boolean foundAnswer = false;
			recordsBreak:
			while(records != 0 ) {
				String[] values = reader.readLine().split(" ");
				int sequenceNumberOfMonth = Integer.parseInt(values[0]);
				double rateOfDepriciation = Double.parseDouble(values[1]);
				
				double rateCalculatedForCurrentMonth = rateOfDepriciation;
				
				if( sequenceNumberOfMonth == 0 ) {
					sequenceNumberOfPreviousMonth = 0;
					marketValueOfCar = actualPriceOfCar - (actualPriceOfCar*rateCalculatedForCurrentMonth);
					rateCalculatedForPreviousMonth = rateCalculatedForCurrentMonth;
					sequenceNumberOfPreviousMonth = 0;
					if( marketValueOfCar > dueLoanAmount && foundAnswer == false ) {
						foundAnswer = true;
						showAnswer(targetMonth);
					}
				} else {
					int differenceOfYears = sequenceNumberOfMonth - (sequenceNumberOfPreviousMonth + 1);
					if( differenceOfYears > 0 ) {
						while( differenceOfYears != 0 ) {
							marketValueOfCar = marketValueOfCar - (marketValueOfCar*rateCalculatedForPreviousMonth);
							dueLoanAmount -= monthlyPayment;
							targetMonth++;
							if( marketValueOfCar > dueLoanAmount && foundAnswer == false ) {
								foundAnswer = true;
								showAnswer(targetMonth);
							}
							differenceOfYears--;
						}
					}
					marketValueOfCar = marketValueOfCar - (marketValueOfCar*rateCalculatedForCurrentMonth);
					dueLoanAmount -= monthlyPayment;
					targetMonth++;
					if( marketValueOfCar > dueLoanAmount && foundAnswer == false) {
						foundAnswer = true;
						showAnswer(targetMonth);
					}
					rateCalculatedForPreviousMonth = rateCalculatedForCurrentMonth;
					sequenceNumberOfPreviousMonth = sequenceNumberOfMonth;
				}
				records--;
				
				if( records == 0 && foundAnswer == false ) {
					for(int i=sequenceNumberOfMonth+1; i<=months; i++) {
						targetMonth++;
						marketValueOfCar = marketValueOfCar - (marketValueOfCar*rateCalculatedForPreviousMonth);
						dueLoanAmount -= monthlyPayment;
						if( marketValueOfCar > dueLoanAmount && foundAnswer == false ) {
							foundAnswer = true;
							showAnswer(targetMonth);
							break recordsBreak;
						}
					}
				}
			}
		
		}
	}
	
	private static void showAnswer(int counter) {
		if( counter == 1 ) {
			System.out.println(counter+" month");
		} else {
			System.out.println(counter+" months");
		}
	}

}
