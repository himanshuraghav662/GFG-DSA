class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int count=0;
        int first=0;
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=i+1){
                if(count==0)
                first=i;
            count++;
            if(count>4)
            return false;
            }
        }
        if(count==2)
        return false;
        if(count==4){
            if(arr.get(arr.get(first)-1)!=first+1)
            return false;
        }
        return true;
    }
}
