import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoogleIsFeelingLucky {

    public static void main(String[] args0) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        int testCase = Integer.parseInt(reader.readLine());

        while (testCase != 0){

            int prevRelevance = Integer.MIN_VALUE;
            String addresses = "";

            for(int i=1; i<=10; i++) {
                String line = reader.readLine();
                String[] arr = line.split(" ");
                int currentRelevance = Integer.parseInt(arr[1]);

                if(currentRelevance>prevRelevance) {
                    prevRelevance = currentRelevance;
                    addresses = arr[0]+"\n";
                } else if(currentRelevance == prevRelevance) {
                    if( !addresses.contains(arr[0]) ) {
                        addresses += arr[0]+"\n";
                    }
                }

            }
            counter++;
            System.out.println("Case #"+counter+":");
            System.out.print(addresses);
            testCase--;
        }
    }
}
