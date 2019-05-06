import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainTracks {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        while (testCase != 0) {
            String line = reader.readLine().trim();
            int length = line.length();

            if(length == 2) {
                System.out.println("NO LOOP");
                testCase--;
                continue;
            }

            int maleCounter = 0;
            int femaleCounter = 0;
            for(int i=0; i<length; i++) {
                char currentChar = line.charAt(i);
                if(currentChar != ' '){
                    if( currentChar == 'M' ){
                        maleCounter++;
                    }else {
                        femaleCounter++;
                    }
                }
            }

            if( maleCounter == femaleCounter ) {
                System.out.println("LOOP");
            }else {
                System.out.println("NO LOOP");
            }
            testCase--;
        }
    }
}
