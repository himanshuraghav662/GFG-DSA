class Solution {
    int getSingle(int arr[]) {
        // code here
        if(arr.length==1)
        return arr[0];
        Arrays.sort(arr);
        int count=1;
        int num=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
            else{
                if(count%2!=0)
                return num;
                num=arr[i];
                count=1;
            }
        }
        return num;
    }
}
