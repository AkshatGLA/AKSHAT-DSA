import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ch >= 48 && ch <= 57) {
                String s = "" + ch;
                st.push(s);
            }else{
                String s="";
                String v2=st.pop();
                String v1=st.pop();
                s+=ch+v1+v2;
                st.push(s);
            }
        }
        System.out.println(st.peek());
//-9/*+5346
    }
}
