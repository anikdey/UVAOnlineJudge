import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CancerScorpio {


    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i=1; i<=testCase; i++) {
            String line = br.readLine();
            int length = line.length();
            String yearStr = line.substring(4, length);
            String dayStr = line.substring(2, 4);
            String monthStr = line.substring(0, 2);

            int day = Integer.parseInt(dayStr);
            int month = Integer.parseInt(monthStr);
            int year = Integer.parseInt(yearStr);

            GregorianCalendar fromDate = new GregorianCalendar(year, month -1, day);
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            fromDate.add(Calendar.DAY_OF_MONTH, 280);
            
            int yearFromCalendar = fromDate.get(Calendar.YEAR);

            if( sdf.parse("1/21/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("2/19/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" aquarius");
            } else if( sdf.parse("2/20/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("3/20/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" pisces");
            } else if( sdf.parse("3/21/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("4/20/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" aries");
            } else if( sdf.parse("4/21/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("5/21/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" taurus");
            } else if( sdf.parse("5/22/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("6/21/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" gemini");
            } else if( sdf.parse("6/22/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("7/22/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" cancer");
            } else if( sdf.parse("7/23/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("8/21/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" leo");
            } else if( sdf.parse("8/22/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("9/23/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" virgo");
            } else if( sdf.parse("9/24/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("10/23/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" libra");
            } else if( sdf.parse("10/24/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("11/22/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" scorpio");
            } else if( sdf.parse("11/23/"+yearFromCalendar).getTime() <= fromDate.getTimeInMillis() && fromDate.getTimeInMillis() <= sdf.parse("12/22/"+yearFromCalendar).getTime() ) {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" sagittarius");
            } else {
                System.out.println(i+" "+sdf.format(fromDate.getTime())+" capricorn");
            }

        }

    }


}
