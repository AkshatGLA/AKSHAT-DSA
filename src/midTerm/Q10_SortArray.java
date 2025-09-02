package midTerm;

import java.util.Arrays;

/*
Q:-10 EASSY Sort an Array.
Given an array of integers nums, sort the array in ascending order and
return it.
You must solve the problem without using any built-in functions in
O(nlog(n)) time complexity and with the smallest space complexity
possible.
Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are
not changed (for example, 2 and 3), while the positions of other numbers
are changed (for example, 1 and 5).
Example 2:
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
Constraints:
1 <= nums.length <= 5 * 104 -5 * 104 <= nums[i] <= 5 * 104
 */
public class Q10_SortArray {
    public static void sort(int arr[], int l, int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[i+l];
        for(int i=0;i<n2;i++) right[i]=arr[mid+i+1];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]) arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];
    }
    public static void sort(int arr[], int l, int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        sort(arr,l,mid,r);
    }
    public static int partition(int arr[],int st,int end){
        int pivot=arr[(st+end)/2];
        while(arr[st]<pivot) st++;
        while(arr[end]>pivot) end--;
        if(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return st;
    }
    public static void quickSort(int arr[],int st,int end){
        int pivot_index=partition(arr,st,end);
        if(st<pivot_index-1) quickSort(arr,st,pivot_index-1);
        if(pivot_index<end) quickSort(arr,pivot_index,end);
    }

    public static void main(String[] args) {
        int arr[]={5,1,1,2,0,0};
        int arr2[]={5,2,3,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        quickSort(arr2,0,arr2.length-1);
        System.out.println(Arrays.toString(arr2));

    }
}
