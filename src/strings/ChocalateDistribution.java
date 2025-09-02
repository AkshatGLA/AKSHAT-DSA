package strings;

/*
string s="abcdef"  %3==0
 ab
 cd
 ef

 string s="abcdefg" %3==1
 ab
 cde
 fg

 string s="abcdefgh" %3==2
 abc
 de
 fgh
 */

public class ChocalateDistribution {
    public static void main(String[] args) {
        String s="abcdefghijkl";
        int length=s.length();

        if(length%3==0){
            int sub_len=length/3;
            System.out.println(s.substring(0,sub_len));
            System.out.println(s.substring(sub_len,2*sub_len));
            System.out.println(s.substring(2*sub_len,length));
        }
        char a =1;
        char b=2;
        System.out.println(a+b);
    }
}
