import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class Solution {
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visi = new boolean[n];
        ArrayList<Integer> bfs = new ArrayList<>();

        queue.offer(0);
        visi[0] = true;

        while(!queue.isEmpty()) {
            int node = queue.remove();
            bfs.add(node);

            for(int neigh: adj.get(node)) {
                if(!visi[neigh]) {
                    queue.offer(neigh);
                    visi[neigh] = true;
                }
            }
        }
        return bfs;
    }
}

