class Solution{
  public void merge(int[] nums1, int m, int[] nums2, int n){
    // initialize pointers
    int left = m - 1;
    int right = n - 1;
    int leftWithZeros = m + n - 1;

    while(left >= 0 && right >= 0){
      // if num1's element greater -> place it at end of nums1 and shift the pointers
      if(nums1[left] > nums2[right]){
        nums1[leftWithZeros] = nums1[left];
        leftWithZeros--;
        left--;
      }
      // if num2's element greater -> place it at end of nums1 and shift the pointers
      else{
        nums1[leftWithZeros] = nums2[right];
        leftWithZeros--;
        right--;
      }
    }
    // if any elements remaining in nums2 -> fill them in nums1
    while(right >= 0){
      nums1[leftWithZeros] = nums2[right];
      leftWithZeros--;
      right--;
    }
  }
}

// TC = O(m + n)
// SC = O(1)
