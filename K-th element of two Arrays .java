class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int ans=0;
        int n=0;
        int i=0;
        int j=0;
        while(n!=k){
            if(i==a.length){
                ans=b[j];
                j++;
            }else if(j==b.length){
                ans=a[i];
                i++;
            }else if(a[i]<=b[j]){
                ans=a[i];
                i++;
            }else{
                ans=b[j];
                j++;
            }
            
            n++;
        }
        return ans;
    }
