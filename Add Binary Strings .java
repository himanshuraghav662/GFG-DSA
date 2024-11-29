class Solution {
    public String addBinary(String s1,String s2){
        int i=s1.length()-1,j=s2.length()-1,carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0||j>=0||carry>0){
            int a=i>=0?s1.charAt(i--)-'0':0;
            int b=j>=0?s2.charAt(j--)-'0':0;
            int sum=a+b+carry;
            ans.append(sum%2);
            carry=sum/2;
        }
        while(ans.length()>1&&ans.charAt(ans.length()-1)=='0'){
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.reverse().toString();
    }
}
