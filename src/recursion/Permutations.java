package recursion;

public class Permutations {
    public static void printPermutations(String str,String ans){

        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);

            String remain=left+right;

            printPermutations(remain,ans+ch);
        }
    }
    public static void main(String[] args) {
        printPermutations("112","");
    }
}
