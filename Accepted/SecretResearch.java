import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SecretResearch {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i=1; i<=testCase; i++) {
            String line = br.readLine().trim();
            //String line = input.nextLine();
            if(line.equals("1") || line.equals("4") || line.equals("78") ){
                System.out.println("+");
            } else if( line.endsWith("35") ){
                System.out.println("-");
            }else if(line.length()>1 && line.charAt(0) == '9' && line.charAt(line.length()-1) == '4' ){
                System.out.println("*");
            } else if(line.startsWith("190")){
                System.out.println("?");
            }
        }
    }
}
