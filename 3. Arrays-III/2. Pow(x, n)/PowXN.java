// Binary Exponentiation
class Solution{
  public double myPow(double x, int n) {
    double ans = 1.0;
    long exp = n; // take as long to prevent overflow

    if(exp < 0) exp = -1 * exp; // if exp is -ve

    while(exp > 0) { // if exp is +ve
      if(exp % 2 == 1) { // if exp is odd
        ans = ans * x;
        exp = exp - 1;
      }
      else { // if exp is even
        x = x * x;
        exp = exp / 2;
      }
    }

    if(n < 0) ans = (double)(1.0) / (double)(ans); // if n is -ve
    return ans;
  }
}

// TC = O(log n to the base 2) -> binary exponentiation
// SC = O(1)
