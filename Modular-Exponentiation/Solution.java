

public class Solution {
    public static long modularExponentiation(long x, long n, long m) {
       long res = 1;
       x = x%m;

       while(n > 0) {
           if((n&1) != 0) {
               res = (res * x) % m;
           }
           x = (x*x) % m;
           n = n >> 1;
       }
       return res;
    }
}