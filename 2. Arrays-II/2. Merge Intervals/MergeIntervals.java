class Solution{
  public int[][] merge(int[][] intervals){
    int n = intervals.length;
    // sort the intervals based on their starting values
    Arrays.sort(intervals, new Comparator<int[]>() {
      public int compare(int[] a, int[] b){
        return a[0] - b[0];
      }
    });
    // list to store merged intervals
    List<int[]> ans = new ArrayList<>();

    for(int i=0; i<n; i++){
      // condition 1: if ans is empty OR currInterval's start > end of ans' lastInterval -> add currInterval as new interval
      if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]){
        ans.add(new int[] {intervals[i][0], intervals[i][1]});
      }
      // condition 2: if currInterval overlaps with lastInterval in ans -> merge by updating end of last interval as max(currEnd, lastEnd)
      else{
        ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], intervals[i][1]);
      }
    }
    // return ans list as array
    return ans.toArray(new int[ans.size()][]);
  }
}

// TC = O(nlogn)
// SC = O(n)
