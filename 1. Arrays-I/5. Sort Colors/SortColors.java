// DUTCH NATIONAL FLAG ALGO
class Solution{
  // swap function
  public void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public void sortColors(int[] nums){
    int low = 0; mid = 0; high = nums.length-1;

    while(mid <= high){
      // condition 1 -> mid = 0
      if(nums[mid] == 0){
        swap(nums, low, mid);
        low++;
        mid++;
      }
      // condition 2 -> mid = 1
      else if(nums[mid] == 1){
        mid++;
      }
      // condition 3 -> mid = 2
      else{
        swap(nums, mid, high);
        high--;
      }
    }
  }
}
