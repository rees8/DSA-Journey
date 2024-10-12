class Solution{
  public void setZeros(int[][] matrix){
    // Initial declarations
    int rows = matrix.length;
    int cols = matrix[0].length;
    boolean fcol = false;
    boolean frow = false;

    // If 0 present in col0 (1st col), set fcol as true
    for(int i=0; i<rows; i++){
      if(matrix[i][0] == 0){
        fcol = true;
        break;
      }
    }

    // If 0 present in row0 (1st row), set frow as true
    for(int j=0; j<cols; j++){
      if(matrix[0][j] == 0){
        frow = true;
        break;
      }
    }

    // Check row elements from 1 to n (ignore row0 & col0). If 0 found -> set 1st element of that row and col as 0
    for(int i=1; i<rows; i++){
      for(int j=1; j<cols; j++){
        if(matrix[i][j] == 0){
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }

    // Check 1st element of each row from 1 to n (ignore row0). If 0 found -> set entire row to 0
    for(int i=1; i<rows; i++){
      if(matrix[i][0] == 0){
        Arrays.fill(matrix[i] ,0);
      }
    }

    // Check 1st element of each column from 1 to n (ignore col0). If 0 found -> set entire column as 0
    for(int j=1; j<cols; j++){
      if(matrix[0][j] == 0){
        for(int i=1; i<rows; i++){
          matrix[i][j] = 0;
        }
      }
    }

    // If fcol = true -> set elements of col0 as 0
    if(fcol){
      for(int i=0; i<rows; i++){
        matrix[i][0] = 0;
      }
    }

    // If frow = truw, set elements of row0 as 0
    if(frow){
      Arrays.fill(matrix[0], 0);
    }
  }
}

//TC = O(m * n)
//SC = O(1)
