class Solution{
  public int maxSubArray(int[] nums){
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for(int i=0; i<nums.length; i++){
      sum += nums[i];
      // condition 1
      if(sum > max){
        max = sum;
      }
      // condition 2
      if(sum < 0){
        sum = 0;
      }
    }
    return max;
  }
}

// TC = O(n)
// SC = O(1)
