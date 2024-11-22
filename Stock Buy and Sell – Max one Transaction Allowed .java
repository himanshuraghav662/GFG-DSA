class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int ans=0;
        int smallest=prices[0];
        int largest=0;
        for(int i=1;i<prices.length;i++){
            if(smallest<prices[i]){
                ans=Math.max(ans,prices[i]-smallest);
            }else if(smallest>prices[i]){
                smallest=prices[i];
            }
        }
        return ans;
    }
}
