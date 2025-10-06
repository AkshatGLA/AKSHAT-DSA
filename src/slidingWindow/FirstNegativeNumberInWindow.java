package slidingWindow;

import java.util.*;

public class FirstNegativeNumberInWindow {
    public static void main(String[] args) {
        int arr[]={12, -1, -7, 8, -15, 30, 16, 28};
        int n=arr.length;
        int k=3;
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0) q.add(arr[i]);
        }
        if(q.isEmpty()) ans.add(0);
        else ans.add(q.peek());

        for(int i=1;i<n-k+1;i++){
            int prev=arr[i-1];
            int next=arr[i+k-1];
            if(!q.isEmpty() && prev==q.peek()){
                q.remove();
            }
            if(next<0) q.add(next);
            if(!q.isEmpty()) ans.add(q.peek());
            else ans.add(0);
        }
        System.out.println(ans);

    }
}
