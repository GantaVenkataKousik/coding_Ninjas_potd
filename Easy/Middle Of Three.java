import java.util.* ;
import java.io.*; 
public class Solution {
	public static int middleOfThree(int x, int y, int z) {
		if((x<y && y<z) || (z<y && y<x))return y;
		if((y<x && x<z) || (z<x && x<y))return x;
		if((x<z && z<y) || (y<z && z<x))return z;
		return -1;
	}
}
