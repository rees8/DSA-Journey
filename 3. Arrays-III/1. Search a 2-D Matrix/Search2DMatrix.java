class Solution{
  public boolean searchMatrix(int[][] matrix, int target) {
    // row and col sizes
    int n = matrix.length;
    int m = matrix[0].length;
    // apply binary search
    int low = 0, high = n * m - 1; // imaginary: flattened 2-d array to 1-d array
    while(low <= high) {
      int mid = (low + high) / 2;
      int row = mid / m, col = mid % m;

      if(matrix[row][col] == target) return true;
      else if(matrix[row][col] < target) low = mid + 1;
      else high = mid - 1;
    }
    return false;
  }
}

// TC = O(log(n*m))
// SC = O(1)
