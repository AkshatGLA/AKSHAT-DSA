package recursion;

public class NthFibonacci {
    public static int f(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<13;i++){
            System.out.print(f(i)+" ");
        }
    }
}
