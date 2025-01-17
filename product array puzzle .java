class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int[] ans=new int[arr.length];
        int product=1;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && flag==0){
                flag=1;
            }else{
            product*=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            ans[i]=product;
            else if(flag==1)
            ans[i]=0;
            else
            ans[i]=product/arr[i];
        }
        return ans;
    }
}
