package recursion;

public class FirstOccurence {
    public static int firstOccur(int arr[],int idx,int num){
        if(idx==arr.length) return -1;
        if(arr[idx]==num) return idx;
        else return firstOccur(arr,idx+1,num);
    }

    public static int lastOccur(int arr[],int idx,int num){
        if(idx<0) return -1;
        if(arr[idx]==num) return idx;
        else return lastOccur(arr,idx-1,num);
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,6};

        System.out.println(firstOccur(arr,0,3));
        System.out.println(lastOccur(arr,arr.length-1,6));
    }
}
