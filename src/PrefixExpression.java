import java.util.*;

public class PrefixExpression {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        Stack<String> st=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            int ascii=(int) ch;

            if(ch>=48 && ch<=57){

                String s=""+ch;
//                s+=ch;
                st.push(s);


            }else if(op.size()==0 || op.peek()=='(' || ch=='('){

                op.push(ch);

            }else if(ch==')'){

                while(op.peek()!='('){
                    String s="";

                    String v2=st.pop();
                    String v1=st.pop();
                    char opr=op.pop();

                    s+=opr+v1+v2;

                    st.push(s);

                }
                op.pop();
            }

            else{

                if(ch=='+' || ch=='-'){

                    String s="";

                    String v2=st.pop();
                    String v1=st.pop();
                    char opr=op.pop();

                    s+=opr+v1+v2;
                    st.push(s);
                    op.push(ch);
                }
                if(ch=='/' || ch=='*'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String s="";

                        String v2=st.pop();
                        String v1=st.pop();
                        char opr=op.pop();

                        s+=opr+v1+v2;
                        st.push(s);
                        op.push(ch);
                    }else op.push(ch);
                }

            }

        }
        while(st.size()>1){
            String s="";

            String v2=st.pop();
            String v1=st.pop();
            char opr=op.pop();

            s+=opr+v1+v2;
            st.push(s);

        }

        System.out.print(st.peek());
    }
}