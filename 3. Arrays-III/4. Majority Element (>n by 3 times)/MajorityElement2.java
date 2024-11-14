// MODIFIED MOORE'S VOTING ALGORITHM
class Solution {
  public List<Integer> majorityElement(int[] nums) {
    int n = nums.length;
    int count1 = 0, count2 = 0;
    int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

    for(int i=0; i<n; i++) {
      if(count1 == 0 && ele2 != nums[i]) {
        count1 = 1;
        ele1 = nums[i];
      }
      else if(count2 == 0 && ele1 != nums[i]) {
        count2 = 1;
        ele2 = num[i];
      }
      else if(nums[i] == ele1) count1++;
      else if(nums[i] == ele2) count2++;
      else {
        count1--;
        count2--;
      }
    }

    List<Integer> result = new ArrayList<>();
    count1 = 0;
    count2 = 0;

    for(int i=0; i<n; i++) {
      if(nums[i] == ele1) count1++;
      if(nums[i] == ele2) count2++;
    }

    int minOccurence = (int)(n / 3) + 1;
    if(count1 >= minOccurence) result.add(ele1);
    if(count2 >= minOccurence) result.add(ele2);

    return result;
  }
}

// TC = O(n)
// SC = O(1)
