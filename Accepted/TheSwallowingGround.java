import java.util.Scanner;

public class TheSwallowingGround {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for(int i=1; i<=testCase; i++) {
            int gap = 0;
            boolean isPossible = true;
            int columns = input.nextInt();
            for(int j=0; j<columns; j++) {
                int northernPosition = input.nextInt();
                int southernPosition = input.nextInt();

                int currentCalculatedGap = Math.abs(northernPosition - southernPosition);

                if(j == 0) {
                    gap = currentCalculatedGap;
                } else {
                    if( gap != currentCalculatedGap ){
                        isPossible = false;
                    }
                }

            }

            if(isPossible) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            if(i != testCase)
                System.out.println();
        }

    }

}
