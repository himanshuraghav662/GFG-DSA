class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int lar=arr[0];
        int sec=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                sec=lar;
                lar=arr[i];
            }
            else{
                if(arr[i]>sec)
                sec=arr[i];
            }
        }
        return sec+lar;
    }
}
