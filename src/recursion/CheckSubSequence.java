package recursion;

public class CheckSubSequence {
    public static boolean helper(String str1,String str2, String help){
        if(str2.length()==0){
            System.out.println(help);
            return help.equals(str1);
        }

        char first=str2.charAt(0);
        String remain=str2.substring(1);

        return helper(str1,remain,help) || helper(str1,remain,help+first);
    }
    public static String isSubsequence(String str1, String str2) {
        if(helper(str1,str2,"")) return "True";
        return "False";
    }

    public static void main(String[] args) {
        System.out.println(helper("AE","BADE",""));
    }
}
