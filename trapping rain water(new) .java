class Solution {
    public int maxWater(int arr[]) {
        int ans=0;
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            left[i]=max;
        }
        max=0;
        for(int i=arr.length-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            right[i]=max;

        }
        for(int i=1;i<arr.length-1;i++){
            ans+=(Math.min(left[i],right[i]))-arr[i];
        }
        return ans;
    }
}
