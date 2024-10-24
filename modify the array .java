class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
           if(i==arr.length-1 && arr[i]!=0)
           list.add(arr[i]);
           else if(arr[i]==arr[i+1]){
               int temp=arr[i]+arr[i];
               list.add(temp);
               i++;
           }
           else if(arr[i]==0)
           continue;
           else
           list.add(arr[i]);
        }
        int i=list.size();
        while(i<arr.length){
            list.add(0);
            i++;
        }
    return list;    
    }
}
