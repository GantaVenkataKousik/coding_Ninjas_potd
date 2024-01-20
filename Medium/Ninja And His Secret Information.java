import java.util.*;
import java.io.*;

public class Solution {
    public static String encode(String secretInformation) {
        StringBuilder msg = new StringBuilder();
        int len = secretInformation.length();

        for (int i = 0; i < len; i++) {
            if (secretInformation.charAt(i) == ' ') {
                msg.append("!");
            } else {
                msg.append((char) (secretInformation.charAt(i) + 3));
            }
        }

        return msg.toString();
    }

    public static String decode(String encodedInformation) {
        StringBuilder msg = new StringBuilder();
        int len = encodedInformation.length();

        for (int i = 0; i < len; i++) {
            if (encodedInformation.charAt(i) == '!') {
                msg.append(" ");
            } else {
                msg.append((char) (encodedInformation.charAt(i) - 3));
            }
        }

        return msg.toString();
    }
}
