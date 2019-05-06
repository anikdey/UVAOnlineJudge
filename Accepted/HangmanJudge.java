import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HangmanJudge {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        while (testCase != -1) {
            String puzzle = reader.readLine().trim();
            int pStrLen = puzzle.length();
            Map<Character, Boolean> pMap = new HashMap<>();
            for(int i=0; i<pStrLen; i++) {
                pMap.put(puzzle.charAt(i), false);
            }


            String usersGuess = reader.readLine().trim();
            int gStrLen = usersGuess.length();

            int matchCounter = 0;
            int wrongGuessCounter = 0;
            Map<Character, Integer> gMap = new HashMap<>();
            boolean isFoundAnswer = false;

            System.out.println("Round "+testCase);
            innerLoop:
            for( int i=0; i<gStrLen; i++ ) {
                char currentChar = usersGuess.charAt(i);
                if( pMap.containsKey(currentChar) ) {
                    if( !pMap.get(currentChar) ) {
                        pMap.put(currentChar, true);
                        matchCounter++;
                        if( matchCounter == pMap.size() ){
                            System.out.println("You win.");
                            isFoundAnswer = true;
                            break innerLoop;
                        }
                    }
                } else {
                    if(!gMap.containsKey(currentChar)){
                        wrongGuessCounter++;
                        if(wrongGuessCounter == 7){
                            System.out.println("You lose.");
                            isFoundAnswer = true;
                            break innerLoop;
                        }
                        gMap.put(currentChar, wrongGuessCounter);
                    }
                }
            }
            if(!isFoundAnswer){
                System.out.println("You chickened out.");
            }
            testCase = Integer.parseInt(reader.readLine());
        }
    }
}
