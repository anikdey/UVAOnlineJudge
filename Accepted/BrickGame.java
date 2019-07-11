import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrickGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        for(int i=1; i<=testCase; i++){
            int teamPlayers = input.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j=1; j<=teamPlayers; j++){
                int age = input.nextInt();
                list.add(age);
//                if(!list.contains(age)){
//                    list.add(age);
//                }
            }
            int index = list.size()/2;
            System.out.println("Case "+i+": "+ list.get(index));
        }
        input.close();
    }
}
