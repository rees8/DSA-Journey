// Rotate 90 deg clockwise -> transpose the matrix + reverse each row
class Solution{
  public void rotate(int[][] matrix){
    // 1. calculate transpose 
    for(int i=0; i<matrix.length; i++){
      for(int j=i; i<matrix[0].length; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // 2. reverse each row
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix.length/2; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length-1-i];
        matrix[i][matrix.length-1-i] = temp;
      }
    }
  }
}

// TC = O(n*n) + O(n*n)
// SC = O(1)
