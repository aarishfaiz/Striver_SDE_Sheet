 
import java.util.ArrayList;

public class Solution {
	public static long nCr(int n, int r) {
		long res = 1;
		for(int i=0;i<r;i++) {
			res *= (n-i);
			res /= (i+1);
		}
		return res;
	}
	public static ArrayList<ArrayList<Long>> printPascal(int numsRow) {
            ArrayList<ArrayList<Long>> triangle = new ArrayList<>();

			for(int n=0;n<numsRow;n++) {
				ArrayList<Long> row = new ArrayList<>();
				
				for(int c=0; c<=n; c++) {
					row.add(nCr(n, c));
				}
				triangle.add(row);
			}
			return triangle;
	}
}

// [[1], [1], [1,1], [1], [1,1], [1,2,1]]
