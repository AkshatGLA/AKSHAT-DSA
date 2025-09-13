package recursion;

public class PrintEncodings {
    static int count=0;
    public static void printEncodings(String str, String ans){
        if(str.length()==0){
            count++;
            System.out.println(ans);
            return;
        }else if(str.length()==1){
            char ch=str.charAt(0);
            if(ch=='0') return;
            else{
                int chValue=ch-'0';
                char code=(char) ('a' + chValue - 1);
//                ans=ans+code;
                count++;
                System.out.println(ans+code);
            }
        }else{
            char ch=str.charAt(0);
            String remain=str.substring(1);
            if(ch=='0') return;
            else{
                int chValue=ch-'0';
                char code=(char)('a' + chValue - 1);
                printEncodings(remain,ans+code);
            }
            String chFirstTwo=str.substring(0,2);
            String remain2=str.substring(2);

            int chFirstTwoValue=Integer.parseInt(chFirstTwo);
            if(chFirstTwoValue<=26){
                char code=(char)('a' + chFirstTwoValue - 1);
                printEncodings(remain2,ans+code);
            }
        }

    }
    public static void main(String[] args) {
        printEncodings("12","");
        System.out.println(count);
    }
}
