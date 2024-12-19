class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        int count=0;
        for(int i=1;i<=arr[arr.length-1]+k;i++){
            if(set.contains(i)!=true){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return 1;
    }
}
