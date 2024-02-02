import java.util.* ;
import java.io.*; 
public class Solution {
	public static int slotScore(String original, String guess) {


		Map<Character,Integer> mp = new HashMap<>();
		Set<Integer> st = new HashSet<>();

		for(int i=0 ; i<original.length() ; i++){
			mp.put(original.charAt(i),
			mp.getOrDefault(original.charAt(i), 0)+1);
		}

		int score = 0;

		for(int i=0 ; i<original.length() ; i++){
			if(original.charAt(i) == guess.charAt(i)){
					score+=2;
					mp.put(original.charAt(i),
					mp.get(original.charAt(i))-1);
					st.add(i);
			}
	
		}

		for(int i=0 ; i<original.length() ; i++){
				if(mp.containsKey(guess.charAt(i)) && !st.contains(i)){                                     
					if(mp.get(guess.charAt(i))>0){
						score++;
						mp.put(guess.charAt(i),
							mp.get(guess.charAt(i))-1);
					}
				}
		}
		return score;
	}
}
