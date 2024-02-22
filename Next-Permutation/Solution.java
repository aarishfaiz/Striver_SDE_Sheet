
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{

        int n = permutation.size();

        int idx = -1;
        for(int i=n-2;i>=0;i--) {
            if(permutation.get(i) < permutation.get(i+1) ) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            Collections.reverse(permutation);
            return permutation;
        }

        int l = -1;

        for(int i=n-1;i>idx;i--) {
            if(permutation.get(i) > permutation.get(idx)) {
                l = i;
                break;
            }
        }

        Collections.swap(permutation, idx, l);
        Collections.reverse(permutation.subList(idx+1, n));

        return permutation;
	}
}

// 2 3 4 5 --> 2 3 5 4
// idx = 2;
// l = i;
