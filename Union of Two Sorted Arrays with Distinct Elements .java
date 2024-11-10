class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
          ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        
        for(int num : a) {
            set.add(num);
        }
        
        for(int num : b) {
            set.add(num);
        }
        ans.addAll(set);
        Collections.sort(ans);
        return ans;
    }
}


////better time complexity//////

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
    int i=0;
    int j=0;
    while(i<a.length || j<b.length){
        if(i==a.length){
            list.add(b[j]);
            j++;
        }else if(j==b.length){
            list.add(a[i]);
            i++;
        } else if(a[i]==b[j]){
            list.add(a[i]);
            i++;
            j++;
        }else if(a[i]<b[j]){
            list.add(a[i]);
            i++;
        }else{
            list.add(b[j]);
            j++;
        }
    }
    return list;
    }
}
