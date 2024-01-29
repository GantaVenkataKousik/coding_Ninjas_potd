import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
            String[] words = str.split(" ");
            for(int i=0 ; i<words.length ; i++){
                words[i] = words[i].substring(0, 1).toUpperCase() +
                 words[i].substring(1);
            }
            return String.join(" ",words);
        }

}
