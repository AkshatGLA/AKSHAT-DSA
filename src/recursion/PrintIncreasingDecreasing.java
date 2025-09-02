package recursion;

public class PrintIncreasingDecreasing {
    public static void increasing(int n){
        if(n==0) return;
        increasing(n-1);
        System.out.print(n+" ");
    }
    public static void decreasing(int n){
        if(n==0) return;
        System.out.print(n+" ");
        decreasing(n-1);
    }
    public static void pdi(int n){
        if(n==0) return;
        System.out.print(n+" ");
        pdi(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=5;
        pdi(n);
    }
}
