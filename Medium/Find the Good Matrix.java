import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> findGoodMatrix(ArrayList<ArrayList<Integer>> arr) {

		// HashSet to store indices of rows and columns containing zeros

		HashSet<Integer> zeroRows = new HashSet<>();
		HashSet<Integer> zeroCols = new HashSet<>();

		// Get the dimensions of the matrix

		int n = arr.size();
		int m = arr.get(0).size();

		// Identify rows and columns containing zeros

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr.get(i).get(j) == 0) {
					// Add the index of the row and column containing zero to the respective sets
					zeroRows.add(i);
					zeroCols.add(j);
				}
			}
		}

		// Zero out rows containing zeros

		for (int row : zeroRows) {
			zeroRow(arr, row);
		}

		// Zero out columns containing zeros

		for (int col : zeroCols) {
			zeroCol(arr, col);
		}

		// Return the modified matrix

		return arr;

	}

	// Function to zero out elements in a row

	public static void zeroRow(ArrayList<ArrayList<Integer>> a, int x) {

		for (int i = 0; i < a.get(x).size(); i++) {
			// Set each element in the row to zero
			a.get(x).set(i, 0);
		}

	}

	// Function to zero out elements in a column

	public static void zeroCol(ArrayList<ArrayList<Integer>> a, int x) {

		for (int i = 0; i < a.size(); i++) {
			// Set each element in the column to zero
			a.get(i).set(x, 0);

		}

	}
}
