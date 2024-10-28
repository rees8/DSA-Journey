class Solution{
  public int maxProfit(int[] prices){
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0; i < prices.length; i++){
      // if prices[i] < minPrice -> update value of minPrice
      if(prices[i] < minPrice){
        minPrice = prices[i];
      }
      // if prices[i] - minPrice > maxProfit -> update value of maxProfit
      if(prices[i] - minPrice > maxProfit){
        maxProfit = prices[i] - minPrice;
      }
    }
    return maxProfit;
  }
}

// TC = O(n)
// SC = O(1)
