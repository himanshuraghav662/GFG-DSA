class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        ArrayList<Integer> list = new ArrayList<>(arr.length);
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int flag=0;
        while(i<=j){
            if(flag==1){
                 list.add(arr[i]);
                 i++;
                 flag=0;
            }else{
                 list.add(arr[j]);
                 j--;
                 flag=1;
            }
           
        }
    return list;    
    }
}
