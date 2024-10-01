class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]) && map.get(arr[i])==1)
            list.add(arr[i]);
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Collections.sort(list);
        
        if(list.size()==0){
        list.add(-1);
        return list;
        }
        else
        return list;
    }
}
