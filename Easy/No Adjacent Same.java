import java.util.* ;
import java.io.*; 
public class Solution {
    public static String convertToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;

            binary.insert(0, remainder);

            decimalNumber /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }
    public static boolean checkBits(int n) {
        String bin = convertToBinary(n);
        int len = bin.length();
        for(int i=0 ; i<len-1 ; i++){
            if((bin.charAt(i)=='1' && bin.charAt(i+1)=='1') || (bin.charAt(i)=='0' && bin.charAt(i+1)=='0'))return false;
        }
        return true;
    }
}
