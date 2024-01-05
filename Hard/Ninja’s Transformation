import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> ninjaTransformation(ArrayList<ArrayList<Integer>> m) {
    int M = m.size(), N = m.get(0).size();
    ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    for (int i = 0; i < M; i++) {
        a.add(new ArrayList<>(Collections.nCopies(N, 0)));
    }
    ArrayList<Integer> maxRankRow = new ArrayList<>(Collections.nCopies(M, 0));
    ArrayList<Integer> maxRankCol = new ArrayList<>(Collections.nCopies(N, 0));
    TreeMap<Integer, ArrayList<ArrayList<Integer>>> map = new TreeMap<>();
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            int val = m.get(i).get(j);
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(new ArrayList<>(Arrays.asList(i, j)));
        }
    }

    for (int k : map.keySet()) {
        while (!map.get(k).isEmpty()) {
            HashSet<Integer> rowsUsed = new HashSet<>();
            HashSet<Integer> colsUsed = new HashSet<>();
            ArrayList<ArrayList<Integer>> allSame = map.get(k);
            ArrayList<Integer> root = allSame.get(0);
            rowsUsed.add(root.get(0));
            colsUsed.add(root.get(1));
            boolean[] used = new boolean[allSame.size()];
            used[0] = true;

            while (true) {
                int added = 0;
                for (int i = 1; i < allSame.size(); i++) {
                    ArrayList<Integer> n = allSame.get(i);
                    if (used[i]) continue;
                    if (rowsUsed.contains(n.get(0)) || colsUsed.contains(n.get(1))) {
                        rowsUsed.add(n.get(0));
                        colsUsed.add(n.get(1));
                        used[i] = true;
                        added++;
                    }
                }
                if (added == 0) break;
            }

            ArrayList<ArrayList<Integer>> connected = new ArrayList<>();
            ArrayList<ArrayList<Integer>> left = new ArrayList<>();
            for (int i = 0; i < allSame.size(); i++) {
                if (used[i]) connected.add(allSame.get(i));
                else left.add(allSame.get(i));
            }

            map.put(k, left);
            int rank = Integer.MIN_VALUE;
            for (ArrayList<Integer> n : connected) {
                rank = Math.max(rank, Math.max(maxRankRow.get(n.get(0)), maxRankCol.get(n.get(1))) + 1);
            }
            for (ArrayList<Integer> n : connected) {
                int row = n.get(0);
                int col = n.get(1);
                maxRankRow.set(row, rank);
                maxRankCol.set(col, rank);
                a.get(row).set(col, rank);
            }
        }
    }
    return a;
    }
}
