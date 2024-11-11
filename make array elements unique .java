class Solution {
    public int minIncrements(int[] arr) {
        // Code here
       // HashSet<Integer> set=new HashSet<>();
        Arrays.sort(arr);
        int count =0;
        //set.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                int temp=arr[i-1]+1;
                count+=temp-arr[i];
                arr[i]=temp;
            }
            //set.add(arr[i]);
        }
        return count;
    }
}
