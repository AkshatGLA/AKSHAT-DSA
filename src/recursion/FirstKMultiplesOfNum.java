package recursion;

public class FirstKMultiplesOfNum {
    public static void kMultiples(int num,int k){
        if(k==1){
            System.out.print(num+" ");
            return;
        }
        kMultiples(num,k-1);
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        kMultiples(12,5);
    }
}
