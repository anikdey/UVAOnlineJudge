import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotInstructions {


    public static void main(String[] args0) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(reader.readLine());

        while (testCase != 0){
            int turns = Integer.parseInt(reader.readLine());
            String[] moves = new String[turns];
            int p = 0;
            for(int i=0; i<turns; i++) {
                String line = reader.readLine().trim();
                if( line.equals("LEFT") ) {
                    p--;
                    moves[i] = line;
                }else if( line.equals("RIGHT") ) {
                    p++;
                    moves[i] = line;
                } else {
                    String[] arr = line.split(" ");
                    int index = Integer.parseInt(arr[2])-1;
                    String move = moves[index];
                    if( move.equals("LEFT") ) {
                        p--;
                        moves[i] = move;
                    }else if( move.equals("RIGHT") ) {
                        p++;
                        moves[i] = move;
                    }
                }
            }
            System.out.println(p);

            testCase--;
        }
    }
}
