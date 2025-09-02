package recursion;

public class AlternateSumOfDigits {
    public static int altSum(int n){
        if(n==0) return 0;
        int ans=0;
        if(n%2==0){
            ans-=altSum(n--);
        }else{
            ans+=altSum(n--);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(altSum(10));
    }
}
