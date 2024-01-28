import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean isPossibleToSurvive(int N, int M, int S ) {
        if(M > N) return false;
            
        int sunday = S/7; 
        int Can_buy = S - sunday; 
        int Total_food_req = S * M; 
        int Min_day_To_Go = -1; 
        
        if(Total_food_req % N == 0)
            Min_day_To_Go = Total_food_req / N;
        else
            Min_day_To_Go = (Total_food_req / N) + 1;
         
        if(Min_day_To_Go > Can_buy) return false;
        else return true;
    }
}
