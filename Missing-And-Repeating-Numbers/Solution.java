import java.util.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] count = new int[n+1];
        int[] ans = new int[2];

        for(int i=0; i<n; i++) {
            int ele = arr.get(i);
            count[ele]++;

            if(count[ele] == 2) {
                ans[1] = ele;
            }
        }
        for(int i=1;i<=n;i++) {
            if(count[i] == 0) {
                ans[0] = i;
                break;
            }
        }
        return ans;
    }
}