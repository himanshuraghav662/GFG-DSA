class Solution {
    void reverse(int[] arr , int pivot){
        int i=pivot+1;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr,-1);
        }else{
           int swap=pivot+1;
            for(int i=pivot+1;i<arr.length;i++){
                if(arr[i]<arr[swap] && arr[i]>arr[pivot])
                swap=i;
            }
             int temp=arr[pivot];
            arr[pivot]=arr[swap];
            arr[swap]=temp;
            
            reverse(arr,pivot);
        }
    }
}
