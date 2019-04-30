import java.util.Scanner;

public class HorrorDash {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int counter = 0;
        while(testCase!=0) {
            int maxSpeed = Integer.MIN_VALUE;
            int scaryCreatures = input.nextInt();
            while (scaryCreatures != 0) {
                int speed = input.nextInt();
                if( maxSpeed < speed ) {
                    maxSpeed = speed;
                }
                scaryCreatures--;
            }
            counter++;
            System.out.println("Case "+counter+": "+maxSpeed);
            testCase--;
        }
        input.close();
    }
}