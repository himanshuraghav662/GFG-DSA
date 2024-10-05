class Solution {
    public static int distributeBalls(int n) {
        // code here
        if(n==1)
        return 0;
        if(n==2)
        return 2;
        int mod=1000000007;
        int ans=1;
        while(n>0){
           ans=(ans*2)%mod;
           n--;
        }
        ans=ans-2;
        
        return ans;
        
    }
}
