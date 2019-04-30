
import java.util.Scanner;

public class LumberjackSequencing {

    public static void main(String[] args0) {
        System.out.println("Lumberjacks:");
        //firstApproach();
        secondApproach();
    }

    private static void firstApproach() {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while( testCase != 0 ) {
            int[] numbers = new int[10];
            boolean isAsc = false;
            boolean isDesc = false;
            for(int i=0; i<10; i++){
                numbers[i] = input.nextInt();
            }

            for(int i=0; i<9; i++){
                if( numbers[i] <  numbers[i+1] ) {
                    isAsc = true;
                } else {
                    isDesc = true;
                }
            }

            //if(isAsc && isAsc)
            showResult(!(isAsc && isDesc));
            testCase--;
        }
        input.close();
    }

    private static void secondApproach() {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while( testCase != 0 ) {
            int[] numbers = new int[10];
            boolean isAsc = true;

            for(int i=0; i<10; i++){
                numbers[i] = input.nextInt();
            }

            int firstNumber = numbers[0];
            int secondNumber = numbers[1];

            if(firstNumber>secondNumber) {
                isAsc = false;
            }
            if( isAsc ) {
                int lastNumber = Integer.MIN_VALUE;
                boolean isOrdered = true;
                for(int i=0; i<numbers.length; i++ ) {
                    int currentNumber = numbers[i];
                    if(currentNumber > lastNumber) {
                        lastNumber = currentNumber;
                    } else {
                        isOrdered = false;
                    }
                }
                showResult(isOrdered);
            } else {
                int lastNumber = Integer.MAX_VALUE;
                boolean isOrdered = true;
                for(int i=0; i<numbers.length; i++ ) {
                    int currentNumber = numbers[i];
                    if(currentNumber <= lastNumber) {
                        lastNumber = currentNumber;
                    } else {
                        isOrdered = false;
                    }
                }
                showResult(isOrdered);
            }
            testCase--;
        }
        input.close();
    }
    private static void showResult(boolean isOrdered) {
        if(isOrdered) {
            System.out.println("Ordered");
        }else {
            System.out.println("Unordered");
        }
    }
}