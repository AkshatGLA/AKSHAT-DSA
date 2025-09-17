package array;

public class KokoBananas {
    public static int max(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static boolean kokoEatBananas(int [] piles, int h, int s) {
        int totalTime=0;
        for (int bananas : piles) {
            totalTime += (bananas + s - 1) / s; // ceil(bananas / s)
        }
        if(totalTime<=h) return true;
        else return false;
    }
    public static void main(String[] args) {
        int []piles = {805306368,805306368,805306368};
        int h = 1000000000;
        int end=max(piles);
        int st=1;
        int ans=0;
        while(st<=end){
            int mid=(st+end)/2;
            if(kokoEatBananas(piles, h, mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        System.out.println(ans);
    }
}
