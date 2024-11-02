classSolution{
  public int findDuplicate(int[] nums) {
    // initialize slow and fast pointers
    int slow = nums[0];
    int fast = nums[0];
    // loop to create a cycle till slow and fast intersect
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    }
    while(slow != fast);
    // reset fast
    fast = nums[0];
    // traverse cycle again till they intersect -> both move only 1 step ahead
    while(slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }    
    return slow;
  }
}

// TC = O(n)
// SC = O(1)
