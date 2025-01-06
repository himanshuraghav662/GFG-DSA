class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        if(arr.length==1)
        return new ArrayList<>();
        Arrays.sort(arr);
        if(arr[0]>target){return new ArrayList<>(Arrays.asList(arr[0],arr[1]));  }
        int i=0;
        int j=arr.length-1;
        int x=arr[0];
        int y=arr[j];
        int cs=Integer.MAX_VALUE;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(Math.abs(sum-target)<Math.abs(cs-target)){
                cs=sum;
                x=arr[i];
                y=arr[j];
            }
            if(sum<target){i++;}
            else{ j--;}
        }
       return new ArrayList<>(Arrays.asList(x,y)); 
    }
}
