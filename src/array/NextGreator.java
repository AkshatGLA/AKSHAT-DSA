package array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreator {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int ans[]=new int[arr.length];
        int n=arr.length-1;
        ans[n]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n]);
        for(int i=n;i>=0;i--){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(!st.isEmpty()) ans[i]=st.peek();
            if(st.isEmpty()) ans[i]=-1;
            st.push(arr[i]);

        }
        System.out.println(Arrays.toString(ans));
    }
}
