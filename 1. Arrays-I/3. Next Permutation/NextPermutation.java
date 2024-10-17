class Solution{

  // Function to reverse an array starting from a particular index
  public void reverse(int[] nums, int s){
    for(int i=s; i<(s+nums.length)/2; i++){
      int temp = nums[i];
      nums[i] = nums[nums.length-i+s-1];
      nums[nums.length-i+s-1] = temp;
    }
  }

  public void nextPermutation(int[] nums){
    int n = nums.length;

    // Find the breakpoint ind
    int ind = -1;
    for(int i=n-2; i>=0; i--){
      if(nums[i] < nums[i+1]){
        ind = i;
        break;
      }
    }

    // If breakpoint doesn't exist, it is the last permutation -> hence print 1st permutation (by simply reversing the array)
    if(ind == -1){
      reverse(nums, 0);
    }
    // Iterate from last element till breakpoint -> When you find the 1st element greater than the breakpoint, swap.
    else{
      for(int i=n-1; i>ind; i--){
        if(nums[i] > nums[ind]){
          int temp = nums[i];
          nums[i] = nums[ind];
          nums[ind] = temp;
          break;
        }
      }

      // Remaining part from ind+1 to n would already be in desc. order (as it's a permutation) -> hence simple reverse it
      reverse(nums, ind+1);
    }
  }
}

// TC = O(n)
// SC = O(1)
