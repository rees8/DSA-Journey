public class Solution{
  public static int[] findMissingRepeatingNumbers(int[] a){
    long n = a.length;
    long SN = (n * (n + 1)) / 2; // sum of nums from 1 to n
    long S2N = (n * (n + 1) * (2 * n + 1)) / 6; // sum of squares of nums from 1 to n
    long S = 0;
    long S2 = 0;
    for(int i=0; i<n; i++){
      S += a[i]; // sum of nums in array
      S2 += (long)a[i] * (long)a[i]; // sum of squares of nums in array
    }
    // mathematical intuition 
    long val1 = S - SN; // x - y -> equation 1
    long val2 = S2 - S2N; // x^2 - y^2
    val2 = val2 / val1; // divide both these equations to get (x + y) -> equation 2
    // solve equations 1 and 2 to get x and y -> x = repeated num, y = missing num
    long x = (val1 + val2) / 2;
    long y = x - val1;
    // store in ans array and return
    int[] ans = {(int)x, (int)y};
    return ans;
  }
}

// TC = O(n)
// SC = O(1)
