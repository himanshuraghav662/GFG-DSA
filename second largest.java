class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        int max=arr[0];
        int m2=0;
        for(int i=1;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
          }  
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]>m2 && arr[i]<max){
               m2=arr[i];
           } 
        }
        if(m2==0){
            return -1;
        }
        else{
            return m2;
        }
    }
}
