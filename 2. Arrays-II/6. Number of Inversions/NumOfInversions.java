import java.util.ArrayList;
public class Solution{
  public static int merge(int[] a, int low, int mid, int high) {
    // temp arraylist for merging
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low; // a[0] of left half
    int right = mid + 1; //a[0] of right half
    int count = 0;
    // merge sort logic (implement count accordingly)
    while(left <= mid && right <= high) {
      if(a[left] <= a[right]) {
        temp.add(a[left]);
        left++;
      }
      else {
        temp.add(a[right]);
        count += (mid - left + 1);
        right++;
      }
    }

    while(left <= mid) {
      temp.add(a[left]);
      left++;
    }

    while(right <= high) {
      temp.add(a[right]);
      right++;
    }

    for(int i = low; i <= high; i++) {
      a[i] = temp.get(i - low);
    }
    return count;
  }
  // recursively call merge function 
  public static int mergeSort(int[] a, int low, int high) {
    int count = 0;
    if(low >= high) return count;

    int mid = (low + high) / 2;
    count += mergeSort(a, low, mid); // left half
    count += mergeSort(a, mid + 1, high); // right half
    count += mergeSort(a, low, mid, high); // merging sorted halves

    return count;
  }
  // return number of inversions
  public static int numberOfInversions(int[] a, int n) {
    return mergeSort(a, 0, n-1);
  }
}

// TC = O(nlogn) -> merge sort
// SC = O(n) -> temp arraylist
