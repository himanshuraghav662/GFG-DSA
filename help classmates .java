class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	     Stack<Integer> s =new Stack<Integer>();
        int[] a =new int[n];
        for(int i=n-1;i>=0;i--){
            if(s.empty()==true){
                a[i]=-1;
            }
            else if(s.empty()!=true && s.peek()>=arr[i]){
                while(s.empty()!=true && s.peek()>=arr[i]){
                    s.pop();
                }
                if(s.empty()==true)
                a[i]=-1;
                else
                a[i]=s.peek();
            }
            else{
            a[i]=s.peek();
            }
            
            s.push(arr[i]);
        }
        return a;
	} 
}
