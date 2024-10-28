class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();
        list.add(arr[0]);
        map.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(map.contains(arr[i])!= true){
                list.add(arr[i]);
                map.add(arr[i]);
            }
        }
        return list;
    }
}
