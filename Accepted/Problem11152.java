package easy;

import java.util.Scanner;

public class Problem11152 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double s = (a+b+c)/2.0;
			double areaOfTriangle = Math.sqrt(s*(s-a)*(s-b)*(s-c));			
			double circumCircleRadius = (a*b*c)/(4.0*areaOfTriangle);
			double circumCircleArea = Math.PI * (circumCircleRadius*circumCircleRadius);
			double innerCircleRadius = Math.sqrt((s-a)*(s-b)*(s-c)/s);
			double areaOfInnerCircle = Math.PI * (innerCircleRadius*innerCircleRadius);
			double sunflowerArea = circumCircleArea - areaOfTriangle;
			double violetsArea = areaOfTriangle - areaOfInnerCircle;

			System.out.printf("%.4f %.4f %.4f\n", sunflowerArea, violetsArea, areaOfInnerCircle);
		}
		input.close();

	}

}
