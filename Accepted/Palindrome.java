
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args)  {
        Map<Character, Character> mMap = new HashMap<>();
        setUpMap(mMap);
        Scanner input = new Scanner(System.in);
        String str;
        while( input.hasNext() ) {
            str = input.next().trim();
            if(str == null || str.isEmpty()){
                break;
            }
            boolean isPal = isPalindrome(str);
            boolean isMirrored = isMirrored(str, mMap);

            if( isPal==false && isMirrored==false ) {
                System.out.println(str+" -- is not a palindrome.\n");
            } else if( isPal==true && isMirrored==false ) {
                System.out.println(str+" -- is a regular palindrome.\n");
            }else if( isPal==false && isMirrored==true ) {
                System.out.println(str+" -- is a mirrored string.\n");
            }else if( isPal==true && isMirrored==true ) {
                System.out.println(str+" -- is a mirrored palindrome.\n");
            }
        }
        input.close();
    }

    private static boolean isMirrored(String str, Map<Character, Character> mMap) {
        boolean isMirrored = true;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        mirrorCheck:
        for(int i=0; i<length; i++) {
            char currentChar = str.charAt(i);
            if( mMap.containsKey(currentChar) ) {
                stringBuffer.append(mMap.get(currentChar));
            }else {
                isMirrored = false;
                return isMirrored;
            }
        }

        int j = length-1;
        for(int i=0; i<length; i++, j--){
            if( str.charAt(i) != stringBuffer.charAt(j) ) {
                isMirrored = false;
                return isMirrored;
            }
        }
        return isMirrored;
    }

    private static boolean isPalindrome(String str){
        boolean isPal = true;
        int length = str.length();
        int half = length/2;
        int j=length-1;
        palCheck:
        for(int i=0; i<=half && (length-half)<=j; i++, j-- ){
            char head = str.charAt(i);
            char tail = str.charAt(j);
            if( head != tail ){
                isPal = false;
                break palCheck;
            }
        }
        return isPal;
    }

    private static void setUpMap(Map<Character, Character> mMap) {
        mMap.put('A', 'A');
        mMap.put('E', '3');
        mMap.put('H', 'H');
        mMap.put('I', 'I');
        mMap.put('J', 'L');
        mMap.put('L', 'J');
        mMap.put('M', 'M');
        mMap.put('O', 'O');
        mMap.put('0', 'O');
        mMap.put('S', '2');
        mMap.put('T', 'T');
        mMap.put('U', 'U');
        mMap.put('V', 'V');
        mMap.put('W', 'W');
        mMap.put('X', 'X');
        mMap.put('Y', 'Y');
        mMap.put('Z', '5');
        mMap.put('1', '1');
        mMap.put('2', 'S');
        mMap.put('3', 'E');
        mMap.put('5', 'Z');
        mMap.put('8', '8');
    }

}
