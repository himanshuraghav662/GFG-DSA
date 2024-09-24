class Solution {
    public static long seriesSum(int n) {
        // code here
        long ans=0;
        while(n>0){
            ans+=n;
            n--;
        }
        return ans;
    }
}
