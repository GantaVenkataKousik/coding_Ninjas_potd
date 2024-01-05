import java.util.*;

public class Solution {
	public static int splitString(String s) {
		Map<Character,Integer> mp1 = new HashMap<>();
		int n = s.length();
		char ch;
		for(int i=1 ; i<n ; i++){
			ch = s.charAt(i);
			mp1.put(ch,mp1.getOrDefault(ch, 0)+1);
		}

		Map<Character,Integer> mp2 = new HashMap<>();
		mp2.put(s.charAt(0),1);

		int j=1,cnt =0;
		while(j<n){

			if(mp1.size() == mp2.size())cnt++;
			ch = s.charAt(j);
			if (mp1.containsKey(ch)) {
				mp2.put(ch, mp2.getOrDefault(ch, 0) + 1);
				int val = mp1.get(ch) - 1;
				if (val == 0) {
					mp1.remove(ch);
				} else {
					mp1.put(ch, val);
				}
			}

			j++;
		}
		return cnt;
	}
}
