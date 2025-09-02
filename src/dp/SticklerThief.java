package dp;

public class SticklerThief {
    public static int maxLoot(int arr[],int idx){
        if(idx>=arr.length) return 0;
        int steal=arr[idx]+maxLoot(arr,idx+2);
        int skip=maxLoot(arr,idx+1);
        return Math.max(skip,steal);
    }
    public static int SticklerRecursion(int arr[]) {
        return maxLoot(arr,0);
    }

    public static void main(String[] args) {
        int arr[]={6, 5, 5, 7, 4};
        System.out.println(SticklerRecursion(arr));
    }
}
