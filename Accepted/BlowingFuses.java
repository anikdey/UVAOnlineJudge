import java.util.Scanner;

public class BlowingFuses {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int numberOfDevices = input.nextInt();

        while (numberOfDevices != 0) {

            int totalConsumed = 0;
            int maxConsumption = 0;

            int numberOfOperations = input.nextInt();
            int capacityOfFuse = input.nextInt();

            int[] consumptionOfEachDevice = new int[numberOfDevices];
            int[] deviceState = new int[numberOfDevices];

            for(int i=0; i<numberOfDevices; i++) {
                consumptionOfEachDevice[i] = input.nextInt();
            }

            for( int i=1; i<=numberOfOperations; i++ ) {
                int currentlyOperatingDevice = input.nextInt() - 1;

                int state = deviceState[currentlyOperatingDevice];
                if( state == 0 ) {
                    deviceState[currentlyOperatingDevice] = 1;
                    totalConsumed += consumptionOfEachDevice[currentlyOperatingDevice];
                }else {
                    deviceState[currentlyOperatingDevice] = 0;
                    totalConsumed -= consumptionOfEachDevice[currentlyOperatingDevice];
                }

                if( maxConsumption<totalConsumed ) {
                    maxConsumption = totalConsumed;
                }
            }

            counter++;
            if( maxConsumption>capacityOfFuse ) {
                System.out.println("Sequence "+counter);
                System.out.println("Fuse was blown.");
            }else {
                System.out.println("Sequence "+counter);
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was "+maxConsumption+" amperes.");
            }
            System.out.println();
            numberOfDevices = input.nextInt();
        }
        input.close();
    }
}
