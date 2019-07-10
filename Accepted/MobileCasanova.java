import java.util.Scanner;

public class MobileCasanova {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int counter = 0;
        while(testCase != 0) {
            counter++;
            System.out.println("Case "+counter+":");
            int previousNumber = input.nextInt();
            int diffCounter = 0;

            if(testCase == 1) {
                System.out.println("0"+previousNumber);
            } else {

                for(int i=2; i<=testCase; i++) {
                    int currentNumber = input.nextInt();
                    if(i==testCase) {
                        int m = currentNumber;
                    }
                    if( (currentNumber-previousNumber) > 1 ){

                        if(diffCounter == 0) {
                            System.out.println("0"+previousNumber);
                        }  else {
                            printResult(previousNumber, diffCounter);
                        }
                        diffCounter = 0;

                        if(diffCounter == 0 && i==testCase) {
                            System.out.println("0"+currentNumber);
                        }

                        previousNumber = currentNumber;

                    } else if( (currentNumber-previousNumber) == 1 ) {
                        diffCounter++;
                        previousNumber = currentNumber;

                        if(i==testCase) {
                            printResult(previousNumber, diffCounter);
                        }
                    }
                }
            }
            testCase = input.nextInt();
            if(testCase != 0) {
                System.out.println();
            }
        }
        System.out.println();
        input.close();
    }

    private static void printResult(int previousNumber, int diffCounter) {
        StringBuffer sb = new StringBuffer();
        int startingPosition = previousNumber-diffCounter;
        String startingPositionStr = ""+startingPosition;
        String endStr = ""+previousNumber;
        int length = startingPositionStr.length();
        int x=0;
        checkLoop:
        for(x=0; x<length; x++) {
            if(startingPositionStr.charAt(x) != endStr.charAt(x)) {
                break checkLoop;
            }
        }

        for(int j=x; j<length; j++) {
            sb.append(endStr.charAt(j));
        }
        System.out.println("0"+startingPosition+"-"+ sb.toString());
        input.nextLine();
    }

}
