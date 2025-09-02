import java.util.*;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String> st=new Stack<>();
        for(int i=str.length()-1;i>=0;i--) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ch >= 48 && ch <= 57) {
                String s = "" + ch;
                st.push(s);
            }else{
                String s="";
                String v1=st.pop();
                String v2=st.pop();
                s+=v1+v2+ch;
                st.push(s);
            }
        }
        System.out.println(st.peek());
    }
}