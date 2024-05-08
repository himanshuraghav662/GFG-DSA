class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(arr[i]>a){
                b=a;
                a=arr[i];
            }
            if(arr[i]>b && arr[i]<a)
            b=arr[i];
        }
        if(b==0)
        return -1;
        else
        return b;
    }
}
