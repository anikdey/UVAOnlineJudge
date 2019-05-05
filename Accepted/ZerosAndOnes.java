import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZerosAndOnes {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        while (true) {
            String line = reader.readLine();
            if( line == null || line.isEmpty() ) {
                break;
            }

            counter++;
            System.out.println("Case "+counter+":");

            int testCase = Integer.parseInt(reader.readLine());
            while (testCase != 0){
                String[] numberString = reader.readLine().split(" ");
                int firstNumber = Integer.parseInt(numberString[0]);
                int secondNumber = Integer.parseInt(numberString[1]);
                if(firstNumber>secondNumber) {
                    processInput(line, secondNumber, firstNumber);
                } else {
                    processInput(line, firstNumber, secondNumber);
                }
                testCase--;
            }
        }
    }

    private static void processInput(String line, int from, int to) {
        boolean isSame = true;
        char charToCheck = line.charAt(from);
        checker:
        for( int index = from+1; index <= to; index++ ) {
            if( charToCheck != line.charAt(index) ){
                isSame = false;
                break checker;
            }
        }

        if(isSame) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
