package array;

public class Q1_SecLarge {
    public static int secLarge(int arr[]){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>secMax) secMax=arr[i];
        }
        if(secMax==Integer.MIN_VALUE) return -1;
        return secMax;

    }
    public static void main(String[] args) {
        int arr[]={10, 25, -12, -6, 20, 20};
        int arr2[]={-12, 14, -15, -17, 20};
        int arr3[]={-20, -30, 40, 25, 10};
        int arr4[]={1,1,1,1,1,1};
        System.out.println(secLarge(arr));
        System.out.println(secLarge(arr2));
        System.out.println(secLarge(arr3));
        System.out.println(secLarge(arr4));
    }
}
