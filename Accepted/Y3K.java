import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Y3K {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] inputArray = line.split(" ");
        int days = Integer.parseInt(inputArray[0]);
        int day = Integer.parseInt(inputArray[1]);
        int month = Integer.parseInt(inputArray[2]);
        int year = Integer.parseInt(inputArray[3]);

        while (days != 0 && day != 0 && month != 0 & year != 0) {
            GregorianCalendar fromDate = new GregorianCalendar(year, month -1, day);
            SimpleDateFormat sdf = new SimpleDateFormat("d M yyyy");
            fromDate.add(Calendar.DAY_OF_MONTH, days);

            System.out.println(sdf.format(fromDate.getTime()));

            line = br.readLine();
            inputArray = line.split(" ");
            days = Integer.parseInt(inputArray[0]);
            day = Integer.parseInt(inputArray[1]);
            month = Integer.parseInt(inputArray[2]);
            year = Integer.parseInt(inputArray[3]);
        }

    }
}
