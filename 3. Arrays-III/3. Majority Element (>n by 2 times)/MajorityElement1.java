// MOORE'S VOTING ALGORITHM
class Solution {
  public int majorityElement(int[] nums) {
    int n = nums.length;
    int element = 0, count = 0;
    // moore's algorithm
    for(int i=0; i<n; i++) {
      // condition 1
      if(count == 0) {
        count = 1;
        element = nums[i];
      }
        // condition 2
      else if(element == nums[i]) {
        count++;
      }
        // condition 3
      else{
        count--;
      }
    }
    return element;
  }
}

// TC = O(n)
// SC = O(1)
