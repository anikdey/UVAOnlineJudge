import java.util.Scanner;

public class TariffPlan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int counter = 0;
        while( testCase != 0 ) {
            int slots = input.nextInt();
            int priceForMile = 0;
            int priceForJuice = 0;
            for(int i=1; i<=slots; i++) {
                int duration = input.nextInt() + 1;

                int minsForMile = duration / 30;
                if( duration % 30 != 0 ) {
                    minsForMile += 1;
                }

                priceForMile += (minsForMile*10);

                int minsForJuice = duration / 60;
                if( duration % 60 != 0 ) {
                    minsForJuice += 1;
                }
                priceForJuice += (minsForJuice*15);
            }

            counter++;
            if( priceForJuice == priceForMile ) {
                System.out.println("Case "+counter+": Mile Juice "+priceForJuice);
            } else if(priceForMile < priceForJuice){
                System.out.println("Case "+counter+": Mile "+priceForMile);
            } else {
                System.out.println("Case "+counter+": Juice "+priceForJuice);
            }

            testCase--;
        }

        input.close();
    }

}
