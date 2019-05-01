import java.util.Scanner;

public class TheSnail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        while (height != 0){
            double upwardDistance = input.nextDouble();
            double downWardDistance = input.nextDouble();
            double fatigueFactor = input.nextDouble() / 100;
            calculateRequiredNumberOfDay(height, upwardDistance, downWardDistance, fatigueFactor);
            height = input.nextInt();
        }


        input.close();
    }

    private static int calculateRequiredNumberOfDay(double targetHeight, double upwardDistance, double downWardDistance, double fatigueFactor) {
        int dayCounter = 0;
        double snailsInitialHeight = 0;
        double distanceClimbed = 0;
        double heightAfterClimbing = 0;
        double heightAfterSliding = 0;

        while(true) {
            dayCounter++;
            if( dayCounter == 1 ) {
                distanceClimbed = upwardDistance;
                heightAfterClimbing = snailsInitialHeight + distanceClimbed;

                if( heightAfterClimbing > targetHeight ) {
                    System.out.println("success on day "+dayCounter);
                    break;
                }

                heightAfterSliding = heightAfterClimbing - downWardDistance;
                snailsInitialHeight = heightAfterSliding;
            } else {
                distanceClimbed = distanceClimbed - (upwardDistance * fatigueFactor);
                if(distanceClimbed>=0) {
                    heightAfterClimbing = snailsInitialHeight + distanceClimbed;

                    if( heightAfterClimbing > targetHeight ) {
                        System.out.println("success on day "+dayCounter);
                        break;
                    }
                    heightAfterSliding = heightAfterClimbing - downWardDistance;
                    snailsInitialHeight = heightAfterSliding;
                } else {
                    heightAfterSliding = snailsInitialHeight - downWardDistance;
                    snailsInitialHeight = heightAfterSliding;
                }
            }

            if( snailsInitialHeight < 0 ) {
                System.out.println("failure on day "+dayCounter);
                break;
            }
        }
        return dayCounter;
    }

}
