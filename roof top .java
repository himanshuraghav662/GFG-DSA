class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int max=0;
        for(int i=1;i<arr.length;i++){
            int local=0;
            while(arr[i]>arr[i-1]){
                local++;
                i++;
                if(i>=arr.length)
                break;
            }
            if(local>max)
            max=local;
        }
        return max;
    }
}
