class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        if(size==1)
        return a[0];
        int count=0;
        int e=0;
        for(int i=0;i<size;i++){
         if(count==0 && i!=size-1){
             e=a[i];
             count++;
         }  
         else if(e==a[i]){
             count++;
         }
         else{
             count--;
         }
        }
        if(count>0){
            return e;
        }
        else{
            return -1;
        }
    }
}
