import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int nth = n/2;
		for(int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int num: arr) {
			if(map.get(num) > nth) {
				return num;
			}
		}
		return -1;
	}
}