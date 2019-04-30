import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RequestForProposal {

    public static void main(String[] args0) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        String line = reader.readLine().trim();
        String[] arr = line.split(" ");
        int numberOfRequirement = Integer.parseInt(arr[0]);
        int numberOfProposals = Integer.parseInt(arr[1]);

        while (numberOfRequirement != 0 ){

            for(int i=0; i<numberOfRequirement; i++) {
                reader.readLine();
            }

            String nameOfProposal = "";
            float priceOfProposal = Integer.MAX_VALUE;
            int maxMetRequirement = Integer.MIN_VALUE;

            for(int i=0; i<numberOfProposals; i++) {
                String currentProposalName = reader.readLine();
                String[] priceAndRequirementMet = reader.readLine().split(" ");
                float currentPriceOfProposal = Float.parseFloat(priceAndRequirementMet[0]);
                int metRequirement = Integer.parseInt(priceAndRequirementMet[1]);

                if(maxMetRequirement<metRequirement) {
                    nameOfProposal = currentProposalName;
                    priceOfProposal = currentPriceOfProposal;
                    maxMetRequirement = metRequirement;
                } else if(maxMetRequirement == metRequirement) {
                    if(priceOfProposal>currentPriceOfProposal) {
                        priceOfProposal = currentPriceOfProposal;
                        nameOfProposal = currentProposalName;
                    }
                }

                for(int x=0; x<metRequirement; x++) {
                    reader.readLine();
                }

            }
            counter++;
            System.out.println("RFP #"+counter);
            System.out.println(nameOfProposal);

            line = reader.readLine().trim();
            arr = line.split(" ");
            numberOfRequirement = Integer.parseInt(arr[0]);
            numberOfProposals = Integer.parseInt(arr[1]);

            if( numberOfRequirement != 0 ) {
                System.out.println();
            }
        }
    }
}