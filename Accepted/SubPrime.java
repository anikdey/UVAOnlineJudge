import java.util.Scanner;

public class SubPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int b = input.nextInt();
        int n = input.nextInt();

        while(b != 0 && n != 0) {

            int[] reservesOfBank = new int[b];
            for(int i=0; i<b; i++){
                reservesOfBank[i] = input.nextInt();
            }

            for(int i=0; i<n; i++) {
                int debtorBank = input.nextInt();
                int creditorBank = input.nextInt();
                int debenture = input.nextInt();

                int reserveOfDebtorBank = reservesOfBank[debtorBank-1];
                int reserveOfCreditorBank = reservesOfBank[creditorBank-1];

                reservesOfBank[creditorBank-1] = reserveOfCreditorBank + debenture;
                reservesOfBank[debtorBank-1] = reserveOfDebtorBank - debenture;
            }

            boolean isPossible = true;
            checkPossible:
            for(int i=0; i<b; i++) {
                if(reservesOfBank[i]<0) {
                    isPossible = false;
                    break checkPossible;
                }
            }

            if(isPossible) {
                System.out.println("S");
            }else {
                System.out.println("N");
            }

            b = input.nextInt();
            n = input.nextInt();
        }
        input.close();
    }
}
