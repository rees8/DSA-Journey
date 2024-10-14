class Solution{
  // Create a List type function that takes numRows as input to generate elements in each row
  public List <Integer> generateRow(int numRows){
    // Declare a long var ans itinialised to 1
    long ans = 1;
    // Create a new list ansRow to store elements of each row
    List <Integer> ansRow = new ArrayList<>();
    // We manually add 1 as the first element
    ansRow.add(1);

    /* For each row, no. of cols = the row no.
      Iterate for col from 1 to r.
      Implement formula logic to calculate each element.
      Add each element to ansRow and return it */
    for(int col = 1; col < numRows; col++){
      ans = ans * (numRows - col);
      ans = ans / col;
      ansRow.add((int)ans);
    }
    return ansRow;
  }

  // Create a function to generate the triangle
  public List <List <Integer>> generate(int numRows){
    // Take a 2-D list ans to store the triangle
    List <List <Integer>> ans = new ArrayList<>();
    // Iterate from r=1 to n inclusive and store each row. Finally, return the list.
    for(int row = 1; row <= numRows; row++){
      ans.add(generateRows(row));
    }
    return ans;
  }
}

// TC = O(n^2)
// SC = O(1)
