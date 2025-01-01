class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
    HashMap<String,ArrayList<String>> map=new HashMap<>();
    ArrayList<ArrayList<String>> ans=new ArrayList<>();
    for(String str : arr){
        char[] c=str.toCharArray();
        Arrays.sort(c);
        String sort=new String(c);
        if(map.containsKey(sort)==false){
            map.put(sort,new ArrayList<>());
        }
        map.get(sort).add(str);
    }
    for(ArrayList<String> al: map.values()){
        ans.add(al);
    }
    return ans;
  }
}
