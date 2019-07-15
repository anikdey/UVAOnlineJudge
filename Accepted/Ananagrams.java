import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ananagrams {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> lowerCaseList = new ArrayList<>();
        String line = br.readLine();
        while (!line.equals("#")){
            String[] inputArray = line.split(" ");
            for(String str: inputArray) {
                if(!str.equals("")){
                    list.add(str);
                    lowerCaseList.add(sortAndLowerCase(str));
                }
            }
            line = br.readLine();
        }

        ArrayList<String> outputList = new ArrayList<>();

        int[] visited = new int[list.size()];

        int size = list.size();

        for(int i=0; i<size; i++) {

            if(visited[i] == 0) {
                String originalWord = list.get(i);
                String sortedString = sortAndLowerCase(originalWord);

                boolean isAnanagram = true;
                innerCheck:
                for(int j=i+1; j<size; j++) {
                    String wordToCompare = lowerCaseList.get(j);
                    if(wordToCompare.equals(sortedString)){
                        isAnanagram = false;
                        visited[j] = 1;
                        //break innerCheck;
                    }
                }
                if(isAnanagram){
                    outputList.add(originalWord);
                }
            }
        }

        Collections.sort(outputList);
        for(String str : outputList) {
            System.out.println(str);
        }

    }

    private static String sortAndLowerCase(String word) {
        char tempArray[] = word.toLowerCase().toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
