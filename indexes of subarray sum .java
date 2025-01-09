class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int i=0;
        int j=0;
        int sum=0;
        while(sum<target && j<arr.length){
            sum+=arr[j];
            if(sum<target)
            j++;
        }
        while(j<arr.length){
            if(sum==target){
                return new ArrayList<>(Arrays.asList(i+1,j+1));
            }else if(sum>target){
                sum-=arr[i];
                i++;
            }else{
                j++;
                if(j<arr.length)
                sum+=arr[j];
            }
        }
     return new ArrayList<>(Arrays.asList(-1));

    }
}
