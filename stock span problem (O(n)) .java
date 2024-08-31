***  O (N) linear time complexity ***

class Solution {
    // Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        // Your code here
        Stack<Integer> s =new Stack<>();
        int[] ans =new int[n];
        s.push(0);
        ans[0]=1;
        
        for(int i=1;i<n;i++){
            while(s.empty()==false && price[s.peek()]<=price[i]){
                s.pop();
            }
            if(s.empty()==true)
            ans[i]=i+1;
            else
            ans[i]=i-s.peek();
            
            s.push(i);
        }
        return ans;
    }
}
