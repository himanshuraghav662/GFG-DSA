*** TLE ***


class Solution {
    // Function to calculate the span of stockâ€™s price for all n days.
    static int index(int price[] ,int n){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            s.push(price[i]);
        }
        int curr=price[n];
        for(int i=n-1;i>=0;i--){
            if(s.peek()>curr){
                return i;
            }
            else if(s.empty()==true || i<=0){
                return -1;
            }
            else{
                s.pop();
            }
        }
        return -1;
    }
    public static int[] calculateSpan(int price[], int n) {
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            int k=index(price,i);
            if(k==-1)
            ans[i]=i+1;
            else{
               ans[i]=i-k; 
            }
        }
        return ans;
    }
}
