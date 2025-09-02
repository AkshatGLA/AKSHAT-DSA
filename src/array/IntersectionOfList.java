package array;
import java.util.*;
public class IntersectionOfList {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int idx1=0;
        int idx2=0;

        while(idx1<n && idx2<m){
            if(arr1.get(idx1)<arr2.get(idx2)) {
                idx1++;
            }

            else if(arr1.get(idx1)>arr2.get(idx2)) {
                idx2++;
            }

            else if(arr1.get(idx1)==arr2.get(idx2)) {
                ans.add(arr1.get(idx1));
                idx1++;
                idx2++;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 2, 3, 3));
        int n=list1.size();
        int m=list2.size();

        System.out.println(findArrayIntersection(list1,n,list2,m));
    }
}
