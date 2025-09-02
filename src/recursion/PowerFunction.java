package recursion;

public class PowerFunction {
    public static int pow(int p,int q){
        if(q==0) return 1;
        return p*pow(p,q-1);
    }
    public static double pow2(double p,int q){
        if(q==0) return 1;
        double half=pow2(p,q/2);
        if(q%2==0) return half*half;
        else return half*half*p;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,8));
        double p=2;
        int q=-2;
        if(q<0) {
            p = 1 / p;
            q = -q;
        }
        System.out.println(pow2(p,q));
    }
}
