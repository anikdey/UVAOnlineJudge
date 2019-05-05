import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BurgerTime {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());

        while (length != 0){
            String line = reader.readLine();
            int minDistance = Integer.MAX_VALUE;
            int tempDistance = 1;
            boolean searchForR = true;

            int startIndex = 0;

            for( int i=0; i<length; i++ ) {
                if( line.charAt(i) == 'Z' ) {
                    startIndex = i;
                    break;
                }else if( line.charAt(i) == 'R' ) {
                    startIndex = i;
                    searchForR = false;
                    break;
                }else if( line.charAt(i) == 'D' ) {
                    startIndex = i;
                    break;
                }
            }

            innerLoop:
            for(int i=startIndex; i<length; i++) {
                if(line.charAt(i) == 'Z') {
                    minDistance = 0;
                    break innerLoop;
                }

                if( searchForR ) {
                    if( line.charAt(i) == 'D' ) {
                        tempDistance = 1;
                    } else if(line.charAt(i) == '.') {
                        tempDistance++;
                    }else if(line.charAt(i) == 'R') {
                        searchForR = false;
                        if(minDistance>tempDistance) {
                            minDistance = tempDistance;
                        }
                        tempDistance = 1;
                    }
                } else {
                    if( line.charAt(i) == 'R' ) {
                        tempDistance = 1;
                    } else if(line.charAt(i) == '.') {
                        tempDistance++;
                    }else if(line.charAt(i) == 'D') {
                        searchForR = true;
                        if(minDistance>tempDistance) {
                            minDistance = tempDistance;
                        }
                        tempDistance = 1;
                    }
                }
            }
            System.out.println(minDistance);
            length = Integer.parseInt(reader.readLine());
        }
    }
}
