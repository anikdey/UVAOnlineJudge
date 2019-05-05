import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveCalculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName;
        while ((firstName = reader.readLine()) != null){
            String secondName = reader.readLine();
            double fNumber = processTotal(getTotalCountFromName(firstName));
            double sNumber = processTotal(getTotalCountFromName(secondName));
            if( fNumber > sNumber ) {
                double percentage = (sNumber/fNumber) * 100;
                System.out.printf("%.2f %%\n", percentage);
            } else {
                double percentage = (fNumber/sNumber) * 100;
                System.out.printf("%.2f %%\n", percentage);
            }
        }
    }

    private static int getTotalCountFromName(String name) {
        int total = 0;
        int fLength = name.length();
        for(int i=0; i<fLength; i++) {
            char ch = name.charAt(i);
            if(Character.isAlphabetic(ch)){
                if( Character.isUpperCase(ch) ) {
                    total += ch - 'A' + 1;
                }else {
                    total += ch - 'a' + 1;
                }
            }
        }
        return total;
    }

    public static int processTotal(int totalSumOfString) {
        if(totalSumOfString<10){
            return totalSumOfString;
        } else {
            int total = 0;
            while(totalSumOfString != 0) {
                total += totalSumOfString%10;
                totalSumOfString /= 10;
            }
            return processTotal(total);
        }
    }
}