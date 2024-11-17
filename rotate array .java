class Solution {
       private static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    static void rotateArr(int arr[], int d) {
     int n = arr.length;
     
        d = d % n; 
    
        reverse(arr, 0, d - 1);
        
        reverse(arr, d, n - 1);
        
        reverse(arr, 0, n - 1);
    }    
}
