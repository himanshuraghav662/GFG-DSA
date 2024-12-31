class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int ans=1;
        for(int i=1;i<arr.length;i++){
            int temp=1;
            while(i<arr.length && (arr[i]==arr[i-1]+1 || arr[i]==arr[i-1])){
                if(arr[i]==arr[i-1]){
                    i++;
                }else{
                temp++;
                i++;
                }
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}
