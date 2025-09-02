package recursion;

public class FirstKMultiples {

    public static void kMulti(int num,int k){
        if(k==0) return;
        kMulti(num,k-1);
        System.out.println(num+"x"+k+"="+num*k+" ");
    }

    public static void main(String[] args) {

        kMulti(25,10);
    }

}
