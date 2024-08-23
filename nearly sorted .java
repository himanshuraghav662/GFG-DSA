class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int i=0;i<num;i++){
            min.add(arr[i]);
            if(i>=k){
                list.add(min.peek());
                min.remove();
            }
        }
        for(int i=0;i<k;i++){
            list.add(min.peek());
            min.remove();
        }
        return list;
    }
}
