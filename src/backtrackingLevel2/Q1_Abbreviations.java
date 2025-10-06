package backtrackingLevel2;

public class Q1_Abbreviations {
    public static void subsequence(String str, String ans){

        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char first=str.charAt(0);
        String remain=str.substring(1);
        subsequence(remain,ans+first);
        subsequence(remain,ans);
    }

    public static void abbreviation(String str,String ans,int count){

        if(str.length()==0){
            if(count==0){
                System.out.print(ans+" ");
            }else{
                System.out.print(ans+count+" ");
            }
            return;
        }
        char ch=str.charAt(0);
        String remain=str.substring(1);
        if(count==0){
            abbreviation(remain,ans+ch,0);
        }else{
            abbreviation(remain,ans+count+ch,0);
        }

        abbreviation(remain,ans,count+1);
    }
    public static void main(String[] args) {
        String str="ANKS";
//        subsequence(str,"");
        abbreviation(str,"",0);
    }
}
