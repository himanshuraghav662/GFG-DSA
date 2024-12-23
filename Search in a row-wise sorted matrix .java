class Solution {
    boolean bs(int[] arr ,int x){
        int start=0;
        int end=arr.length-1;
      while(start<=end){
      int mid=(start+end)/2;
        if(arr[mid]==x){
            return true;
        }else if(arr[mid]>x){
            end=mid-1;
        }else{
            start=mid+1;
        }
       }
       return false;
      }
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n=mat[0].length;
        for(int[] arr : mat){
            if(bs(arr,x)==true){
                return true;
            }
        }
        return false;
    }
}
