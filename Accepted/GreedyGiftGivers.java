import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreedyGiftGivers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuffer sb = new StringBuffer();
        while (  line != null && !line.isEmpty() ) {
            int numberOfMembers = Integer.parseInt(line);
            String[] memberNames = reader.readLine().split(" ");
            int[] netWorth = new int[numberOfMembers];

            for(int i=0; i<numberOfMembers; i++) {
                String[] donarInfo = reader.readLine().split(" ");
                String donarName = donarInfo[0];
                int giftAmount = Integer.parseInt(donarInfo[1]);
                int receivers = Integer.parseInt(donarInfo[2]);
                if( giftAmount != 0 && receivers != 0 ) {
                    int giftAmountForEachPerson = giftAmount / receivers;
                    int remainder = giftAmount % receivers;
                    int gifted = giftAmount - remainder;
                    for(int x=0; x<numberOfMembers; x++) {
                        if( donarName.equals(memberNames[x]) ) {
                            netWorth[x] = netWorth[x] - gifted;
                        }
                    }

                    for(int y=3; y<donarInfo.length; y++) {
                        for(int z=0; z<numberOfMembers; z++) {
                            if( donarInfo[y].equals(memberNames[z]) ) {
                                netWorth[z] = netWorth[z] + giftAmountForEachPerson;
                            }
                        }
                    }
                }
            }

            for(int x=0; x<numberOfMembers; x++) {
                sb.append(memberNames[x]+" "+netWorth[x]+"\n");
            }
            sb.append("\n");
            line = reader.readLine();
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb.toString());
    }


}
