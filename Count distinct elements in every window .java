class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<k){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(j==k-1){
                list.add(map.size());
            }
            j++;
        }
        while(j<arr.length){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            map.put(arr[i],map.get(arr[i])-1);
            if(map.get(arr[i])==0){ map.remove(arr[i]);}
            list.add(map.size());
            i++;
            j++;
        }
        return list;
    }
}
